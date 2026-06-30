import java.util.Scanner;
public class Isprime {
 public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
        Boolean prime=true;
        if(num<=1){
            prime=false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                prime=false;
            }
        }
        System.out.println(prime ? true : false);
 }   
}
