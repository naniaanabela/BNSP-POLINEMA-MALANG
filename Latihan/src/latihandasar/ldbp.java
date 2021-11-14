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

public class ldbp {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

		// deklarasi variabel
		String nama, npm;
		double angka1, angka2, hasil;
                
                System.out.print ("Masukkan nama : ");
                nama = input.nextLine();
                System.out.print ("npm : ");
                npm = input.nextLine();
                System.out.print("Masukkan angka1 :");
                angka1 = input.nextDouble();
                System.out.print("Masukkan angka2 :");
                angka2 = input.nextDouble();
                
                System.out.println("Nama : "+ nama);
                System.out.println("NPM : "+ npm);
                hasil = angka1 + angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + hasil);
                hasil = angka1 - angka2;
                System.out.println(angka1 + "-" + angka2 + "=" + hasil);
                hasil = angka1 * angka2;
                System.out.println(angka1 + "*" + angka2 + "=" + hasil);
                hasil = angka1 / angka2;
                System.out.println(angka1 + "/" + angka2 + "=" + hasil);
                hasil = angka1 % angka2;
                System.out.println(angka1 + "%" + angka2 + "=" + hasil);
                
    
    }
    
}
   
