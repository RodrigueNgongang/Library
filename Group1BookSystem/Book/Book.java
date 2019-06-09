//@Version June 1st. 2019
//@Author Rodrigue Ngongang.

package Book;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator; 

/* interface MyBook{
   public void addBook ();
   public void editBook ();
   public void deleteBook();
   public void searchLibrary();
} */

public class Book {

   final static int maxBook = 10; 
   static int numBooks = 0;  
   public int count = 0;                 
   public String title;
   public String author;
   public String isbn;
   public ArrayList<Book> books = new ArrayList<Book>();
    
   public Book (String titre, String auteur, String id){
       this.title = titre;
       this.author = auteur;
       this.isbn = id;
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
       System.out.println(book.title + " of " + book.author + " Removed");
       count--;
       }else{
       System.out.println("No Book available");       
       System.out.println("Total books in the library: " + count); 
        } 
       } 
  public void searchBook(String title){
     for(Book bk : books) {
          if(bk.getTitle().equals(title)){
          System.out.println("book found.");            
          System.out.println("Author : " + bk.getAuthor() + ", Title : " + bk.getTitle() + ", isbn: " + bk.getIsbn());
          break;  
          }else{
               System.out.println("book was not found."); 
               }
          } 
        }

 }


