/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concertticket;

/**
 *
 * @author zeynepozcan
 */
public class ConcertTicket {
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN_BACKGROUND="\u001B[46m" ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Platform p= new Platform();
       Admin us = new Admin();
       Platform.users.add(us);
       p.displayAllUsers();
       int a=1;
       Events e= new Events();

        while(a==1){
            int b=UserInputManager.retrieveUserOption();
            if(b==1){
                String username = UserInputManager.retrieveUsername();
                String password = UserInputManager.retrievePassword();
                
                if(User.userCheck(username, password)){
                    User u = p.getUser(username, password);
                    
                    int op=UserInputManager.options(u);
                    
                    if(op==1){
                        
                    }else if(op==2){
                        
                    }else if(op==3){
                        
                        u.getBalance();
                        
                    }else if(op==4){
                        
                    }else{
                        
                    }
                }else{
                    System.out.println("Try again.");
                }
                
            }else if(b==2){
                User u = User.setUserInfo();
                p.addUser(u);
                
                p.displayAllUsers();
              
                System.out.println(ANSI_GREEN+"\nYour account has been created.\n\nPlease log in to access the event platform"+ANSI_RESET);
                p.getUsernames();
            }else if(b==3){
                System.out.println(ANSI_CYAN_BACKGROUND+ "Thank you for using the ticket platform." +ANSI_RESET);
                break;
            }else{
                System.out.println("Invalid Input Please Try Again.");
            }
            
        }
    }
    
}
