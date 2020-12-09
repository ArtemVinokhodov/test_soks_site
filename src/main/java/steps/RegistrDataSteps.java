package steps;

import models.AddressBuilder;

public class RegistrDataSteps {
    String houseNumber = "12";
    String streetName = "asd";
    String city = "Kyiv";
    String postCode = "12123";
    String country = "123";

    RegistrDataSteps(AddressBuilder addressBuilder) {
        this.streetName = streetName;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }



}

