package day13_code.src;

/*
* 1、static练习
声明一个银行账户类：有属性账户，余额，活期年利率，
请判断哪些属性是静态的，哪些不是。并测试

某些属性的值发现它不会随着对象的不同而不同，那么这样的属性就应该设计为类变量（静态变量）
这里年利率，不会因为某个对象而不同，大家都一样，所以设计为类变量

*/
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("唐德松",4000);
        Account a2 = new Account("宋梦雨",5000);
        Account.setInterest(0.003);

        System.out.println(a1);
        System.out.println(a2);
    }
}
class Account{
    private static double interest;
    private String id;
    private double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public static double getInterest() {
        return interest;
    }

    public static void setInterest(double interest) {
        Account.interest = interest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "day13_code.src.Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                "，年利率=" + interest*100 + "%" +
                '}';
    }
}
