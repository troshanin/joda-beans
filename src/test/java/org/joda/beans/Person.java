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
package org.joda.beans;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.reflection.ReflectiveMetaBean;

/**
 * Mock person JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
public class Person extends DirectBean<Person> {

    /** The forename. */
    @PropertyDefinition
    private String forename;
    /** The surname. */
    @PropertyDefinition
    private String surname;
    /** The number of cars. */
    @PropertyDefinition
    private int numberOfCars;
    @PropertyDefinition
    private List<Address> addressList;
    @PropertyDefinition
    private Map<String, Address> otherAddressMap;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-property for the {@code forename} property.
     */
    public static final MetaProperty<Person, String> FORENAME = DirectMetaProperty.ofReadWrite(Person.class, "forename", String.class);
    /**
     * The meta-property for the {@code surname} property.
     */
    public static final MetaProperty<Person, String> SURNAME = DirectMetaProperty.ofReadWrite(Person.class, "surname", String.class);
    /**
     * The meta-property for the {@code numberOfCars} property.
     */
    public static final MetaProperty<Person, Integer> NUMBER_OF_CARS = DirectMetaProperty.ofReadWrite(Person.class, "numberOfCars", Integer.TYPE);
    /**
     * The meta-property for the {@code addressList} property.
     */
    @SuppressWarnings("unchecked")
    public static final MetaProperty<Person, List<Address>> ADDRESS_LIST = DirectMetaProperty.ofReadWrite(Person.class, "addressList", (Class<List<Address>>) (Class) List.class);
    /**
     * The meta-property for the {@code otherAddressMap} property.
     */
    @SuppressWarnings("unchecked")
    public static final MetaProperty<Person, Map<String, Address>> OTHER_ADDRESS_MAP = DirectMetaProperty.ofReadWrite(Person.class, "otherAddressMap", (Class<Map<String, Address>>) (Class) Map.class);
    /**
     * The meta-bean for {@code Person}.
     */
    public static final MetaBean<Person> META = ReflectiveMetaBean.of(Person.class);

    //-----------------------------------------------------------------------
    @Override
    public MetaBean<Person> metaBean() {
        return META;
    }

    @Override
    protected Object propertyGet(String propertyName) {
        switch (propertyName.hashCode()) {
            case 467061063:  // forename
                return getForename();
            case -1852993317:  // surname
                return getSurname();
            case 926656063:  // numberOfCars
                return getNumberOfCars();
            case -1377524046:  // addressList
                return getAddressList();
            case 1368089592:  // otherAddressMap
                return getOtherAddressMap();
        }
        throw new NoSuchElementException("Unknown property: " + propertyName);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void propertySet(String propertyName, Object newValue) {
        switch (propertyName.hashCode()) {
            case 467061063:  // forename
                setForename((String) newValue);
                return;
            case -1852993317:  // surname
                setSurname((String) newValue);
                return;
            case 926656063:  // numberOfCars
                setNumberOfCars((int) (Integer) newValue);
                return;
            case -1377524046:  // addressList
                setAddressList((List<Address>) newValue);
                return;
            case 1368089592:  // otherAddressMap
                setOtherAddressMap((Map<String, Address>) newValue);
                return;
        }
        throw new NoSuchElementException("Unknown property: " + propertyName);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename.
     * @return the value of the property
     */
    public String getForename() {
        return forename;
    }
    /**
     * Sets the forename.
     * @param forename  the new value of the property
     */
    public void setForename(String forename) {
        this.forename = forename;
    }
    /**
     * Gets the the {@code forename} property.
     * @return the property, not null
     */
    public Property<Person, String> forename() {
        return FORENAME.createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the surname.
     * @return the value of the property
     */
    public String getSurname() {
        return surname;
    }
    /**
     * Sets the surname.
     * @param surname  the new value of the property
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**
     * Gets the the {@code surname} property.
     * @return the property, not null
     */
    public Property<Person, String> surname() {
        return SURNAME.createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number of cars.
     * @return the value of the property
     */
    public int getNumberOfCars() {
        return numberOfCars;
    }
    /**
     * Sets the number of cars.
     * @param numberOfCars  the new value of the property
     */
    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }
    /**
     * Gets the the {@code numberOfCars} property.
     * @return the property, not null
     */
    public Property<Person, Integer> numberOfCars() {
        return NUMBER_OF_CARS.createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the addressList.
     * @return the value of the property
     */
    public List<Address> getAddressList() {
        return addressList;
    }
    /**
     * Sets the addressList.
     * @param addressList  the new value of the property
     */
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
    /**
     * Gets the the {@code addressList} property.
     * @return the property, not null
     */
    public Property<Person, List<Address>> addressList() {
        return ADDRESS_LIST.createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the otherAddressMap.
     * @return the value of the property
     */
    public Map<String, Address> getOtherAddressMap() {
        return otherAddressMap;
    }
    /**
     * Sets the otherAddressMap.
     * @param otherAddressMap  the new value of the property
     */
    public void setOtherAddressMap(Map<String, Address> otherAddressMap) {
        this.otherAddressMap = otherAddressMap;
    }
    /**
     * Gets the the {@code otherAddressMap} property.
     * @return the property, not null
     */
    public Property<Person, Map<String, Address>> otherAddressMap() {
        return OTHER_ADDRESS_MAP.createProperty(this);
    }

    //-------------------------- AUTOGENERATED END --------------------------
}
