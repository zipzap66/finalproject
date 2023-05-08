/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concertticket;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author zeynepozcan
 */
public class Events {
    
    private int ticketnumbers;
    private String location;
    protected ArrayList<Events> event= new ArrayList<>();
    private String[][] seats={};
    
    public Events() {
    }
    
    public void seatAdd(int seatNum,int rowNum){
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < seatNum; j++) {
                seats[i][j]="|_|";
            }
        }
    }
    public void displaySeats(){
        System.out.println(Arrays.deepToString(seats));
    }
    
}

