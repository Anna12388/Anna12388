package models;

public class AccountFactory {
    public static Account get() {
        return Account.builder()
                .accountName("Test1")
                .phone("3752951888868")
                .fax("36749400")
                .webSite("www.onliner.by")
                .type("Investor")
                .industry("Banking")
                .employees("15")
                .annualRevenue("120")
                .billingCity("12345")
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
