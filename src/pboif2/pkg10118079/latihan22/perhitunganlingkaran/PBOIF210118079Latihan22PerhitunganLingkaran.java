/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118079.latihan22.perhitunganlingkaran;

/**
 *
 * @author user
 * Nama : Wiranto
 * Nim : 10118079
 * Kelas : IF-2
 */
import java.util.Scanner;

public class PBOIF210118079Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("=========Perhitungan lingkaran============");
        System.out.print("Masukan nilai diameter : " );
        int diameter = input.nextInt();
       
        
        System.out.println("============Hasil Perhitungan Lingkaran ===========");
        System.out.println("Jari -Jari lingkaran : " +(diameter/2));
        System.out.println("Luas lingkaran : " + (3.14*(diameter/2)*(diameter/2)));
        System.out.println("Keliling lingkaran : " +(2*3.14*(diameter/2)));
    }
    
}
