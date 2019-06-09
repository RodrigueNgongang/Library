//@Version June 1st. 2019
//@Author Rodrigue Ngongang.

package User;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role=role;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
     public String getRole() {
        return role;
     }
   public void setRole(String role) {
        this.role = role;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public static List<User> UserDB(){
        List<User> usr = new ArrayList<>();
        usr.add(new User("Rodrigue", "One", "Librarian"));
        usr.add(new User("Armand", "Two", "Member"));
        usr.add(new User("Stephens", "Three", "Admin"));
        return usr;
    }

   public boolean login(){
      List<User> cnx_map = UserDB();
      boolean x=false;
      for(User usr : cnx_map) {
          if(usr.getUsername().equals(username) && usr.getPassword().equals(password)){
          //System.out.println("Successfully logged in.");            
          //System.out.println("Login : " + usr.getUsername() + ", Password : " + usr.getPassword() + ", Role: " + usr.getRole());
          x = true;
          break;  
          }else{
                x = false;
                }}
          if (x) System.out.println("Successfully logged in."); 
          else System.out.println("Incorrect password");
          return x;
          }

  public void logout(){
      System.exit(0);
      }
  }
