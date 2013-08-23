/*
 *  Copyright 2001-2013 Stephen Colebourne
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
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.Lists;

/**
 * Mock immutable person JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class PropertyDefBean implements Bean {

    @PropertyDefinition(type = "CharSequence", set = "$field = $value.toString()")
    private String stringAsCharSequence;
    @PropertyDefinition(type = "Integer")
    private int intAsInteger;
    @PropertyDefinition
    private final ArrayList<Address> arrayListSmart = new ArrayList<Address>();
    @PropertyDefinition(type = "")
    private final ArrayList<Address> arrayListExposed = new ArrayList<Address>();
    @PropertyDefinition(type = "Collection")
    private final ArrayList<Address> arrayListAsCollection = new ArrayList<Address>();
    @PropertyDefinition
    private final ArrayList<Address> arrayList = new ArrayList<Address>();
    @PropertyDefinition(type = "Iterable", set = "$field = Lists.newArrayList($value)")
    private List<Address> listAsIterable = new ArrayList<Address>();
    @PropertyDefinition(type = "Iterable", set = "Lists.newArrayList($value)")
    private List<Address> listAsIterableNoField = new ArrayList<Address>();

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code PropertyDefBean}.
     * @return the meta-bean, not null
     */
    public static PropertyDefBean.Meta meta() {
        return PropertyDefBean.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(PropertyDefBean.Meta.INSTANCE);
    }

    @Override
    public PropertyDefBean.Meta metaBean() {
        return PropertyDefBean.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the stringAsCharSequence.
     * @return the value of the property
     */
    public CharSequence getStringAsCharSequence() {
        return stringAsCharSequence;
    }

    /**
     * Sets the stringAsCharSequence.
     * @param stringAsCharSequence  the new value of the property
     */
    public void setStringAsCharSequence(CharSequence stringAsCharSequence) {
        this.stringAsCharSequence = stringAsCharSequence.toString();
    }

    /**
     * Gets the the {@code stringAsCharSequence} property.
     * @return the property, not null
     */
    public final Property<CharSequence> stringAsCharSequence() {
        return metaBean().stringAsCharSequence().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the intAsInteger.
     * @return the value of the property
     */
    public Integer getIntAsInteger() {
        return intAsInteger;
    }

    /**
     * Sets the intAsInteger.
     * @param intAsInteger  the new value of the property
     */
    public void setIntAsInteger(Integer intAsInteger) {
        this.intAsInteger = intAsInteger;
    }

    /**
     * Gets the the {@code intAsInteger} property.
     * @return the property, not null
     */
    public final Property<Integer> intAsInteger() {
        return metaBean().intAsInteger().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the arrayListSmart.
     * @return the value of the property
     */
    public List<Address> getArrayListSmart() {
        return arrayListSmart;
    }

    /**
     * Sets the arrayListSmart.
     * @param arrayListSmart  the new value of the property
     */
    public void setArrayListSmart(List<Address> arrayListSmart) {
        this.arrayListSmart.clear();
        this.arrayListSmart.addAll(arrayListSmart);
    }

    /**
     * Gets the the {@code arrayListSmart} property.
     * @return the property, not null
     */
    public final Property<List<Address>> arrayListSmart() {
        return metaBean().arrayListSmart().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the arrayListExposed.
     * @return the value of the property
     */
    public ArrayList<Address> getArrayListExposed() {
        return arrayListExposed;
    }

    /**
     * Sets the arrayListExposed.
     * @param arrayListExposed  the new value of the property
     */
    public void setArrayListExposed(ArrayList<Address> arrayListExposed) {
        this.arrayListExposed.clear();
        this.arrayListExposed.addAll(arrayListExposed);
    }

    /**
     * Gets the the {@code arrayListExposed} property.
     * @return the property, not null
     */
    public final Property<ArrayList<Address>> arrayListExposed() {
        return metaBean().arrayListExposed().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the arrayListAsCollection.
     * @return the value of the property
     */
    public Collection<Address> getArrayListAsCollection() {
        return arrayListAsCollection;
    }

    /**
     * Sets the arrayListAsCollection.
     * @param arrayListAsCollection  the new value of the property
     */
    public void setArrayListAsCollection(Collection<Address> arrayListAsCollection) {
        this.arrayListAsCollection.clear();
        this.arrayListAsCollection.addAll(arrayListAsCollection);
    }

    /**
     * Gets the the {@code arrayListAsCollection} property.
     * @return the property, not null
     */
    public final Property<Collection<Address>> arrayListAsCollection() {
        return metaBean().arrayListAsCollection().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the arrayList.
     * @return the value of the property
     */
    public List<Address> getArrayList() {
        return arrayList;
    }

    /**
     * Sets the arrayList.
     * @param arrayList  the new value of the property
     */
    public void setArrayList(List<Address> arrayList) {
        this.arrayList.clear();
        this.arrayList.addAll(arrayList);
    }

    /**
     * Gets the the {@code arrayList} property.
     * @return the property, not null
     */
    public final Property<List<Address>> arrayList() {
        return metaBean().arrayList().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the listAsIterable.
     * @return the value of the property
     */
    public Iterable<Address> getListAsIterable() {
        return listAsIterable;
    }

    /**
     * Sets the listAsIterable.
     * @param listAsIterable  the new value of the property
     */
    public void setListAsIterable(Iterable<Address> listAsIterable) {
        this.listAsIterable = Lists.newArrayList(listAsIterable);
    }

    /**
     * Gets the the {@code listAsIterable} property.
     * @return the property, not null
     */
    public final Property<Iterable<Address>> listAsIterable() {
        return metaBean().listAsIterable().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the listAsIterableNoField.
     * @return the value of the property
     */
    public Iterable<Address> getListAsIterableNoField() {
        return listAsIterableNoField;
    }

    /**
     * Sets the listAsIterableNoField.
     * @param listAsIterableNoField  the new value of the property
     */
    public void setListAsIterableNoField(Iterable<Address> listAsIterableNoField) {
        this.listAsIterableNoField = Lists.newArrayList(listAsIterableNoField);
    }

    /**
     * Gets the the {@code listAsIterableNoField} property.
     * @return the property, not null
     */
    public final Property<Iterable<Address>> listAsIterableNoField() {
        return metaBean().listAsIterableNoField().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            PropertyDefBean other = (PropertyDefBean) obj;
            return JodaBeanUtils.equal(getStringAsCharSequence(), other.getStringAsCharSequence()) &&
                    JodaBeanUtils.equal(getIntAsInteger(), other.getIntAsInteger()) &&
                    JodaBeanUtils.equal(getArrayListSmart(), other.getArrayListSmart()) &&
                    JodaBeanUtils.equal(getArrayListExposed(), other.getArrayListExposed()) &&
                    JodaBeanUtils.equal(getArrayListAsCollection(), other.getArrayListAsCollection()) &&
                    JodaBeanUtils.equal(getArrayList(), other.getArrayList()) &&
                    JodaBeanUtils.equal(getListAsIterable(), other.getListAsIterable()) &&
                    JodaBeanUtils.equal(getListAsIterableNoField(), other.getListAsIterableNoField());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(getStringAsCharSequence());
        hash += hash * 31 + JodaBeanUtils.hashCode(getIntAsInteger());
        hash += hash * 31 + JodaBeanUtils.hashCode(getArrayListSmart());
        hash += hash * 31 + JodaBeanUtils.hashCode(getArrayListExposed());
        hash += hash * 31 + JodaBeanUtils.hashCode(getArrayListAsCollection());
        hash += hash * 31 + JodaBeanUtils.hashCode(getArrayList());
        hash += hash * 31 + JodaBeanUtils.hashCode(getListAsIterable());
        hash += hash * 31 + JodaBeanUtils.hashCode(getListAsIterableNoField());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(288);
        buf.append(getClass().getSimpleName());
        buf.append('{');
        buf.append("stringAsCharSequence").append('=').append(getStringAsCharSequence()).append(',').append(' ');
        buf.append("intAsInteger").append('=').append(getIntAsInteger()).append(',').append(' ');
        buf.append("arrayListSmart").append('=').append(getArrayListSmart()).append(',').append(' ');
        buf.append("arrayListExposed").append('=').append(getArrayListExposed()).append(',').append(' ');
        buf.append("arrayListAsCollection").append('=').append(getArrayListAsCollection()).append(',').append(' ');
        buf.append("arrayList").append('=').append(getArrayList()).append(',').append(' ');
        buf.append("listAsIterable").append('=').append(getListAsIterable()).append(',').append(' ');
        buf.append("listAsIterableNoField").append('=').append(getListAsIterableNoField());
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code PropertyDefBean}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code stringAsCharSequence} property.
         */
        private final MetaProperty<CharSequence> stringAsCharSequence = DirectMetaProperty.ofReadWrite(
                this, "stringAsCharSequence", PropertyDefBean.class, CharSequence.class);
        /**
         * The meta-property for the {@code intAsInteger} property.
         */
        private final MetaProperty<Integer> intAsInteger = DirectMetaProperty.ofReadWrite(
                this, "intAsInteger", PropertyDefBean.class, Integer.class);
        /**
         * The meta-property for the {@code arrayListSmart} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<Address>> arrayListSmart = DirectMetaProperty.ofReadWrite(
                this, "arrayListSmart", PropertyDefBean.class, (Class) List.class);
        /**
         * The meta-property for the {@code arrayListExposed} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ArrayList<Address>> arrayListExposed = DirectMetaProperty.ofReadWrite(
                this, "arrayListExposed", PropertyDefBean.class, (Class) ArrayList.class);
        /**
         * The meta-property for the {@code arrayListAsCollection} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Collection<Address>> arrayListAsCollection = DirectMetaProperty.ofReadWrite(
                this, "arrayListAsCollection", PropertyDefBean.class, (Class) Collection.class);
        /**
         * The meta-property for the {@code arrayList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<Address>> arrayList = DirectMetaProperty.ofReadWrite(
                this, "arrayList", PropertyDefBean.class, (Class) List.class);
        /**
         * The meta-property for the {@code listAsIterable} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Iterable<Address>> listAsIterable = DirectMetaProperty.ofReadWrite(
                this, "listAsIterable", PropertyDefBean.class, (Class) Iterable.class);
        /**
         * The meta-property for the {@code listAsIterableNoField} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Iterable<Address>> listAsIterableNoField = DirectMetaProperty.ofReadWrite(
                this, "listAsIterableNoField", PropertyDefBean.class, (Class) Iterable.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "stringAsCharSequence",
                "intAsInteger",
                "arrayListSmart",
                "arrayListExposed",
                "arrayListAsCollection",
                "arrayList",
                "listAsIterable",
                "listAsIterableNoField");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -626353926:  // stringAsCharSequence
                    return stringAsCharSequence;
                case -86092419:  // intAsInteger
                    return intAsInteger;
                case 1202448754:  // arrayListSmart
                    return arrayListSmart;
                case 995586697:  // arrayListExposed
                    return arrayListExposed;
                case 1604480167:  // arrayListAsCollection
                    return arrayListAsCollection;
                case -1425161577:  // arrayList
                    return arrayList;
                case -176766462:  // listAsIterable
                    return listAsIterable;
                case 1831404375:  // listAsIterableNoField
                    return listAsIterableNoField;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends PropertyDefBean> builder() {
            return new DirectBeanBuilder<PropertyDefBean>(new PropertyDefBean());
        }

        @Override
        public Class<? extends PropertyDefBean> beanType() {
            return PropertyDefBean.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code stringAsCharSequence} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<CharSequence> stringAsCharSequence() {
            return stringAsCharSequence;
        }

        /**
         * The meta-property for the {@code intAsInteger} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> intAsInteger() {
            return intAsInteger;
        }

        /**
         * The meta-property for the {@code arrayListSmart} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<Address>> arrayListSmart() {
            return arrayListSmart;
        }

        /**
         * The meta-property for the {@code arrayListExposed} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<ArrayList<Address>> arrayListExposed() {
            return arrayListExposed;
        }

        /**
         * The meta-property for the {@code arrayListAsCollection} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Collection<Address>> arrayListAsCollection() {
            return arrayListAsCollection;
        }

        /**
         * The meta-property for the {@code arrayList} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<Address>> arrayList() {
            return arrayList;
        }

        /**
         * The meta-property for the {@code listAsIterable} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Iterable<Address>> listAsIterable() {
            return listAsIterable;
        }

        /**
         * The meta-property for the {@code listAsIterableNoField} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Iterable<Address>> listAsIterableNoField() {
            return listAsIterableNoField;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -626353926:  // stringAsCharSequence
                    return ((PropertyDefBean) bean).getStringAsCharSequence();
                case -86092419:  // intAsInteger
                    return ((PropertyDefBean) bean).getIntAsInteger();
                case 1202448754:  // arrayListSmart
                    return ((PropertyDefBean) bean).getArrayListSmart();
                case 995586697:  // arrayListExposed
                    return ((PropertyDefBean) bean).getArrayListExposed();
                case 1604480167:  // arrayListAsCollection
                    return ((PropertyDefBean) bean).getArrayListAsCollection();
                case -1425161577:  // arrayList
                    return ((PropertyDefBean) bean).getArrayList();
                case -176766462:  // listAsIterable
                    return ((PropertyDefBean) bean).getListAsIterable();
                case 1831404375:  // listAsIterableNoField
                    return ((PropertyDefBean) bean).getListAsIterableNoField();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -626353926:  // stringAsCharSequence
                    ((PropertyDefBean) bean).setStringAsCharSequence((CharSequence) newValue);
                    return;
                case -86092419:  // intAsInteger
                    ((PropertyDefBean) bean).setIntAsInteger((Integer) newValue);
                    return;
                case 1202448754:  // arrayListSmart
                    ((PropertyDefBean) bean).setArrayListSmart((List<Address>) newValue);
                    return;
                case 995586697:  // arrayListExposed
                    ((PropertyDefBean) bean).setArrayListExposed((ArrayList<Address>) newValue);
                    return;
                case 1604480167:  // arrayListAsCollection
                    ((PropertyDefBean) bean).setArrayListAsCollection((Collection<Address>) newValue);
                    return;
                case -1425161577:  // arrayList
                    ((PropertyDefBean) bean).setArrayList((List<Address>) newValue);
                    return;
                case -176766462:  // listAsIterable
                    ((PropertyDefBean) bean).setListAsIterable((Iterable<Address>) newValue);
                    return;
                case 1831404375:  // listAsIterableNoField
                    ((PropertyDefBean) bean).setListAsIterableNoField((Iterable<Address>) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}