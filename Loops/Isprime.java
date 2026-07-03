
import java.util.Scanner;
public class Isprime {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=s.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
            }
        }
        System.out.println(isPrime?true:false);
    }
}
