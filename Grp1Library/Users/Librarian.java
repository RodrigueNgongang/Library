// June 1st. 2019
//@Author Rodrigue.

//package librarian;
//import Users.*;
import adresse.*;

public class Librarian extends Users implements MyBokk {
    public int libId;
    public Address libAdress;
    
    public Librarian(String login, String pwd, String func, int id, Address addr){
       super(login, pwd, func); 
       libId = id;
       libAdress = addr;
   }
  void addBook(){
  //code to addbook
   }
   
  void viewBook(){
	//code to viewbook
	 }

  void issueBook(){
  //Code to issueBook
	//super.disp();
   }
   
  void returnBook(){
  //Code to returnbook
	//super.disp();
   }
}
