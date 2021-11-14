/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpweek3;
import java.util.Scanner;
/**
 *
 * @author Faradila
 */
public class SistemKasir {
    public static void main (String[] a){
        Scanner input = new Scanner(System.in);
        System.out.println("               Toko Sejahtera                 ");
        System.out.println("------------------------------------------");
       
        //masukkan jumlah beras yang dibeli
        int Beras,Total_Biaya,Harga_Beras,Jumlah_uang_diterima;
        double Total_Setelahdiskon,Uang_kembali;
        System.out.print  ("Jumlah Beras yang dibeli per-kg = ");
        Beras = input.nextInt();
        
        //harga beras per-kg
        System.out.print  ("Harga Beras per-kg              = Rp.");
        Harga_Beras = input.nextInt();
       
         //total biaya
        Total_Biaya = Beras * Harga_Beras;
        System.out.println("Total Biaya                     = Rp."+Total_Biaya);
        
        System.out.println("-------------------------------------------");
        System.out.println("                 Diskon 5%                      ");
        System.out.println("-------------------------------------------");
       
         //biaya mendapat diskon
        Total_Setelahdiskon = Total_Biaya - (Total_Biaya*0.05);
        System.out.println("Total Akhir                     = Rp."+Total_Setelahdiskon);
       
         //Jumlah uang yang diterima
        System.out.print  ("Jumlah uang diterima            = Rp.");
        Jumlah_uang_diterima = input.nextInt();
       
         //menghitung uang kembalian
        Uang_kembali = Jumlah_uang_diterima - Total_Setelahdiskon;
        System.out.println("Uang Kembalian                  = Rp."+Uang_kembali);
        
        System.out.println("--------------------------------------------");
        System.out.println("               Terima Kasih                 ");
             
    }  
}
