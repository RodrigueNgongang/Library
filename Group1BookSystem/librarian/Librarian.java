//@Version June 1st. 2019
//@Author Rodrigue.

package librarian;
import User.*;
import adresse.*;
import Book.*;

public class Librarian extends User {
    public int libId;
    public Address libAdress;
    public Librarian(String login, String pwd, String func, int id, Address addr){
	//System.out.println("Constructor of Child");
       super(login, pwd, func); 
       libId = id;
       libAdress = addr;
   }

   public String getUsername() {
        return super.getUsername() +" the Librarian";
    }
   
   public String getRole() {
        return super.getRole();
     }
  
   public String getPassword() {
        return super.getPassword();
    }

   public int getlibId() {
        return libId;
    }
    public void setlibId(int id) {
        this.libId = id;
    }

    public Address getlibAdress() {
        return libAdress;
    }
    public void setlibAdress(Address addr) {
        this.libAdress = addr;
    }
}
