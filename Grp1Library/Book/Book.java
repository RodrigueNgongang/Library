package Book;
import java.util.Scanner;

interface MyBook{
   public void addBook ();
   public void editBook ();
   public void deleteBook();
   public void searchLibrary();
}

public class Book {

   final static int MAX_BOOKS = 20;             // the maximum number of books
   static Book[] library = new Book[MAX_BOOKS]; // the array of Book objects that represents the library
   static int numBooks = 0;                     // the number of books currently in the library (<= MAX_BOOKS)
   static Scanner keyboard = new Scanner(System.in); // Scanner for keyboard

   public static void addBook() {
      System.out.println("You wish to add a book.");
      // Write code to add a Book object to the array library
      //Book[numBooks]=new Book("test","test","test","test",0);
      //numBooks++;
      sort(); // sort the array library
      System.out.println("added");
   }
  
   public static void editBook() {
       System.out.println("You wish to edit a book description.");
       System.out.print("What is the title of the book you wish to edit: ");
       String title = keyboard.nextLine();
       int index = binarySearch(title);
       // Write code to edit the Book object at index
       //if(index>0){
       //Book[index].setTitle("test edit");
       //}else{
       // System.out.println("no such book");
       //}
       sort(); // sort the array library
   }
  
   public static void deleteBook() {
       System.out.println("You wish to remove a book from the system.");
       System.out.print("What is the title of the book you wish to delete: ");
       String title = keyboard.nextLine();
       int index = binarySearch(title);
       //Book[index]=null;
       // Write code to delete the Book object at index
   }
  
   public static void searchLibrary() {
       System.out.println("You wish to search the library for a book.");
       System.out.print("What is the title of the book you are looking for: ");
       String title = keyboard.nextLine();
       int index = binarySearch(title);
       //if(index>0){
       //System.out.println("Title:"+library[index].getTitle());
       //}else{
       System.out.println("no such book");}
      // Write code to display the book's description
       //}
  
   public static int binarySearch(String title) {
       // Implement binary search for array library, searching for title
       //return Arrays.binarySearch(library, title);
         return 1;
   }
  
   public static void sort() {
       // Implement a sorting algorithm to sort library according to title.
       //return Arrays.binarySearch(Book, title);
   }
}
