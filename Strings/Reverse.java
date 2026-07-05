
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string:");
        String s1=s.nextLine();
        String original=s1;
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println(reverse);
        }
        else{
            System.out.println(reverse);
        }
        
    }
}
