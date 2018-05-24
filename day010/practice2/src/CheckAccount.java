public class CheckAccount extends Account{
    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(){}

    public CheckAccount (int id, double balance, double annualInterestRate, double overdraft ){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw (double amount){
        if(amount > getBalance()+ overdraft){
            System.out.println("你的钱不够够");
            System.out.println("你的余额："+ getBalance());
            System.out.println("你的可透支余额："+ overdraft);
        }else if(amount > getBalance() && amount < getBalance()+overdraft){
            System.out.println("你的余额：0.0");
            overdraft = overdraft-(amount - getBalance());
            System.out.println("你的可透支余额："+ overdraft);
            setBalance(0);
        } else {
            setBalance(getBalance() - amount);
//            getBalance() -= amount;
            System.out.println("你的余额："+ getBalance());
//            System.out.println("月利率："+ getMonthlyInterest());
            System.out.println("你的可透支余额："+ overdraft);
        }
    }

//    @Override
//    public void deposit (double amount){
//
//        //balance += amount;
//        System.out.println("你的余额："+ getBalance());
//        System.out.println("月利率："+ getMonthlyInterest());
//    }
}
