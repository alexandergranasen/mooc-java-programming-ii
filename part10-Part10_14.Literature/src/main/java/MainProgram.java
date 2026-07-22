
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        
        while(true) {
            
            System.out.println("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
        
            if(title.isBlank()) {
                System.out.println(bookList.size() + " books in total.");
                
                System.out.println("Books: ");
                
                Comparator<Book> comparator = Comparator
                        .comparing(Book::getAge)
                        .thenComparing(Book::getName);
                        
                bookList.sort(comparator);
                
                bookList.stream()
                        .forEach(book -> System.out.println(book));
                
                break;
            }   
            
            System.out.println("Input the age recommendation: ");
            
            int age;
            try {
                age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Try again.");
                continue;
            }
            
            bookList.add(new Book(title, age));
        }
        System.out.println("Terminating program...");
    }

}
