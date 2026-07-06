package class9.Encapsulation.Practice;

public class Book_details {
    public static void main(String[] args){
        Book obj=new Book("Java","I dont know",1999);
        System.out.println(obj.getTitle());
        System.out.println(obj.getAuthor());
        System.out.println(obj.getPrice());
        obj.setPrice(2999);
        System.out.println(obj.getPrice());
    }
}
