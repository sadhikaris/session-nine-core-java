package day2;

public class BankOfAmericaApp {

    public static void main(String[] args) {

        BankAccount sudipAccount = new BankAccount();

        sudipAccount.accountNumber = "123456789";

        sudipAccount.setAccountBalance(1000);
        sudipAccount.setAccountType("saving");
        sudipAccount.setAccountHolderName("SUDIP Adhikari");
        sudipAccount.setBankName("BofA");
        sudipAccount.setAddress("Euless,TX");
        sudipAccount.setBsbNumber("123");
        sudipAccount.setConnectedMobileNumber("123456789");
        sudipAccount.setSocialSecurityNumber("123456789");


        BankAccount briAccount = new BankAccount();

        briAccount.setAccountBalance(500);
        briAccount.setAccountType("saving");
        briAccount.setAccountHolderName("SUDIP Adhikari");
        briAccount.setBankName("BofA");
        briAccount.setAddress("Euless,TX");
        briAccount.setBsbNumber("123");
        briAccount.setConnectedMobileNumber("123456789");
        briAccount.setSocialSecurityNumber("123456789");


        System.out.println(briAccount.getAccountBalance());
        System.out.println(sudipAccount.getAccountBalance());


        briAccount.setAccountBalance(briAccount.getAccountBalance() + 200);
        sudipAccount.setAccountBalance(sudipAccount.getAccountBalance() - 200);

        System.out.println(briAccount.getAccountBalance());
        System.out.println(sudipAccount.getAccountBalance());






    }





}
