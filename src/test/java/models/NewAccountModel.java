package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewAccountModel {

    private String accountName;
    private String phone;
    private String type;
    private String fax;
    private String website;
    private String employees;
    private String industry;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String billingCity;
    private String billingStateProvince;
    private String billingZipCode;
    private String billingCountry;

}
