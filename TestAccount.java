public class TestAccount {
    public static void main(String[] args) {
        Account a= new Account(1122,20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000.0);
        System.out.println("Balance: "+a.getBalance());
        System.out.println("Monthly Interest rate: "+a.getMonthlyInterestRate());
        System.out.println("Transiction date: "+a.getDateCreated());



    }
}
