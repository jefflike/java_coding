public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account(){}

    public Account (int id, double balance, double annualInterestRate ){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest(){
        return getAnnualInterestRate() / 12;
    }

    public void withdraw (double amount){
        if(amount > balance){
            System.out.println("你的钱不够够");
            System.out.println("你的余额："+ getBalance());
        }else {
            balance -= amount;
            System.out.println("你的余额："+ getBalance());
            System.out.println("月利率："+ getMonthlyInterest());
        }
    }

    public void deposit (double amount){
        balance += amount;
        System.out.println("你的余额："+ getBalance());
        System.out.println("月利率："+ getMonthlyInterest());
    }

}
