package utils;

import com.github.javafaker.Faker;


public class FakerMessageGeneraror {

    public static String generateAccountName() {
        return new Faker().company().name();
    }

    public static String generatePhoneAndFax() {
        return new Faker().phoneNumber().phoneNumber();
    }

    public static String generateWebsite() {
        return new Faker().internet().url();
    }

    public static String generateNumberOfEmployees() {
        return new Faker().number().digit();
    }

    public static String generateAnnualRevenue() {
        return new Faker().number().digit();
    }

    public static String generateBillingStreet(){
        return new Faker().address().streetAddress();
    }
    public static String generateBillingCity() {
        return new Faker().address().city();
    }

    public static String generateBillingStateProvince(){
        return new Faker().address().state();
    }

    public static String generateBillingPostalCode(){
        return new Faker().address().zipCode();
    }

    public static String generateBillingCountry(){
        return new Faker().address().country();
    }

}
