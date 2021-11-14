
package bpSC;
import java.util.Scanner;
/**
 *
 * @author Faradila
 */
public class Programswitchcase {

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("              WARUNG SEDERHANA            ");
        System.out.println("------------------------------------------");
        System.out.println("1. Sate");
        System.out.println("2. Pecel");
        System.out.println("3. Penyetan");
        System.out.print   ("Pilih = ");
        int pilih = input.nextInt();
        switch (pilih){
            case 1 :
                System.out.println  ("1. Sate Ayam      = Rp. 1.500 per-tusuk");
                System.out.println  ("2. Sate Kambing = Rp. 3.000 per-tusuk");
                System.out.print    ("Pesanan         = ");
                int pesanan = input.nextInt();
                if (pesanan == 1 ){
                    System.out.println("------------------------------------------");
                    System.out.print  ("Jumlah Tusuk    = ");
                    int jumlah_tusuk = input.nextInt();
                    int total = jumlah_tusuk*1500;
                        System.out.println("Total           = Rp. "+total);
                        System.out.println("------------------------------------------");
                        System.out.println("Apakah ada member?");
                        System.out.println("1. ada ");
                        System.out.println("2. tidak ada ");
                        System.out.print  ("Member  = ");
                            int member = input.nextInt();
                            if (member==1){
                                System.out.println("------------------------------------------");
                                System.out.println("                     Diskon 5%                 ");
                                double diskon = total*0.05;
                                double total_akhir = total - diskon;
                                System.out.println("Total Akhir = Rp. "+total_akhir);
                            }else {
                                System.out.println("------------------------------------------");
                                System.out.println("          Tidak mendapat diskon           ");
                                System.out.println("Total Akhir = Rp. "+total);
                            }
                    }else {
                    System.out.println("------------------------------------------");
                    System.out.print  ("Jumlah Tusuk = ");
                    int jumlah_tusuk = input.nextInt();
                    int total = jumlah_tusuk*3000;
                        System.out.println("Total        = Rp. "+total);
                        System.out.println("------------------------------------------");
                        System.out.println("Apakah ada member?");
                        System.out.println("1. ada ");
                        System.out.println("2. tidak ada ");
                        System.out.print("Member = ");
                            int member = input.nextInt();
                            if (member==1){
                                System.out.println("------------------------------------------");
                                System.out.println("                    Diskon 5%                 ");
                                double diskon = total*0.05;
                                double total_akhir = total - diskon;
                                System.out.println("Total Akhir = Rp. "+total_akhir);
                            }else {
                                System.out.println("------------------------------------------");
                                System.out.println("          Tidak mendapat diskon         ");
                                System.out.println("Total Akhir = Rp. "+total);
                                }
                    }
            break;
            case 2 : 
                System.out.println("1. Lauk Ayam = Rp. 13.000 per-porsi");
                System.out.println("2. Lauk Empal = Rp. 15.000 per-porsi");
                System.out.print        (" Pesanan = ");
                int pesanan2 = input.nextInt();
                if (pesanan2 == 1 ){
                    System.out.println("------------------------------------------");
                    System.out.print        ("Jumlah porsi = ");
                    int jumlah_porsi = input.nextInt();
                    int total = jumlah_porsi*13000;
                        System.out.println      ("Total = Rp. "+total);
                        System.out.println("------------------------------------------");
                        System.out.println  ("Apakah ada member?");
                        System.out.println  ("1. ada ");
                        System.out.println  ("2. tidak ada ");
                        System.out.print    ("Member = ");
                            int member = input.nextInt();
                            if (member==1){
                                System.out.println("------------------------------------------");
                                System.out.println("                     Diskon 5%                 ");
                                double diskon = total*0.05;
                                double total_akhir = total - diskon;
                                System.out.println("Total Akhir = Rp. "+total_akhir);
                            }else {
                                System.out.println("------------------------------------------");
                                System.out.println("          Tidak mendapat diskon         ");
                                System.out.println("Total Akhir = Rp. "+total);
                            }
                }else {
                    System.out.println("------------------------------------------");
                    System.out.print        ("Jumlah porsi = ");
                    int jumlah_porsi = input.nextInt();
                    int total = jumlah_porsi*15000;
                        System.out.println      ("Total           = Rp. "+total);
                        System.out.println("------------------------------------------");
                        System.out.println  ("Apakah ada member?");
                        System.out.println  ("1. ada ");
                        System.out.println  ("2. tidak ada ");
                        System.out.print    ("Member = ");
                            int member = input.nextInt();
                            if (member==1){
                                System.out.println("------------------------------------------");
                                System.out.println("                     Diskon 5%                 ");
                                double diskon = total*0.05;
                                double total_akhir = total - diskon;
                                System.out.println("Total Akhir = Rp. "+total_akhir);
                            }else {
                                System.out.println("------------------------------------------");
                                System.out.println("          Tidak mendapat diskon         ");
                                System.out.println  ("Total Akhir = Rp. "+total);
                            }
                }
            break;
            case 3 :
                System.out.println("1. Lauk Tahu/Tempe = Rp. 5.000 per-porsi ");
                System.out.println("2. Lauk Telur      = Rp. 7.000 per-porsi");
                System.out.println("3. Lauk Ayam       = Rp. 10.000 per-porsi");
                System.out.print  ("Pesanan = ");
                int pesanan3 = input.nextInt();
                switch (pesanan3){
                    case 1 :
                    System.out.println("------------------------------------------");
                    System.out.print  ("Jumlah Porsi = ");
                    int jumlah = input.nextInt();
                    int total = jumlah*5000;
                        System.out.println("Total        = Rp. "+total);
                        System.out.println("------------------------------------------");
                        System.out.println  ("Apakah ada member?");
                        System.out.println  ("1. ada ");
                        System.out.println  ("2. tidak ada ");
                        System.out.print    ("Member = ");
                            int member = input.nextInt();
                            if (member==1){
                                System.out.println("------------------------------------------");
                                System.out.println("                     Diskon 5%                 ");
                                double diskon = total*0.05;
                                double total_akhir = total - diskon;
                                System.out.println("Total Akhir = Rp. "+total_akhir);
                            }else {
                                System.out.println("------------------------------------------");
                                System.out.println("          Tidak mendapat diskon         ");
                                System.out.println("Total Akhir = Rp. "+total);
                            }
                    break;
                    case 2 :
                        System.out.println("------------------------------------------");
                        System.out.print  ("Jumlah Porsi = ");
                        jumlah = input.nextInt();
                        total = jumlah*7000;
                            System.out.println("Total        = Rp. "+total);
                            System.out.println("------------------------------------------");
                            System.out.println  ("Apakah ada member?");
                            System.out.println  ("1. ada ");
                            System.out.println  ("2. tidak ada ");
                            System.out.print    ("Member = ");
                                member = input.nextInt();
                                if (member==1){
                                    System.out.println("------------------------------------------");
                                    System.out.println("                     Diskon 5%                 ");
                                    double diskon = total*0.05;
                                    double total_akhir = total - diskon;
                                    System.out.println("Total Akhir = Rp. "+total_akhir);
                                }else {
                                    System.out.println("------------------------------------------");
                                    System.out.println("          Tidak mendapat diskon        ");
                                    System.out.println("Total Akhir = Rp. "+total);
                                }
                    break;
                    case 3:
                        System.out.println("------------------------------------------");
                        System.out.print  ("Jumlah Porsi = ");
                        jumlah = input.nextInt();
                        total = jumlah*10000;
                            System.out.println("Total        = Rp. "+total);
                            System.out.println("------------------------------------------");
                            System.out.println  ("Apakah ada member?");
                            System.out.println  ("1. ada ");
                            System.out.println  ("2. tidak ada ");
                            System.out.print    ("Member = ");
                                member = input.nextInt();
                                if (member==1){
                                    System.out.println("------------------------------------------");
                                    System.out.println("                     Diskon 5%                 ");
                                    double diskon = total*0.05;
                                    double total_akhir = total - diskon;
                                    System.out.println("Total Akhir = Rp. "+total_akhir);
                                }else {
                                    System.out.println("------------------------------------------");
                                    System.out.println("          Tidak mendapat diskon           ");
                                    System.out.println("Total Akhir = Rp. "+total);
                                }
                    break; 

            }
        }
    }
}
