package perulangan;
import java.util.Scanner;
/**
 * @author Faradila
 */
public class perulangantunggal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, jumlah;
        int total = 0;
        do {
            System.out.println("              WARUNG SEDERHANA            ");
            System.out.println("------------------------------------------");
            System.out.println("1. Sate");
            System.out.println("2. Pecel");
            System.out.println("3. Penyetan");
            System.out.println("4. Selesai");
            System.out.print   ("Pilih = ");
            pilih = input.nextInt();
            switch (pilih){
                case 1 : 
                    System.out.println  ("1. Sate Ayam    = Rp. 1.500 per-tusuk");
                    System.out.println  ("2. Sate Kambing = Rp. 3.000 per-tusuk");
                    System.out.print            ("Pesanan         = ");
                    int pesanan = input.nextInt();
                    if (pesanan == 1 ){
                        System.out.print        ("Jumlah Tusuk    = ");
                        jumlah = input.nextInt();
                        int sateayam = 1500;
                        int harga = jumlah*sateayam;
                        total = total + harga;
                        System.out.println      ("Total           = Rp. "+total);
                    }else {
                        System.out.print        ("Jumlah Tusuk    = ");
                        jumlah = input.nextInt();
                        int satekambing = 3000;
                        int harga = jumlah*satekambing;
                        total = total + harga;
                        System.out.println      ("Total           = Rp. "+total);
                    }
                    break;
                
                case 2 :
                    System.out.println("1. Lauk Ayam    = Rp. 13.000 per-porsi");
                    System.out.println("2. Lauk Empal   = Rp. 15.000 per-porsi");
                    System.out.print            (" Pesanan        = ");
                    pesanan = input.nextInt();
                    if (pesanan == 1 ){
                        System.out.print        ("Jumlah Porsi    = ");
                        jumlah = input.nextInt();
                        int pecelayam = 13000;
                        int harga = jumlah*pecelayam;
                        total = total + harga;
                        System.out.println      ("Total           = Rp. "+total);
                    }else {
                        System.out.print        ("Jumlah Porsi    = ");
                        jumlah = input.nextInt();
                        int pecelempal = 15000;
                        int harga = jumlah*pecelempal;
                        total = total + harga;
                        System.out.println      ("Total           = Rp. "+total);
                    }
                    break;
                
                case 3 :
                    System.out.println("1. Lauk Tahu/Tempe = Rp. 5.000 per-porsi ");
                    System.out.println("2. Lauk Telur      = Rp. 7.000 per-porsi");
                    System.out.println("3. Lauk Ayam       = Rp. 10.000 per-porsi");
                    System.out.print            ("Pesanan         = ");
                    pesanan = input.nextInt();
                    switch (pesanan){
                        case 1 :
                            System.out.print    ("Jumlah Porsi    = ");
                            jumlah = input.nextInt();
                            int penyet_tahu = 5000;
                            int harga = jumlah*penyet_tahu;
                            total = total + harga;
                            System.out.println  ("Total           = Rp. "+total);
                        break;
                        case 2 :
                            System.out.print    ("Jumlah Porsi    = ");
                            jumlah = input.nextInt();
                            int penyet_telur = 7000;
                            harga = jumlah*penyet_telur;
                            total = total + harga;
                            System.out.println  ("Total           = Rp. "+total);
                        break;
                        case 3 :
                            System.out.print    ("Jumlah Porsi    = ");
                            jumlah = input.nextInt();
                            int penyet_ayam = 10000;
                            harga = jumlah*penyet_ayam;
                            total = total + harga;
                            System.out.println  ("Total           = Rp. "+total);
                        break;
                    }
            }
        } while (pilih!=4);
            System.out.println("Apa Ada Member?");
            System.out.println("1. Ada");
            System.out.println("2. Tidak");
            System.out.println("Pilih = ");
            int pilihan = input.nextInt();
            if (pilihan == 1){
                System.out.println("-----------------Diskon 5 %---------------");
                double totalakhir = total - (total*0.05);
                System.out.println      (" Total Akhir  = Rp "+totalakhir);
            }
            else {
                System.out.println("--------------Tidak Ada Diskon------------");
                System.out.println      (" Total        = "+total);
            }
            System.out.println("---------------Terima Kasih---------------");
        
    }
    
}
