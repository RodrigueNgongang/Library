//@Version June 1st. 2019
//@Author Rodrigue Ngongang.

package Book;
import member.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate; 

/* interface MyBook{
 
   public void addBook ();
   public void editBook ();
   public void deleteBook();
   public void searchLibrary();
} */

public class Book extends BookHandler {
                 
   private String title;
   private String author;
   private String isbn;
   private boolean status = false;
    
   public Book (String titre, String auteur, String id, boolean status){
       super(titre,auteur,id);
       this.title = titre;
       this.author = auteur;
       this.isbn = id;
       this.status = status ;
       }
    
  public boolean getStatus(){
       return status;
       } 
  public void setStatus(boolean status){
       this.status = status;
       }
  public String getTitle(){
        return title;
       } 
  public String getAuthor(){
        return author;
       }
    
  public String getIsbn(){
       return isbn;
       }
  public void setTitle(String title){
       this.title=title;
       } 
  public void setAuthor(String author){
       this.author=author;
       }
  public void setIsbn(String id){
       this.isbn=id;
       }
  public void addNewBook(Book newbook){  
       super.addNewBook(newbook);
       }
  public void addBook(Book newBook) {
      super.addBook(newBook);
       } 
  public void delBook(Book newBook) {
      super.delBook(newBook);
       } 
  public void searchBook(String title){
      super.searchBook(title);
      }
 public void requestBook(Member usr, String title){
     super.requestBook(usr, title, LocalDate.now());
     }	
 public void returnBook(String title){
     super.returnBook(title);
     }

}
