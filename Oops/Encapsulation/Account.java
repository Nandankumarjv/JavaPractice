package class9.Encapsulation;

public class Account {
    private int acc_no;
    private String acc_hol_name;
    private int pwd;
    private double balance;
    
    Account(int acc_no,String acc_hol_name,int pwd,double balance){
        this.acc_no=acc_no;
        this.acc_hol_name=acc_hol_name;
        this.pwd=pwd;
        this.balance=balance;
    }
    public int getacc_no(){
        return acc_no;
    }
    public String getacc_name(){
        return acc_hol_name;
    }
    public int getpwd(){
        return pwd;
    }
    public void setpwd(int newPwd){
        pwd=newPwd;
        System.out.println("successfully resetted");
    }
    public void getbalance(){
        System.out.println("Original Balance"+(int)balance);

    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        if(balance<amount){
            System.out.println("insufficient balance--");
        }
        else{
             balance-=amount;
            System.out.println("Successfully withdrawn--"+amount);
        }
    }

}
