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
public class Platform {
    protected static ArrayList<User> users = new ArrayList<>();
    protected ArrayList<Events> events = new ArrayList<>();
    int counter=0;
    
    public Platform() {
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Events> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Events> events) {
        this.events = events;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public static void addUser(User newuser){
        users.add(newuser);
    }

    public void displayAllUsers(){
        if(users!=null);  
        System.out.println("All users");
        for(int i=0; i <users.size(); i++){
               System.out.println(users.get(i));       
        }
    }
     public ArrayList getUsernames(){
        ArrayList<String> usernames = new ArrayList<>();
        for(int i=0; i < users.size(); i++){
            usernames.add(users.get(i).getUsername());
        }
        for(int i=0; i <usernames.size(); i++){
            System.out.println(usernames.get(i)+" ");
        }
        return usernames;
    }
     
    public static User getUser(String username, String password){
         User u = null;
         for (int i = 0; i < users.size(); i++) {
             if((users.get(i).getUsername() == username)&&users.get(i).getPassword() == password){
                 u= users.get(i);
             }
         }
         return u;
     }
  
    
}

