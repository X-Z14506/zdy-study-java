
/*
写一个名为Account的类模拟账户，
        该类包括的属性:账户id，余额balance，年利率annualInterestRate;
        包含的方法:各属性的set和get方法。取款方法withdraw()，存款方法deposit()
        写一个测试程序
        (1）创建一个customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的账户
        (2)对Jane smith操作:
        存入100元，再取出960元，再取出2000.打印Jane smith的基本信息
        
 信息如下显示:
        成功存入: 100
        成功取出:960
        余额不足，取钱失败
 */
public class AccountTest {
    public static void main(String[] args) {
        Account person1 = new Account(1000,2000,1.23);
        Customer customer = new Customer("Jane Smith",1000,person1);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
    }
}
class Customer {
    private String name;
    private int id;
    private Account account;

    public Customer(String name, int id, Account account) {
        this.name = name;
        this.id = id;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
class Account {
    private int id;
    private  double balance;
    private  double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
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
    public  void deposit(double money ) {
        this.setBalance(this.getBalance() + money);
        System.out.println("成功存入："+money);
    }
    public  void withdraw(double money) {
        if (money > this.getBalance()) {
            System.out.println("余额不足，取钱失败");
            return;
        }
        this.setBalance(this.getBalance() - money);
        System.out.println("成功取出："+ money);
    }
}

