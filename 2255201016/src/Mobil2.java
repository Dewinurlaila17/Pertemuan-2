/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Mobil2 {
    static MasterMobil avanza = new MasterMobil();
    
    public static void main(String[] args){
        System.out.println("Ini adalah mobil Avanza");
        System.out.println("Warna Avanza "+avanza.warnaMobil);
        System.out.println("Merk Avanza "+avanza.merkMobil);
        System.out.println("Tahun Pembuatan "+avanza.tahunMobil);
        
    }
}
