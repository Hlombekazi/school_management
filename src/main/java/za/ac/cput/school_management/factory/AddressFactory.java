/*
 * AddressFactory.java
 * Factory class for Address class
 * Author: Siyamtanda Tonjeni(217107958)
 * Date: 10 June 2022
 */
package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.geography.City;
import za.ac.cput.school_management.util.helper;

public class AddressFactory {
    public static Address buildAddress(String unitNumber, String complexName,String streetNumber, String streetName, String postalCode, City city){

        helper.setEmptyIfNull(unitNumber);
        helper.setEmptyIfNull(complexName);

        helper.isEmptyOrNull(streetNumber);
        helper.isEmptyOrNull(streetName);

    if (postalCode.length() >= 1000 && postalCode.length() <= 9999)
        throw new IllegalArgumentException("Postal code must be between 1000 and 9999");


        return new Address.Builder()
                .setUnitNumber(unitNumber)
                .setComplexName(complexName)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setPostalCode(postalCode)
                .setCity(city)
                .builder();
    }
}
