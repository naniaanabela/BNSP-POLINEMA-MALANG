package bpweek3;
import java.util.Scanner;
/**
 * @author Faradila
 */
public class programifelse {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("              Swalayan Sejahtera            ");
        System.out.println("--------------------------------------------");
        int jumlah_barang,harga_satuan,total_harga,uang_bayar;
        double total_akhir,diskon,uang_kembalian;
        //jumlah barang yg dibeli
        System.out.print  ("Masukkan Jumlah Barang      = ");
        jumlah_barang = input.nextInt();
        //harga barang satuan
        System.out.print  ("Harga barang per-satuan     = Rp. ");
        harga_satuan = input.nextInt();
        //total harga
        total_harga = jumlah_barang*harga_satuan;
        System.out.println("Total Harga                 = Rp. "+total_harga);
        
        //penentuandiskon
        System.out.println("--------------------------------------------");
        System.out.println("                  Diskon                    ");
        System.out.println("--------------------------------------------");
            
            if (total_harga<=100000){
                System.out.println      ("Potongan Diskon     = 0%");
                System.out.println      ("Total Akhir         = Rp. "+total_harga);
                System.out.println      ("--------------------------------------------");
                System.out.print        ("Uang Pembayaran     = Rp. ");
                uang_bayar = input.nextInt();
                uang_kembalian = uang_bayar - total_harga;
                if (uang_kembalian == 0){
                    System.out.println  ("Uang PAS");
                    
                } else {
                    System.out.println  ("Uang Kembalian  = Rp. "+uang_kembalian);
            }
            }
            else if (total_harga>=100001 && total_harga <=200000){
                System.out.println      ("Diskon              = 5%");
                diskon = total_harga*0.05;
                System.out.println      ("Potongan Diskon     = Rp. "+diskon);
                total_akhir = total_harga-diskon;
                System.out.println      ("Total Akhir         = Rp. "+total_akhir);
                System.out.println("--------------------------------------------");
                System.out.print        ("Uang Pembayaran     = Rp. ");
                uang_bayar = input.nextInt();
                uang_kembalian = (uang_bayar - total_akhir);
                if (uang_kembalian == 0){
                    System.out.println  ("Uang PAS");
                    
                } 
                else {
                    System.out.println  ("Uang Kembalian      = Rp. "+uang_kembalian);
                }
            
            }
            else if (total_harga>=200001 && total_harga <=300000){
                System.out.println      ("Diskon                = 10%");
                diskon = total_harga*0.1;
                System.out.println      ("Potongan Diskon       = Rp. "+diskon);
                total_akhir = total_harga-diskon;
                System.out.println      ("Total Akhir           = Rp. "+total_akhir);
                System.out.println      ("--------------------------------------------");
                System.out.print        ("Uang Pembayaran       = Rp. ");
                uang_bayar = input.nextInt();
                uang_kembalian = (uang_bayar - total_akhir);
                if (uang_kembalian == 0){
                    System.out.println  ("Uang PAS");
                }
                else {
                    System.out.println  ("Uang Kembalian        = Rp. "+uang_kembalian);
                }
            }
            
            else if (total_harga>=300001 && total_harga<=400000){
                System.out.println      ("Diskon                = 15%");
                diskon = total_harga*0.15;
                System.out.println      ("Potongan Diskon       = Rp. "+diskon);
                total_akhir = total_harga-diskon;
                System.out.println      ("Total Akhir           = Rp. "+total_akhir);
                System.out.println      ("--------------------------------------------");
                System.out.print        ("Uang Pembayaran       = Rp. ");
                uang_bayar = input.nextInt();
                uang_kembalian = (uang_bayar - total_akhir);
                if (uang_kembalian == 0){
                    System.out.println  ("Uang PAS");
                }
                else {
                    System.out.println  ("Uang Kembalian        = Rp. "+uang_kembalian);
                }
            }
            
            else if (total_harga>=400001 && total_harga<=500000){
                System.out.println      ("Diskon                = 20%");
                diskon = total_harga*0.2;
                System.out.println      ("Potongan Diskon       = Rp. "+diskon);
                total_akhir = total_harga-diskon;
                System.out.println      ("Total Akhir           = Rp. "+total_akhir);
                System.out.println      ("--------------------------------------------");
                System.out.print        ("Uang Pembayaran       = Rp. ");
                uang_bayar = input.nextInt();
                uang_kembalian = (uang_bayar - total_akhir);
                if (uang_kembalian==0){
                    System.out.println  ("Uang PAS");
                }
                else {
                    System.out.println  ("Uang Kembalian        = Rp. "+uang_kembalian);
                }
            }
            
            else if (total_harga>=500001){
                System.out.println      ("Diskon                = 25%");
                diskon = total_harga*0.25;
                System.out.println      ("Potongan Diskon       = Rp. "+diskon);
                total_akhir = total_harga-diskon;
                System.out.println      ("Total Akhir           = Rp. "+total_akhir);
                System.out.println      ("--------------------------------------------");
                System.out.print        ("Uang Pembayaran       = Rp. ");
                uang_bayar = input.nextInt();
                uang_kembalian = (uang_bayar - total_akhir);
                if (uang_kembalian==0){
                    System.out.println  ("Uang PAS");
                }
                else {
                    System.out.println  ("Uang Kembalian        = Rp. "+uang_kembalian);
                }
            }
            
        System.out.println("--------------------------------------------");
        System.out.println("      Terima Kasih Atas Kunjungan Anda      ");
            
         
    }
}
   
