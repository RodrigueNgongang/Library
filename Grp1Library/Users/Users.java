package Users;
import java.util.HashMap;

interface MyConnexion{
 
   public HashMap UsersDB();
   public boolean login();
   public boolean logout();
}

public class Users implements MyConnexion {
    public String username;
    public String password;
    public String role;
   
   public Users (String login, String pwd, String funct){
       this.username = login;
       this.password = pwd;
       this.role = funct;
   }

 public HashMap<String, String> UsersDB(){
   HashMap<String, String> map = new HashMap<String, String>();
      //The Administrator
      map.put("rodrigue", "One");
      //The Librarian
      map.put("armand", "Two");
      //The Member
      map.put("stephens", "Three");
    
   return map;
  }

  public boolean login(){
     
     HashMap<String, String> user_map = UsersDB();
     //String login=username;
     //String pwd=password;
     if (!user_map.containsKey(username)){
        System.out.println("That username does not exist.");
        System.exit(0);
        }   
      
    if(user_map.get(username).equals(password)){
       System.out.println("Successfully logged in.");
       //System.out.println("Welcome " + un.first_name + " "+ un.last_name);
       return true;
       }else{
         System.out.println("Incorrect password");
         return false;
         }  
      }
   
  public boolean logout(){
      System.out.println("You're logged out");
      return false;
   }
}
