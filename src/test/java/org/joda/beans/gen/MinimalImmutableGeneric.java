/*
 *  Copyright 2001-present Stephen Colebourne
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

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Set;
import org.joda.beans.Property;

/**
 * Mock minimal bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(style = "minimal")
public final class MinimalImmutableGeneric<T extends Number> implements ImmutableBean, Serializable {

    /**
     * The number.
     */
    @PropertyDefinition
    private final T number;
    /**
     * The number.
     */
    @PropertyDefinition
    private final List<T> list;
    /**
     * The number.
     */
    @PropertyDefinition
    private final Map<String, T> map;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code MinimalImmutableGeneric}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static MinimalImmutableGeneric.Meta meta() {
        return MinimalImmutableGeneric.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code MinimalImmutableGeneric}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Number> MinimalImmutableGeneric.Meta<R> metaMinimalImmutableGeneric(Class<R> cls) {
        return MinimalImmutableGeneric.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(MinimalImmutableGeneric.Meta.INSTANCE);
    }

    /**
     * The serialization version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Returns a builder used to create an instance of the bean.
     * @param <T>  the type
     * @return the builder, not null
     */
    public static <T extends Number> MinimalImmutableGeneric.Builder<T> builder() {
        return new MinimalImmutableGeneric.Builder<>();
    }

    private MinimalImmutableGeneric(
            T number,
            List<T> list,
            Map<String, T> map) {
        this.number = number;
        this.list = (list != null ? ImmutableList.copyOf(list) : null);
        this.map = (map != null ? ImmutableMap.copyOf(map) : null);
    }

    @SuppressWarnings("unchecked")
    @Override
    public MinimalImmutableGeneric.Meta<T> metaBean() {
        return MinimalImmutableGeneric.Meta.INSTANCE;
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
     * Gets the number.
     * @return the value of the property
     */
    public T getNumber() {
        return number;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public List<T> getList() {
        return list;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public Map<String, T> getMap() {
        return map;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder<T> toBuilder() {
        return new Builder<>(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            MinimalImmutableGeneric<?> other = (MinimalImmutableGeneric<?>) obj;
            return JodaBeanUtils.equal(number, other.number) &&
                    JodaBeanUtils.equal(list, other.list) &&
                    JodaBeanUtils.equal(map, other.map);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(number);
        hash = hash * 31 + JodaBeanUtils.hashCode(list);
        hash = hash * 31 + JodaBeanUtils.hashCode(map);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(128);
        buf.append("MinimalImmutableGeneric{");
        buf.append("number").append('=').append(number).append(',').append(' ');
        buf.append("list").append('=').append(list).append(',').append(' ');
        buf.append("map").append('=').append(JodaBeanUtils.toString(map));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code MinimalImmutableGeneric}.
     * @param <T>  the type
     */
    public static final class Meta<T extends Number> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code number} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<T> number = (DirectMetaProperty) DirectMetaProperty.ofImmutable(
                this, "number", MinimalImmutableGeneric.class, Object.class);
        /**
         * The meta-property for the {@code list} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<T>> list = DirectMetaProperty.ofImmutable(
                this, "list", MinimalImmutableGeneric.class, (Class) List.class);
        /**
         * The meta-property for the {@code map} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Map<String, T>> map = DirectMetaProperty.ofImmutable(
                this, "map", MinimalImmutableGeneric.class, (Class) Map.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "number",
                "list",
                "map");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return number;
                case 3322014:  // list
                    return list;
                case 107868:  // map
                    return map;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public MinimalImmutableGeneric.Builder<T> builder() {
            return new MinimalImmutableGeneric.Builder<>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends MinimalImmutableGeneric<T>> beanType() {
            return (Class) MinimalImmutableGeneric.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return ((MinimalImmutableGeneric<?>) bean).getNumber();
                case 3322014:  // list
                    return ((MinimalImmutableGeneric<?>) bean).getList();
                case 107868:  // map
                    return ((MinimalImmutableGeneric<?>) bean).getMap();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code MinimalImmutableGeneric}.
     * @param <T>  the type
     */
    public static final class Builder<T extends Number> extends DirectFieldsBeanBuilder<MinimalImmutableGeneric<T>> {

        private T number;
        private List<T> list;
        private Map<String, T> map;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(MinimalImmutableGeneric<T> beanToCopy) {
            this.number = beanToCopy.getNumber();
            this.list = (beanToCopy.getList() != null ? ImmutableList.copyOf(beanToCopy.getList()) : null);
            this.map = (beanToCopy.getMap() != null ? ImmutableMap.copyOf(beanToCopy.getMap()) : null);
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return number;
                case 3322014:  // list
                    return list;
                case 107868:  // map
                    return map;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Builder<T> set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    this.number = (T) newValue;
                    break;
                case 3322014:  // list
                    this.list = (List<T>) newValue;
                    break;
                case 107868:  // map
                    this.map = (Map<String, T>) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder<T> set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        /**
         * @deprecated Use Joda-Convert in application code
         */
        @Override
        @Deprecated
        public Builder<T> setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        /**
         * @deprecated Use Joda-Convert in application code
         */
        @Override
        @Deprecated
        public Builder<T> setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        /**
         * @deprecated Loop in application code
         */
        @Override
        @Deprecated
        public Builder<T> setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public MinimalImmutableGeneric<T> build() {
            return new MinimalImmutableGeneric<>(
                    number,
                    list,
                    map);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the number.
         * @param number  the new value
         * @return this, for chaining, not null
         */
        public Builder<T> number(T number) {
            this.number = number;
            return this;
        }

        /**
         * Sets the number.
         * @param list  the new value
         * @return this, for chaining, not null
         */
        public Builder<T> list(List<T> list) {
            this.list = list;
            return this;
        }

        /**
         * Sets the {@code list} property in the builder
         * from an array of objects.
         * @param list  the new value
         * @return this, for chaining, not null
         */
        @SafeVarargs
        public final Builder<T> list(T... list) {
            return list(ImmutableList.copyOf(list));
        }

        /**
         * Sets the number.
         * @param map  the new value
         * @return this, for chaining, not null
         */
        public Builder<T> map(Map<String, T> map) {
            this.map = map;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(128);
            buf.append("MinimalImmutableGeneric.Builder{");
            buf.append("number").append('=').append(JodaBeanUtils.toString(number)).append(',').append(' ');
            buf.append("list").append('=').append(JodaBeanUtils.toString(list)).append(',').append(' ');
            buf.append("map").append('=').append(JodaBeanUtils.toString(map));
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
