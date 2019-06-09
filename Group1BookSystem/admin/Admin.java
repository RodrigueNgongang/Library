// June 1st. 2019
//@Author Rodrigue.

package admin;
import User.*;
import adresse.*;
import Book.*;

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
}
