/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarbp1;
import java.util.Scanner;
/**
 *
 * @author Faradila
 */
public class bp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hallo,World");
        System.out.println ("Aku Cinta Indonesia.");
        
        Scanner input = new Scanner(System.in);
        String a ="Belajar Menampilkan Isi Variabel";
        String b,c;
        double d;
        int e;
        
        System.out.println(a);
        System.out.print("Nama : ");
        b = input.next();
        System.out.print("NPM : ");
        c = input.next();
        System.out.print("IPK : ");
        d = input.nextDouble();
        System.out.print("Semester : ");
        e = input.nextInt();
        System.out.println("Terima Kasih"); 
        
    }
    
}
