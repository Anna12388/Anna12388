package models;

import com.github.javafaker.Faker;

public class AccountFactory {
    static Faker faker = new Faker();
    public static Account get() {
        return Account.builder()
                .accountName(faker.funnyName().name())
                .phone("3752951888868")
                .fax("36749400")
                .webSite("www.onliner.by")
                .type("Investor")
                .industry("Banking")
                .employees("15")
                .annualRevenue("120")
                .billingCity(faker.address().citySuffix())
                .billingZip_PostalCode("12367")
                .billingState_Provence("56788")
                .billingCountry("34")
                .shippingCity("Hamburg")
                .shippingZip_PostalCode("56789")
                .shippingState_Provence("90678")
                .shippingCountry("Germany")
                .billingStreet("DHL345")
                .shippingStreet("GrosseBleichen")
                .build();
    }
}
