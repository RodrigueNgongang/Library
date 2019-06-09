// June 1st. 2019
//@Author Rodrigue.

package Book;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator; 

public class BookHandler extends Book{
   //Book[] books = new Book[10];
   //public ArrayList<Book> books = new ArrayList<Book>();                
   //public int count = 0;

   public BookHandler (String titre, String auteur, String id){
       super(titre,auteur,id);
   }
   public String getTitle(){
        return super.getTitle();
    }
    
    public String getAuthor(){
        return super.getAuthor();
    }
    
    public String getIsbn(){
        return super.getIsbn();
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public void setAuthor(String author){
       this.author=author;
    }
   
    public void setIsbn(String id){
        this.isbn=id;}

   public Boolean adddBook(Book book) {
     /*   if (book.getIsbn() != 0) {
               if (count < 100)
                  this.book[count++] = book;
                  else
                  System.out.println("Array is full. Can't add more.");
                  }*/
                  return false;
                  }

public ArrayList<Book> books = new ArrayList<Book>();
public int count = 0;
public void addNewBook(Book newbook){  
      Book newBook = newbook;
      //("author", "title", "124EBN125");
      //library[numBooks]=new Book("test","test","test","test",0);
      addBook(newBook); }

   public void addBook(Book newBook) {
       System.out.println("You wish to add a book."); 
       books.add(newBook);
       //for (Book b : books) {
       //System.out.println(b);
       System.out.println(newBook.title + " of " + newBook.author + " Added");
       count++;
       System.out.println("Total books in the library: "+count);          
       //numBooks++;
         }

   public void delBook(Book newBook) {
       Book book = newBook;
       Iterator iter = books.iterator();
       System.out.println("You wish to delete a book.");
      /* while(iter.hasNext()) {
            iter.next();
            books.remove(book);
        } */
      if(count>0){
       books.remove(book);
       System.out.println(book.author + " Removed");
       count--;
       }else{
       System.out.println("No Book available");      
       //numBooks++; 
       System.out.println("Total books in the library: "+count); 
        } }

 public void searchBook(String title){
     //ArrayList<Book> found = new ArrayList<Book>();
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
