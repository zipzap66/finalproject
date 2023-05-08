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
public class Artist extends User{
    ArrayList<Integer> transactions= new ArrayList<>();
    ArrayList<Events> events= new ArrayList<>();
    
    public Artist()  {
    }

    public Artist(String firstName, String lastName, String username, String password, String type) {
        super(firstName, lastName, username, password, type);
    }
    
    
    
    public void withdrawal(int amount){
         this.balance= (balance-amount);
         transactions.add(-amount);
    }
    
}
