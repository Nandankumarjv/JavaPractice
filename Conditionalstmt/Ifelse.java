
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the four number");
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int num3=scn.nextInt();
        int num4=scn.nextInt();

        if(num1>num2&&num1>num3&&num1>num4){
            System.out.println("number 1 is greater");
        }
        else if(num2>num1&&num2>num3&&num3>num4){
            System.out.println("number 2 is greater");
        }
        else if(num3>num1&&num3>num2&&num3>num4){
            System.out.println("number 3 is greater");
        }
        else{
            System.out.println("number 4 is greater");
        }
    }
}
