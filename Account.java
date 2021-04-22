public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public Account(int id,double balance){
       this.id=id;
       this.balance = balance;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double setAnnualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated(){
        return this.dateCreated.toString();
    }


    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;

    }

    public double getMonthlyInterestAmount(){
        return balance*getMonthlyInterestRate();
    }


    public void withdraw(double amount){
        this.balance -= amount ;
    }

    public void deposit(double amount){
        this.balance+= amount;
    }
}
