/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Game {

    /**
     *
     * @param args
     */
    public static void main(String[]args){
        Player petani = new Player();
        
        petani.name = "Saya";
        petani.speed = 78;
        petani.healthpoint = 100;
        
        petani.run();
        
        if(petani.IsDead()){
            System.out.println("Game Over!");
            
        }
    }
    
}
