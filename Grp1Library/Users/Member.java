// June 1st. 2019
//@Author Rodrigue.

//package members;
//import Users.*;
import adresse.*;
import Book.*;

public class Member extends Users {
    public int membId;
    public Address membAdress;
    
 public Member(String login, String pwd, String func, int mid, Address addr){
       super(login, pwd, func); 
       membId = id;
       membAdress = addr;
   }
 }
