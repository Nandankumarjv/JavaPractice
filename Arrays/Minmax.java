import java.util.Arrays;
public class Minmax {
    public static void main(String[] args){
    int a[]={60,20,5,30,45};
    int max=a[0];
    int min=a[0];
    for(int i=1;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
        else if(a[i]<min){
            min=a[i];
        }
    }
    System.out.println(max+"->"+min);
}
}