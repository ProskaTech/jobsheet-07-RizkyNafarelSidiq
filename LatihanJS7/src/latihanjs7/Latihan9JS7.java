/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanjs7;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */
public class Latihan9JS7 {
    public static  void main(String []args){
        int baris, kolom, hasil_kali;
        int MAKS = 8;
        
        for (baris = 1; baris <= MAKS; baris++)
        {
            for (kolom =1; kolom <= MAKS; kolom++)
            {
                hasil_kali = baris * kolom;
                System.out.print("\t" + hasil_kali);
            }
            System.out.println("");
        }    
    }
    
}
