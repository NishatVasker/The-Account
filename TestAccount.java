   EWU->2020-2-60-209
       Nishat vasker
public static void main(String[] args) {

        Account a = new Account(1122, 20000);

        a.setAnnualInterestRate(4.5);
        a.deposit(3000.0);
        a.withdraw(2500.0);

        System.out.println("Balance: $" +a.getBalance());
        System.out.println("Monthly Interest: " + a.getMonthlyInterest());
        System.out.println("Date Created: " + a.getDateCreated());

    }
}

class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.EWU->2020-2-60-209
       Nishat vasker;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate(EWU->2020-2-60-209
       Nishat vasker);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
donot copy
