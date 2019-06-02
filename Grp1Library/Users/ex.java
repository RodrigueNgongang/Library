package Book;
import java.util.Scanner;
import java.util.ArrayList;
/*
interface MyBook{
 
   public void addBook ();
   public void editBook ();
   public void deleteBook();
   public void searchLibrary();
}
*/
public class Book {

   final static int MaxBook = 10;
   static Book[] library = new Book[MaxBook]; 
   static int numBooks = 0;                   
                
   ArrayList<Book> Books = new ArrayList<Book>();
 
    public String title;
    public String author;
    public String isbn;
   
   public Book (String titre, String auteur, String id){
       this.title = titre;
       this.author = auteur;
       this.isbn = id;
   }
      
  /*  public String gettitle(){
        return title;}
    
    public String getauthor(){
        return author;}
    
    public int getYear(){
        return year;}
    
    public double getCost(){
        return cost;}

    public void settitle(String title){
        this.title=title;}
    
    public void setauthor(String author){
       this.author=author;}
   
    public void setyear(int year){
        this.year=year;}
    
    public void setcost(double cost){
        this.cost=cost;}    
     
    // the last part here is to create a toString method that returns all of the details of the book that has been inputted.
    
    public String toString(){
        return "The details of the book are: " + title + ", " + author + ", " + year + ", " + publisher + ", " + cost;}
     } */
}
   public void addNewBook(String author, String title, int id){   
      Book newBook = new Book("author", "title", 1245632);
      //library[numBooks]=new Book("test","test","test","test",0);
      addBook(newBook); }

   public void addBook(Book newBook) {
       System.out.println("You wish to add a book."); 
       Books.add(newBook);                    
       System.out.println(newBook.author + " Added");
       numBooks++;}

 public Book searchBook(String title){
     for(int i=0;i<books.length;i++){ 
     Book book = books[i];
     if(book.getTitle.equalsIgnoreCase(title)){
     return book; }
     } 
  }
