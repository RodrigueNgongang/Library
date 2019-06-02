import Users.*;
import adresse.*;
import librarian.*;
import java.util.Scanner;

public class Rodrigue { 

public static void main(String args[]){
	
    Address ad = new Address(12, "Douala", "Kmer");
    //Librarian lib1 = new Librarian("armand", "Two", "Admin", 111, ad);
    Users usr = new Users("armand", "Two", "Admin");
    //boolean flag = lib1.login();
    boolean flag = usr.login();
    //System.out.println(flag);
    Scanner keyboard = new Scanner(System.in); // Scanner for keyboard

    if(!flag){
      System.out.println("login or password is incorrect");
       }else{
         if(usr.role=="Libraire"){
            System.out.println("I'm Librarian");
            char exit = 'N';
            while (exit != 'Y') {
            System.out.println("Welcome "+usr.username+", what would you like to do today ?");
            System.out.println("\t1. Add a book to the system.");
            System.out.println("\t2. Remove a book from the system.");
            System.out.println("\t3. Logout.");
            System.out.print("Enter your choice: ");
            int choice = keyboard.nextInt();
            keyboard.nextLine();
                
            switch (choice) {
            case 1: // 1. Add a book to the system.
            //addBook();
            break;
            case 2: // 2. Remove a book from the system.
            //deleteBook();
            case 3: // 3. logout the system.
            //logout();
            break;
            default: // Invalid command
            System.out.println("That is not a valid command.");
            }
             System.out.print("Would you like to exit, Y or N: ");
             exit = keyboard.nextLine().charAt(0);
            }
             }else if(usr.role=="Admin"){
                System.out.println("I'm Admin");
                char exit = 'N';
                while (exit != 'Y') {
                System.out.println("Welcome "+usr.username+", what would you like to do today ?");
                System.out.println("\t1. Add a Librarian.");
                System.out.println("\t2. Delete a Librarian.");
                System.out.println("\t3. Logout.");
                System.out.print("Enter your choice: ");
                int choice = keyboard.nextInt();
                keyboard.nextLine();
               
                switch (choice) {
                case 1: // 1. Add a Librarian to the system.
                //addLib();
                break;
                case 2: // 2. Delete a Librarian from the system.
                //deleteLib();
                break;
                case 3: // 3. logout the system.
                //logout();
                break;
                default: // Invalid command
                System.out.println("That is not a valid command.");
                }
                System.out.print("Would you like to exit, Y or N: ");
                exit = keyboard.nextLine().charAt(0);
                }
                 }else{
                    System.out.println("Welcome "+usr.username+", what would you like to do today ?"); 
                     }}
   }
}
