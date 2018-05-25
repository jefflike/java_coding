public class TestAccount {
    public static void main(String[] args){
        Account a = new Account(1122, 20000, 0.045);
        a.withdraw(30000);
        a.withdraw(2500);
        a.deposit(3000);

        CheckAccount c = new CheckAccount(1122, 20000, 0.045, 5000);
        c.withdraw(5000);
        c.withdraw(18000);
        c.withdraw(3000);
    }
}
