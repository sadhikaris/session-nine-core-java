package day2;

public class BankOfAmericaApp {

    public static void main(String[] args) {

        BankAccount sudipAccount = new BankAccount();
        sudipAccount.accountNumber = "123456789";
        sudipAccount.accountBalance = 123456789;
        sudipAccount.accountType = "saving";
        sudipAccount.accountHolderName= "Sudip";
        sudipAccount.address = "EULESS,TX";
        sudipAccount.socialSecurityNumber = "123456789";
        sudipAccount.bsbNumber= "123";

        System.out.println(sudipAccount.accountBalance);

        BankAccount account2 = new BankAccount();

    }
}
