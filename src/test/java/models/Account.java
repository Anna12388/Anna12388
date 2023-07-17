package models;

public class Account {
    String accountName;
    String webSite;
    String type;
    String industry;
    String phone;
    String fax;
    String employees;
    String annualRevenue;
    String billingCity;
    String billingZip_PostalCode;
    String billingState_Provence;
    String billingCountry;
    String shippingCity;
    String shippingZip_PostalCode;
    String shippingState_Provence;
    String shippingCountry;
    String description;
    String billingStreet;
    String shippingStreet;

    public Account(String accountName, String webSite, String type, String industry, String phone, String fax, String employees, String annualRevenue, String billingCity, String billingZip_PostalCode, String billingState_Provence, String billingCountry, String shippingCity, String shippingZip_PostalCode, String shippingState_Provence, String shippingCountry, String description, String billingStreet, String shippingStreet) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
        this.industry = industry;
        this.phone = phone;
        this.fax = fax;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.billingCity = billingCity;
        this.billingZip_PostalCode = billingZip_PostalCode;
        this.billingState_Provence = billingState_Provence;
        this.billingCountry = billingCountry;
        this.shippingCity = shippingCity;
        this.shippingZip_PostalCode = shippingZip_PostalCode;
        this.shippingState_Provence = shippingState_Provence;
        this.shippingCountry = shippingCountry;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingZip_PostalCode() {
        return billingZip_PostalCode;
    }

    public void setBillingZip_PostalCode(String billingZip_PostalCode) {
        this.billingZip_PostalCode = billingZip_PostalCode;
    }

    public String getBillingState_Provence() {
        return billingState_Provence;
    }

    public void setBillingState_Provence(String billingState_Provence) {
        this.billingState_Provence = billingState_Provence;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingZip_PostalCode() {
        return shippingZip_PostalCode;
    }

    public void setShippingZip_PostalCode(String shippingZip_PostalCode) {
        this.shippingZip_PostalCode = shippingZip_PostalCode;
    }

    public String getShippingState_Provence() {
        return shippingState_Provence;
    }

    public void setShippingState_Provence(String shippingState_Provence) {
        this.shippingState_Provence = shippingState_Provence;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }
}

