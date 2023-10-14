/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Player {
    String name = "Saya";
    int speed = 88;
    int healthpoint = 100;
    
    void run(){
        System.out.println( name +" is running...");
        System.out.println("Speed: " + speed);
    }
    public void isDead(){
        System.out.println(name +"mati");
    }
    boolean IsDead(){
        if(healthpoint <=0)return true;
        return false;
    }
    public static void main (String[]args){
    }   
}
