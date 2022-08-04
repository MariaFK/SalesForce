package testdata;

import models.NewAccountModel;
import utils.FakerMessageGeneraror;

public class PrepareNewAccounDate {

    public static NewAccountModel getValidData(){
        return NewAccountModel.builder()
                .accountName(FakerMessageGeneraror.generateAccountName())
                .phone(FakerMessageGeneraror.generatePhoneAndFax())
                .fax(FakerMessageGeneraror.generatePhoneAndFax())
                .website(FakerMessageGeneraror.generateWebsite())
                .type("Analyst")
                .employees(FakerMessageGeneraror.generateNumberOfEmployees())
                .industry("Engineering")
                .annualRevenue(FakerMessageGeneraror.generateAnnualRevenue())
                .description("HTP resident")
                .billingStreet(FakerMessageGeneraror.generateBillingStreet())
                .billingCity(FakerMessageGeneraror.generateBillingCity())
                .billingStateProvince(FakerMessageGeneraror.generateBillingStateProvince())
                .billingZipCode(FakerMessageGeneraror.generateBillingPostalCode())
                .billingCountry(FakerMessageGeneraror.generateBillingCountry())
                .build();
    }
}
