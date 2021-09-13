import java.util.ArrayList;
import java.util.List;

public class Customers {
    private long accountNumber;
    private String fullName;
    private String address;
    private String phoneNumber;
    private boolean hasSavingsAccount;
    private boolean hasCheckingAccount;
    List<BankAccount> accountList;


    public Customers(long accountNumber, String fullName, String address, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        hasSavingsAccount = false;
        hasCheckingAccount = false;
        accountList = new ArrayList<BankAccount>();
    }

    public void createSavingsAccount(double _balance, double _interestRate){
        if(hasSavingsAccount){
            System.out.println("Already has savings account");
        }
        else{
            BankAccount ba = new SavingsAccount(accountNumber, _balance, _interestRate);
            accountList.add(ba);
            hasSavingsAccount = true;
        }
    }

    public void createCheckingAccount(double _balance){
        if(hasCheckingAccount){
            System.out.println("Already has Checking account");
        }
        else{
            BankAccount ba = new CheckingAccount(accountNumber, _balance);
            accountList.add(ba);
            hasCheckingAccount = true;
        }
    }

    public void deleteSavingsAccount(){
        if(hasSavingsAccount){
            for(int i = 0; i < accountList.size(); i++) {
                if(accountList.get(i) instanceof SavingsAccount)
                {
                    accountList.remove(i);
                    hasSavingsAccount = false;
                }
            }
        }
        else{
            System.out.println("You do not have a savings account");
        }
    }
    public void deleteCheckingAccount(){
        if(hasCheckingAccount){
            for(int i = 0; i < accountList.size(); i++) {
                if(accountList.get(i) instanceof CheckingAccount)
                {
                    accountList.remove(i);
                }
            }
        }
        else{
            System.out.println("You do not have a Checking Account account");
        }
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    void checkBalance(){
        for(int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i) instanceof SavingsAccount)
            {
                System.out.println("Savings Account Balance:");
            }
            else if(accountList.get(i) instanceof CheckingAccount){
                System.out.println("Checking Account Balance");
            }
            accountList.get(i).checkBalance();

        }
    }
    void displayAllAccounts(){
        System.out.println("=================================================");
        System.out.println("Name:          "+ fullName);
        System.out.println("Number         " + phoneNumber);
        System.out.println("Account Number:" +accountNumber);
        System.out.println("Address:       " +address);
        for(int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i) instanceof SavingsAccount)
            {
                System.out.println("Savings Account:");
                System.out.println("----------------");

            }
            else if(accountList.get(i) instanceof CheckingAccount){
                System.out.println("Checking Account");
                System.out.println("----------------");
            }
            System.out.print("Amount:          ");
            accountList.get(i).checkBalance();

        }
    }
    void displayAllDeductions(){
        System.out.println("=================================================");
        System.out.println("Name:          "+ fullName);
        System.out.println("Number         " + phoneNumber);
        System.out.println("Account Number:" +accountNumber);
        System.out.println("Address:       " +address);
        for(int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i) instanceof SavingsAccount)
            {
                System.out.println("Savings Account Deductions:");
                System.out.println("---------------------------");
            }
            else if(accountList.get(i) instanceof CheckingAccount){
                System.out.println("Checking Account Deductions");
                System.out.println("---------------------------");
            }
            accountList.get(i).displayAllDeductions();

        }
    }

}
