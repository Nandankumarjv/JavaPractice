

public class Fact {
    public static void main(String args[]){
        System.out.println("enter the number to find factorial");
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
       System.out.println(fact); 
    }
}
