
import java.util.Scanner;
public class Stdin {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=scn.nextLine();
        System.out.println("Enter the usn");
        int usn=scn.nextInt();
        System.out.println("Enter the phone number");
        long phno=scn.nextLong();
        System.out.println("enter the fees");
        double fees=scn.nextDouble();
        System.out.println("enter the gender");
        Boolean gender=scn.nextBoolean();
        
    }
}
