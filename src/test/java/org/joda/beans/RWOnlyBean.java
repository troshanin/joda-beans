/*
 *  Copyright 2001-2011 Stephen Colebourne
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
package org.joda.beans;

import java.util.Map;

import org.joda.beans.impl.BasicBeanBuilder;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock used for test equals.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class RWOnlyBean extends DirectBean {

    /**
     * The read only property.
     */
    @PropertyDefinition(set = "")
    private Object ro;

    /**
     * The write only property.
     */
    @PropertyDefinition(get = "")
    private Object wo;

    /**
     * A manual get property, no set.
     */
    @PropertyDefinition(get = "manual", set = "")
    @SuppressWarnings("unused")
    private String manualGet;

    public String getManualGet() {
        return "goo";
    }

    /**
     * Gets the value of a derived property.
     * 
     * @return derived
     */
    @DerivedProperty
    public String getDerived() {
        return "drv";
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code RWOnlyBean}.
     * @return the meta-bean, not null
     */
    public static RWOnlyBean.Meta meta() {
        return RWOnlyBean.Meta.INSTANCE;
    }

    @Override
    public RWOnlyBean.Meta metaBean() {
        return RWOnlyBean.Meta.INSTANCE;
    }

    @Override
    protected Object propertyGet(String propertyName) {
        switch (propertyName.hashCode()) {
            case 3645:  // ro
                return getRo();
            case 3800:  // wo
                throw new UnsupportedOperationException("Property cannot be read: wo");
            case 93508016:  // manualGet
                return getManualGet();
            case 1556125213:  // derived
                return getDerived();
        }
        return super.propertyGet(propertyName);
    }

    @Override
    protected void propertySet(String propertyName, Object newValue) {
        switch (propertyName.hashCode()) {
            case 3645:  // ro
                throw new UnsupportedOperationException("Property cannot be written: ro");
            case 3800:  // wo
                setWo((Object) newValue);
                return;
            case 93508016:  // manualGet
                throw new UnsupportedOperationException("Property cannot be written: manualGet");
            case 1556125213:  // derived
                throw new UnsupportedOperationException("Property cannot be written: derived");
        }
        super.propertySet(propertyName, newValue);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            RWOnlyBean other = (RWOnlyBean) obj;
            return JodaBeanUtils.equal(getRo(), other.getRo()) &&
                    JodaBeanUtils.equal(wo, other.wo) &&
                    JodaBeanUtils.equal(getManualGet(), other.getManualGet()) &&
                    JodaBeanUtils.equal(getDerived(), other.getDerived());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(getRo());
        hash += hash * 31 + JodaBeanUtils.hashCode(wo);
        hash += hash * 31 + JodaBeanUtils.hashCode(getManualGet());
        hash += hash * 31 + JodaBeanUtils.hashCode(getDerived());
        return hash;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the read only property.
     * @return the value of the property
     */
    public Object getRo() {
        return ro;
    }

    /**
     * Gets the the {@code ro} property.
     * @return the property, not null
     */
    public final Property<Object> ro() {
        return metaBean().ro().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the write only property.
     * @param wo  the new value of the property
     */
    public void setWo(Object wo) {
        this.wo = wo;
    }

    /**
     * Gets the the {@code wo} property.
     * @return the property, not null
     */
    public final Property<Object> wo() {
        return metaBean().wo().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the the {@code manualGet} property.
     * @return the property, not null
     */
    public final Property<String> manualGet() {
        return metaBean().manualGet().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the the {@code derived} property.
     * 
     * @return the property, not null
     */
    public final Property<String> derived() {
        return metaBean().derived().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code RWOnlyBean}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code ro} property.
         */
        private final MetaProperty<Object> ro = DirectMetaProperty.ofReadOnly(
                this, "ro", RWOnlyBean.class, Object.class);
        /**
         * The meta-property for the {@code wo} property.
         */
        private final MetaProperty<Object> wo = DirectMetaProperty.ofWriteOnly(
                this, "wo", RWOnlyBean.class, Object.class);
        /**
         * The meta-property for the {@code manualGet} property.
         */
        private final MetaProperty<String> manualGet = DirectMetaProperty.ofReadOnly(
                this, "manualGet", RWOnlyBean.class, String.class);
        /**
         * The meta-property for the {@code derived} property.
         */
        private final MetaProperty<String> derived = DirectMetaProperty.ofReadOnly(
                this, "derived", RWOnlyBean.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<Object>> map = new DirectMetaPropertyMap(
                this, null,
                "ro",
                "wo",
                "manualGet",
                "derived");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3645:  // ro
                    return ro;
                case 3800:  // wo
                    return wo;
                case 93508016:  // manualGet
                    return manualGet;
                case 1556125213:  // derived
                    return derived;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends RWOnlyBean> builder() {
            return new BasicBeanBuilder<RWOnlyBean>(new RWOnlyBean());
        }

        @Override
        public Class<? extends RWOnlyBean> beanType() {
            return RWOnlyBean.class;
        }

        @Override
        public Map<String, MetaProperty<Object>> metaPropertyMap() {
            return map;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code ro} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Object> ro() {
            return ro;
        }

        /**
         * The meta-property for the {@code wo} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Object> wo() {
            return wo;
        }

        /**
         * The meta-property for the {@code manualGet} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> manualGet() {
            return manualGet;
        }

        /**
         * The meta-property for the {@code derived} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> derived() {
            return derived;
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
