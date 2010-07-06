/*
 *  Copyright 2001-2010 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.ArrayList;
import java.util.List;

/**
 * Code generator for a bean.
 * 
 * @author Stephen Colebourne
 */
class BeanGen {

    /** Start marker. */
    private static final String AUTOGENERATED_END = "\t//-------------------------- AUTOGENERATED END --------------------------";
    /** End marker. */
    private static final String AUTOGENERATED_START = "\t//------------------------- AUTOGENERATED START -------------------------";

    /** The content to process. */
    private final List<String> content;
    /** The simple name of the bean class. */
    private final String beanName;
    /** The start position of auto-generation. */
    private final int autoStartIndex;
    /** The end position of auto-generation. */
    private final int autoEndIndex;
    /** The region to insert into. */
    private List<String> insertRegion;

    /**
     * Constructor.
     * @param content  the content to process, not null
     */
    BeanGen(List<String> content) {
        this.content = content;
        this.beanName = parseBeanName();
        if (parseIsBean()) {
            this.autoStartIndex = parseStartAutogen();
            this.autoEndIndex = parseEndAutogen();
            this.insertRegion = content.subList(autoStartIndex + 1, autoEndIndex);
        } else {
            this.autoStartIndex = -1;
            this.autoEndIndex = -1;
            this.insertRegion = null;
        }
    }

    //-----------------------------------------------------------------------
    void process() {
        if (insertRegion != null) {
            List<PropertyGen> props = parseProperties();
            removeOld();
            generateMetaProperties(props);
            generateMetaBean();
            generatePropertyGet(props);
            generatePropertySet(props);
            generateGettersSetters(props);
        }
    }

    //-----------------------------------------------------------------------
    private String parseBeanName() {
        for (int index = 0; index < content.size(); index++) {
            String line = content.get(index).trim();
            int pos = line.indexOf(" class ");
            if (pos >= 0) {
                return line.substring(pos + 7).split(" ")[0];
            }
        }
        throw new RuntimeException("Unable to locate bean name");
    }

    private boolean parseIsBean() {
        for (int index = 0; index < content.size(); index++) {
            String line = content.get(index).trim();
            if (line.contains(" extends DirectBean<" + beanName + "> ")) {
                return true;
            }
        }
        return false;
    }

    private List<PropertyGen> parseProperties() {
        List<PropertyGen> props = new ArrayList<PropertyGen>();
        for (int index = 0; index < content.size(); index++) {
            String line = content.get(index).trim();
            if (line.startsWith("@PropertyDefinition")) {
                props.add(new PropertyGen(content, index, this));
            }
        }
        return props;
    }

    private int parseStartAutogen() {
        for (int index = 0; index < content.size(); index++) {
            String line = content.get(index).trim();
            if (line.contains(" AUTOGENERATED START ")) {
                content.set(index, AUTOGENERATED_START);
                return index;
            }
        }
        for (int index = content.size() - 1; index >= 0; index--) {
            String line = content.get(index).trim();
            if (line.equals("}")) {
                content.add(index, AUTOGENERATED_START);
                return index;
            }
            if (line.length() > 0) {
                break;
            }
        }
        throw new RuntimeException("Unable to locate start autogeneration point");
    }

    private int parseEndAutogen() {
        for (int index = autoStartIndex; index < content.size(); index++) {
            String line = content.get(index).trim();
            if (line.contains(" AUTOGENERATED END ")) {
                content.set(index, AUTOGENERATED_END);
                return index;
            }
        }
        content.add(autoStartIndex + 1, AUTOGENERATED_END);
        return autoStartIndex + 1;
    }

    private void removeOld() {
        insertRegion.clear();
    }

    //-----------------------------------------------------------------------
    private void generateSeparator() {
        insertRegion.add("\t//-----------------------------------------------------------------------");
    }

    private void generateMetaProperties(List<PropertyGen> props) {
        for (PropertyGen prop : props) {
            insertRegion.addAll(prop.generateMetaProperty());
        }
    }

    private void generateMetaBean() {
        insertRegion.add("\t/**");
        insertRegion.add("\t * The meta-bean for {@code " + beanName + "}.");
        insertRegion.add("\t */");
        String line = "\tpublic static final MetaBean<" + beanName + "> META = ReflectiveMetaBean.of(" + beanName + ".class);";
        insertRegion.add(line);
        insertRegion.add("");
        generateSeparator();
        insertRegion.add("\t@Override");
        insertRegion.add("\tpublic MetaBean<" + beanName + "> metaBean() {");
        insertRegion.add("\t\treturn META;");
        insertRegion.add("\t}");
        insertRegion.add("");
    }

    private void generateGettersSetters(List<PropertyGen> props) {
        for (PropertyGen prop : props) {
            generateSeparator();
            insertRegion.addAll(prop.generateGetter());
            insertRegion.addAll(prop.generateSetter());
            insertRegion.addAll(prop.generateProperty());
            insertRegion.add("");
        }
    }

    private void generatePropertyGet(List<PropertyGen> props) {
        insertRegion.add("\t@Override");
        insertRegion.add("\tprotected Object propertyGet(String propertyName) {");
        insertRegion.add("\t\tswitch (propertyName.hashCode()) {");
        for (PropertyGen prop : props) {
            insertRegion.addAll(prop.generatePropertyGetCase());
        }
        insertRegion.add("\t\t}");
        insertRegion.add("\t\tthrow new NoSuchElementException(\"Unknown property: \" + propertyName);");
        insertRegion.add("\t}");
        insertRegion.add("");
    }

    private void generatePropertySet(List<PropertyGen> props) {
        insertRegion.add("\t@Override");
        boolean generics = false;
        for (PropertyGen prop : props) {
            generics |= prop.isGenericType();
        }
        if (generics) {
            insertRegion.add("\t@SuppressWarnings(\"unchecked\")");
        }
        insertRegion.add("\tprotected void propertySet(String propertyName, Object newValue) {");
        insertRegion.add("\t\tswitch (propertyName.hashCode()) {");
        for (PropertyGen prop : props) {
            insertRegion.addAll(prop.generatePropertySetCase());
        }
        insertRegion.add("\t\t}");
        insertRegion.add("\t\tthrow new NoSuchElementException(\"Unknown property: \" + propertyName);");
        insertRegion.add("\t}");
        insertRegion.add("");
    }

    //-----------------------------------------------------------------------
    boolean isBean() {
        return insertRegion != null;
    }

    String getBeanName() {
        return beanName;
    }

}
