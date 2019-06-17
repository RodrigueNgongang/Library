// June 1st. 2019
//@Author Rodrigue Ngongang.

package admin;
import User.*;
import Book.*;
import adresse.*;
import java.util.List;
import java.util.ArrayList;

public class Admin extends User {
    
    public int admId;
    public Address admAdress;
    
    public Admin(String login, String pwd, String func, int id, Address addr){
       super(login, pwd, func); 
       admId = id;
       admAdress = addr;
       }

   public String getUsername() {
      return super.getUsername() +" the Member";
      }
   
   public String getRole() {
      return super.getRole();
      }
  
   public String getPassword() {
      return super.getPassword();
      }

   public int getadmId() {
      return admId;
      }
    public void setadmId(int id) {
      this.admId = id;
      }

    public Address getadmAdress() {
      return admAdress;
      }
    
    public void setadmAdress(Address addr) {
      this.admAdress = addr;
      }
 
  @Override
  public void AddLib(User newlib){
      List<User> NewLib = UserDB();
      NewLib.add(newlib);
      for(User usr : NewLib) {
          if(usr.getRole().equals("Librarian")){            
             System.out.println("\t User Name     : " + usr.getUsername());
             System.out.println("\t User Password : " + usr.getPassword());
             }
      }
    }
    
  @Override
  public void DelLib(User rmlib){
     List<User> _Lib = UserDB();
     for(User usr : _Lib) { 
        if(usr.getUsername().equals(rmlib.getUsername()) && usr.getRole().equals("Librarian")){
           _Lib.remove(rmlib);
           break;
           }else if(usr.getUsername().equals(rmlib.getUsername())){
                    System.out.println("\t User "+ usr.getUsername()+" is not a librarian");
             
        }else{
              System.out.println("\t User "+ usr.getUsername()+" not found");
              } 
        }
     System.out.println("\t remaining librarian in the system"); 
     for(User usr : _Lib) {
        if(usr.getRole().equals("Librarian")){    
        System.out.println("\t User Name     : " + usr.getUsername());
        System.out.println("\t User Password : " + usr.getPassword());
         }  
       }
     }
  }
