import java.util.Arrays;

public class Anagram {
    public static void main(String [] args){
        String s1="listen";
    String s2="silent";
    char arr[]=s1.toCharArray();
    char arr2[]=s2.toCharArray();
    Arrays.sort(arr);
    Arrays.sort(arr2);
    if(Arrays.equals(arr,arr2)){
        System.out.println("anagram");
    }
    else{
        System.out.println("not anagram");
    }
    }
    }
