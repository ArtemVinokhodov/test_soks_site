package models;

public class AddressBuilder {
        String houseNumber = "12";
        String streetName = "asd";
        String city = "Kyiv";
        String postCode = "12123";
        String country = "123";



    public String getHouseNumber() {
        return houseNumber;
    }
    public String getStreetName() {
        return streetName;
    }
    public String getCity() {
        return city;
    }
    public String getPostCode() {
        return postCode;
    }
    public String getCountry() {
        return country;
    }

    public AddressBuilder houseNumber (String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }
    public AddressBuilder streetName (String streetName) {
        this.streetName = streetName;
        return this;
    }
    public AddressBuilder city (String city) {
        this.city = city;
        return this;
    }
    public AddressBuilder postCode (String postCode) {
        this.postCode = postCode;
        return this;
    }
    public AddressBuilder country (String country) {
        this.country = country;
        return this;
    }


}

