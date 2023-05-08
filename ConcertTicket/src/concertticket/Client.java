/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concertticket;

import java.util.ArrayList;

/**
 *
 * @author zeynepozcan
 */
public class Client extends User {
    ArrayList<Integer> transactions = new ArrayList<>();
    ArrayList<Events> tickets = new ArrayList<>();
    
    public Client() {
    }

    public Client(String firstName, String lastName, String username, String password, String type) {
        super(firstName, lastName, username, password, type);
    }
    
    
    
    public void addMoney(int amount){
         this.balance= (balance+amount);
         transactions.add(amount);
    }
    
    public void withdrawal(int amount){
         this.balance= (balance-amount);
         transactions.add(-amount);
    }
    
    public void displayTransactions(){
        if(transactions!=null);     
            for(int i=0; i <transactions.size(); i++){
                 System.out.println(transactions.get(i));    
                 System.out.println(transactions.size());
            }
    
        }
    
}
