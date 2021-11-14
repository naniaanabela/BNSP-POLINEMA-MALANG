/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandasar;
import java.util.Scanner;
/**
 *
 * @author Faradila
 */
public class clatihan1 {
    public static void main(String[] args) {
        //Data Mahasiswa
        System.out.println("-----Data Mahasiswa-----");
        System.out.println("Nama : Faradila Kusuma Dewi");
        System.out.println("NPM : 21082010085");
        System.out.println("Tempat Tanggal Lahir : Probolinggo, 06 Maret 2003");
        System.out.println("Domisili : Probolinggo");
        
        //menghitung luas persegi panjang
        int panjang,lebar,luas;
        panjang = 10;
        lebar = 5;
       
        System.out.println("---Menghitung luas persegi panjang---");
        luas = panjang*lebar;
        System.out.println("Luas = "+ panjang + "*" + lebar + "=" + luas );
        
        //usia mahasiswa
        Scanner input = new Scanner(System.in);
        int tahun1,tahun2,Usia;
        System.out.println("----Menghitung Usia----");
        System.out.print("Masukkan Tahun Lahir : ");
        tahun1 = input.nextInt();
        tahun2 = 2021;
        
        Usia = tahun2 - tahun1;
        System.out.println("Usia = "+ Usia);
        
        
        
        
       
        
    }
}
