/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;

/**
 *
 * @author Muhammad RIfqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 * Kelas: Pbo-IF1
 * Nim : 10119042   
 */
public class PBO10119042Latihan17tunjangan {
    public static void main(String[] args){
    int gajiPokok;
    double tunjangan,total;
    System.out.println("==============Program Tunjangan==============");
    System.out.println("Gaji Anda Perbulan: ");
        try (Scanner Scanner = new Scanner (System.in)) {
            gajiPokok = Scanner.nextInt();
            System.out.println("Status anda?(menikah/belum): ");
            String status = Scanner.next();
            tunjangan = (status.equals("menikah") || status.equals("Menikah"))?0.35*gajiPokok:0;
            total = gajiPokok * tunjangan;
            System.out.println("Gaji Pokok \t\t : Rp. " + gajiPokok);
            System.out.printf("Tunjangan\t\t    : Rp. %.0f%n" , tunjangan);
            System.out.printf("Total Gaji\t\t   : Rp. %.0f%n" , total);
        }
    
    

}
}