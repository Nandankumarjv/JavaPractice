package class9.Encapsulation;

public class Account_main {
    public static void main(String [] args){
        Account obj1=new Account(101,"nandan",12345,1000.10293);
       obj1.getbalance();
        obj1.deposit(500);
        obj1.getbalance();
        obj1.withdraw(3000);
        obj1.getbalance();
    }
}
