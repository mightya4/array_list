import java.util.ArrayList;
import java.util.Collections;

public class array_list {
    public static void main (String[] args){
        ArrayList<String> books = new ArrayList<String>();
        books.add("To Kill a Mockingbird");
        books.add("The Da Vinci Code");
        books.add("The Hunger Games");
        books.add("Water for Elephants");
        books.add("Lord of the Flies");

        Collections.sort(books);
        for (String i : books) {
            System.out.println(i);
        }

        System.out.println("--------------------");
        
        for(int i = books.size() -1 ; i >= 0; i-- ) {
            System.out.println(books.get(i));
        }

        books.remove("The Hunger Games");

        System.out.println("--------------------");
        
        for(int i = books.size() -1 ; i >= 0; i-- ) {
            System.out.println(books.get(i));
        }

    }
}