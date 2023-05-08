/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concertticket;

import static concertticket.UserInputManager.ANSI_CYAN_BACKGROUND;
import static concertticket.UserInputManager.ANSI_RESET;
import static concertticket.UserInputManager.getUserType;
import java.util.Scanner;

/**
 *
 * @author 2261919
 */
public class User {


    protected String username;
    protected String firstName;
    protected String lastName;
    protected String password;
    protected double balance = 0;
    protected String type;

    public User(String firstName,String lastName,String username,String password,String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.username = username;
        this.password = password;
  
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
    
    public static boolean checkUsername(String username){
        
        for (int i = 0; i < Platform.users.size(); i++) {
            String name = Platform.users.get(i).getUsername();
            if(name!=null)
            if(name.equals(username)){
                return true;
            }
            else{
            } 
        }
        
        return false;
    }
    
    public static boolean checkPassword(String password){
        
        for (int i = 0; i < Platform.users.size(); i++) {
            String name = Platform.users.get(i).getPassword();
            if(name!=null)
            if(name.equals(password)){
                return true;
            }
            else{
            } 
        }
        
        return false;
    }
    
    public static int usernameIndex(String username){
        
        for (int i = 0; i < Platform.users.size(); i++) {
            String name = Platform.users.get(i).getPassword();
            if(name!=null)
            if(name.equals(username)){
                return i;
            }
            else{
            } 
        }
        
        return -1;
    }
    
    public static int passwordIndex(String password){
        
        for (int i = 0; i < Platform.users.size(); i++) {
            String pass = Platform.users.get(i).getPassword();
            if(pass!=null)
            if(pass.equals(password)){
                return i;
            }
            else{
            } 
        }
        
        return -1;
    }
    
    
    public static boolean userCheck(String username, String password){//check if username and password matches
        
       if(checkUsername(username)){
           if(checkPassword(password) && passwordIndex(password)==usernameIndex(username)){
               System.out.println("Logged in Succesfully");
               return true;
           }else {
               System.out.println("Password does not match the username.");
           }
       }else{
           System.out.println("Invalid username.");
       }
       return false;
    }
    
    public static User setUserInfo(){
        System.out.println(ANSI_CYAN_BACKGROUND + "Please enter your first name " + ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        
        System.out.println(ANSI_CYAN_BACKGROUND + "Please enter your last name " + ANSI_RESET);
        Scanner sc2 = new Scanner(System.in);
        String lastName = sc2.next();
        
        String username = UserInputManager.setUsername();
        String password = UserInputManager.setPassword();
        String type = getUserType();
        User us = new User(firstName, lastName, username, password, type);
        Platform.users.add(us);
        if(us.getType().equals("Client")){
            us= new Client();
        }else if(us.getType().equals("Artist")){
             us= new Artist();
        }else{
            us = new Admin();
        }
      
        
        return us;
    }
    


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getBalance() {
        System.out.println("Your balance: " + balance + "$");
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void sufficientFundCheck(){
        
    }
   
    @Override
    public String toString() {
        return "\nUsername: " + this.username + "\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nPassword: " + this.password + "\nAccount Type: " + this.balance +"\nAccount Type: " + this.type+ '}';
    }

    

    
    

    
    
}
