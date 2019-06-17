// June 1st. 2019
//@Author Rodrigue.

package Book;
import member.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate; 

public class BookHandler {
   
   final static int maxBook = 10; 
   static int numBooks = 0;  
   private int count = 0;                 
   private String title;
   private String author;
   private String isbn; 
   private LocalDate dueDate; 
   public ArrayList<Book> books = new ArrayList<Book>();
   public HashMap<Member, Book> issuedBook = new HashMap<Member, Book>();
   
   public BookHandler (String titre, String auteur, String id){
      this.title = titre;
      this.author = auteur;
      this.isbn = id; 
      this.dueDate = null;   
      }

   public String getTitle(){
        return title;}
    
   public String getAuthor(){
        return author;}
    
   public String getIsbn(){
        return isbn;}
    
   public void setTitle(String title){
        this.title=title;}
    
   public void setAuthor(String author){
       this.author=author;}
   
   public void setIsbn(String id){
       this.isbn=id;}

  public LocalDate getDueDate(){
      return dueDate;}

  public void setDueDate(LocalDate dueDate){
     this.dueDate = dueDate;}

   public void base() {
   Book bb = new Book("Starting Out with Java", "Tony Gaddis", "0133957055", false); 
   books.add(bb);
   }

   public void addNewBook(Book newbook){  
      Book newBook = newbook;
      addBook(newBook);   
      }
   
   public void addBook(Book newBook) {
     System.out.println("You wish to add a book.");
     if (numBooks < maxBook){ 
     books.add(newBook);
     numBooks = numBooks + 1 ;
     }
     System.out.println(newBook.getTitle() + " of " + newBook.getAuthor() + " Added");
     count = numBooks;
     System.out.println("Total books in the library: "+ count);
     } 

   public void delBook(Book newBook) {
       Book book = newBook;
       Iterator iter = books.iterator();
       System.out.println("You wish to delete a book.");
       if(count>0){
       books.remove(book);
       System.out.println(book.getTitle() + " of " + book.getAuthor() + " Removed");
       count--;
       System.out.println("Total books in the library: "+count);
       }else{
       System.out.println("No Book available");       
       System.out.println("Total books in the library: "+count); 
        } 
      } 
   public void searchBook(String title){
     for(Book bk : books) {
          if(bk.getTitle().equals(title)){
          System.out.println("Book found.");            
          System.out.println("Author : " + bk.getAuthor() + ", Title : " + bk.getTitle() + ", isbn: " + bk.getIsbn());
          break;  
          }else{
               System.out.println("book was not found."); 
               }
          } 
        }
   public void requestBook(Member usr, String title, LocalDate checkoutDate){
     System.out.println("You wish to request '"+title+"'");
     base(); 
     for(Book bk : books) {
          if(bk.getTitle().equals(title)){
              bk.setDueDate(checkoutDate.plusWeeks(3));
              issuedBook.put(usr, bk);
              System.out.println("\t Borrower Name     : " + usr.getUsername());
              System.out.println("\t Borrower Adress   : " + usr.membAdress.getCountry() + "-" + usr.membAdress.getCity()); 
              System.out.println("\t Book Informations : " + bk.getAuthor() + "-" + bk.getTitle());                    
              System.out.println("\t Book due date     : " + bk.getDueDate() );
              break; 
           }else{
            System.out.println("Book was not found in the system."); 
            }
          } 
     }	
   public void returnBook(String title){
      System.out.println("You wish to return '"+title+"'");
      base();
      for(Book bk : books) {
          if(bk.getTitle().equals(title)){
             issuedBook.remove(bk);
             System.out.println("--" + bk.getTitle() + " of " + bk.getAuthor() + " has been checked back in --");            
             break;  
            }else{
             System.out.println("Book was not found in the system."); 
             }
          }
   }

}
