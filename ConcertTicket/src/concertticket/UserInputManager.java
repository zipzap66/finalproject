/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concertticket;
import java.util.Scanner;

/**
 *
 * @author 2261919
 */
public class UserInputManager  {
    public static final String ANSI_YELLOW_BACKGROUND= "\u001B[43m" ;
    public static final String ANSI_CYAN_BACKGROUND="\u001B[40m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static int retrieveUserOption(){
        System.out.println("\n[1] Log into an existing account\n[2] Create a new account\n[3]Exit ");    
        System.out.println(ANSI_CYAN_BACKGROUND+"Please enter the number associated with your operation:"+ANSI_RESET);
        Scanner sc= new Scanner(System.in);
        int number;
        number= sc.nextInt();
        
        return number;
    }
    
    public static String SetClientUsername(){
        System.out.println(ANSI_CYAN_BACKGROUND+"Please enter your username:"+ANSI_RESET);
        Scanner sc= new Scanner(System.in);
        String id= sc.nextLine();
        
        return id;
    }
    public static String retrieveClientPassword(){
        System.out.println(ANSI_CYAN_BACKGROUND+"Please enter your password:"+ANSI_RESET);
        Scanner sc= new Scanner(System.in);
        String ps= sc.nextLine();
        return ps;
        
    }
    public static String setPassword(){
         User u= new User();
         int a=1;
         while(a==1){
        String confirm= retrieveClientPassword();
        System.out.println(ANSI_CYAN_BACKGROUND+"Please confirm your password:"+ANSI_RESET);
        Scanner sc= new Scanner(System.in);
        String ps= sc.nextLine();
        
        if(confirm.equals(ps)){
            a++;
            return ps;
             
        }else if(ps!=confirm){
            System.out.println("Passwords don't match please try again.");
            
        }
         }
        return null;
       
 
    }
    public static String retrieveUsername(){ 
        System.out.println(ANSI_CYAN_BACKGROUND+"Please enter your username:"+ANSI_RESET);
        Scanner sc= new Scanner(System.in);
        String username = sc.nextLine();
        return username;
    }
    
     public static String retrievePassword(){ 
        System.out.println(ANSI_CYAN_BACKGROUND+"Please enter your password:"+ANSI_RESET);
        Scanner sc= new Scanner(System.in);
        String password= sc.nextLine();
        return password;
    }
     
    public static String setUsername(){
        
        int a=1;
        while(a==1){
            String us = retrieveUsername();
            
            if(User.checkUsername(us)){
                System.out.println(ANSI_CYAN_BACKGROUND + "Username already taken. Please try again" + ANSI_RESET);

            }else{
                a++;
                return us;
            }
        }
        return null;   
    }

    public static double retrieveTransactionAmount(){
        System.out.print(ANSI_CYAN_BACKGROUND+"Please enter your amount: " + ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        return amount;
    }
    
    
    public static String getUserType(){
        String type = null;
            
        System.out.println(ANSI_CYAN_BACKGROUND + "Please select the type of new account:" + ANSI_RESET);
        int c = 1;
        Scanner sc = new Scanner(System.in);
        while(c == 1){
            System.out.println("[1] Artist\n[2] Client");
            int b = sc.nextInt();
            if (b == 2){
                type = "Client";

               c++;
            }else if(b == 1){ 
                type = "Artist";

                c++;
            }else{
                System.out.println("Invalid entry please try again.");
                System.out.println(ANSI_CYAN_BACKGROUND + "Enter your option" + ANSI_RESET);
            }
  
        }
       return type;
    }
    
    public static int options(User u){
        Scanner sc= new Scanner(System.in);
        int num = 0;
        if(u.getType().equals("Client")){
            System.out.println("[1] Buy tickets\n[2] See your tickets\n[3] See your balance\n[4] Deposit Money");
            num=sc.nextInt();
        }else if(u.getType().equals("Artist")){
            System.out.println("[1] Post an event\n[2] Modify events\n[3] See your balance\n[4] Withdraw money"); 
            num=sc.nextInt();
        }else{
            System.out.println("[1] See all users\n[2] See all events\n[3] Modify events");
            num=sc.nextInt();
                   
        }
        return num;
    }
            
}
    
    

