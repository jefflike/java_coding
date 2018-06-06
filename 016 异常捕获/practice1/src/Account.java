public class Account {
    private int id ;
    private double balance;
    private double annualInterestRate;

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

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return getMonthlyInterestRate()*balance;
    }

    public void withdraw(double money) throws AccountException{
        if(money > balance){
            throw new AccountException("你的钱不够");
        }
        balance -= money;
    }

    public void deposit(double money)throws AccountException{
        if(money < 0){
            throw new AccountException("你取假钱吧");
        }
        balance += money;
    }
}
