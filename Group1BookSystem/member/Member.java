//@Version June 1st. 2019
//@Author Rodrigue.

package member;
import User.*;
import adresse.*;
import Book.*;

public class Member extends User {
    public int membId;
    public Address membAdress;
    
    public Member(String login, String pwd, String func, int id, Address addr){
       super(login, pwd, func); 
       membId = id;
       membAdress = addr;
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

   public int getMembId() {
        return membId;
    }
    public void setMembId(int id) {
        this.membId = id;
    }

    public Address getMembAdress() {
        return membAdress;
    }
    public void setMembAdress(Address addr) {
        this.membAdress = addr;
    }
}
