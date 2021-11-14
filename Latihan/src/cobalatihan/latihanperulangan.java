
package cobalatihan;

import java.util.Scanner;

/**
 *
 * @author Faradila
 */
public class latihanperulangan {
    public static void main(String[] args) {
        for (int p = 1; p >= 1; p++) {
            Scanner s = new Scanner(System.in);
            String pesanan [][]= new String [5][2];
            int idx=0, idxmkn =0, idxmnm=0;
            int nominal [][] = new int [5][6];
            int pilih1=0, pilih2=0, porsi;
                do{
            System.out.println("\nMENU");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Selesai");
            System.out.print("Pilih = ");
            pilih1 = s.nextInt();
                switch(pilih1){
                    case 1 :
                        System.out.println("MENU MAKANAN");
                        System.out.println("1. Sate");
                        System.out.println("2. Soto");
                        System.out.println("3. Bakso");
                        System.out.print("Pilih = ");
                        pilih2= s.nextInt();
                        switch(pilih2){
                            case 1 :
                                pesanan [idxmkn][0]="Sate ";
                                nominal [idxmkn][0]=15000;
                                break;
                            case 2 :
                                pesanan [idxmkn][0]="Soto ";
                                nominal [idxmkn][0]=12000;
                                break;
                            case 3 :
                                pesanan [idxmkn][0]="Bakso";
                                nominal [idxmkn][0]=10000;
                                break;
                        } 
                        System.out.print("Jumlah = ");
                        porsi =s.nextInt();
                        nominal[idxmkn][2]=porsi; //jumlah porsi makanan
                        //total harga 
                        nominal[idxmkn][4]=nominal[idxmkn][0]*nominal[idxmkn][2];
                        idxmkn++;
                        break;
                    case 2 :
                        System.out.println("MENU MINUMAN");
                        System.out.println("1. Teh");
                        System.out.println("2. Kopi");
                        System.out.println("3. Mineral");
                        System.out.print("Pilih = ");
                        pilih2= s.nextInt();
                        switch(pilih2){
                            case 1 :
                                pesanan [idxmnm][1]="Teh    ";
                                nominal [idxmnm][1]=1500;
                                break;
                            case 2 :
                                pesanan [idxmnm][1]="Kopi   ";
                                nominal [idxmnm][1]=2000;
                                break;
                            case 3 :
                                pesanan [idxmnm][1]="Mineral";
                                nominal [idxmnm][1]=1000;
                                break;
                        } 
                        System.out.print("Jumlah = ");
                        porsi =s.nextInt();
                        nominal[idxmnm][3]=porsi; //jumlah porsi makanan
                        //total harga 
                        nominal[idxmnm][5]=nominal[idxmnm][1]*nominal[idxmnm][3];
                        idxmnm++;
                        break;
                    case 3 :
                        System.out.println("Terima Kasih");
                        break;
                }
        }while (pilih1!=3);
        System.out.println("Daftar Pembelian");
        System.out.println("Makanan");
        for (int i = 0; i < 5; i++) {
            if (pesanan [i][0]!=null){
                System.out.print((i+1)+". "+pesanan[i][0]);
                System.out.print("\t"+nominal[i][0]);
                System.out.print("\t"+nominal[i][2]);
                System.out.print("\t"+nominal[i][4]);
                System.out.println("");  
            }  
        }
        System.out.println("Minuman");
        for (int i = 0; i < 5; i++) {
            if (pesanan [i][1]!=null){
                System.out.print((i+1)+". "+pesanan[i][1]);
                System.out.print("\t"+nominal[i][1]);
                System.out.print("\t"+nominal[i][3]);
                System.out.print("\t"+nominal[i][5]);
                System.out.println("");  
            }  
        }
        System.out.println("");
            
            
            
        }
    }
    
    
}
