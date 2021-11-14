package program_Array;
import java.util.Scanner;
/**
 *
 * @author Faradila
 */
public class array1D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pesanan[];
        pesanan = new String[5];
        int harga[] = new int[5];
        int porsi[] = new int[5];
        int total[] = new int[5];
        int indeks = 0; //indeks array
        int jumlah;
        int pilih = 0;
        int total_akhir=0;
        System.out.println("                        WARUNG SEDERHANA                    ");
        System.out.println("------------------------------------------------------------");

        do{
            System.out.println("--DAFTAR MENU--");
            System.out.println("1. Sate     [15.000]");
            System.out.println("2. Soto     [10.000]");
            System.out.println("3. Rawon    [12.000]");
            System.out.println("4. Pecel    [ 8.000]");
            System.out.println("5. Bakso    [10.000]");
            System.out.println("6. Selesai");
            System.out.print("Pilih = ");
            pilih = s.nextInt();

            switch (pilih){
                case 1 :
                    pesanan[indeks]="Sate";
                    harga[indeks]= 15000;
                    System.out.print("Porsi = ");
                    porsi[indeks]= s.nextInt();
                    jumlah = porsi[indeks]*15000;
                    total[indeks]= jumlah;
                    total_akhir = total_akhir + total[indeks];
                    break;
                case 2 :
                    pesanan[indeks]="Soto";
                    harga[indeks]= 10000;
                    System.out.print("Porsi = ");
                    porsi[indeks]= s.nextInt();
                    jumlah = porsi[indeks]*10000;
                    total[indeks]= jumlah;
                    total_akhir = total_akhir + total[indeks];
                    break;  
                case 3 :
                    pesanan[indeks]="Rawon";
                    harga[indeks]= 12000;
                    System.out.print("Porsi = ");
                    porsi[indeks]= s.nextInt();
                    jumlah = porsi[indeks]*12000;
                    total[indeks]= jumlah;
                    total_akhir = total_akhir + total[indeks];
                    break;
                case 4 :
                    pesanan[indeks]="Pecel";
                    harga[indeks]= 8000;
                    System.out.print("Porsi = ");
                    porsi[indeks]= s.nextInt();
                    jumlah = porsi[indeks]*8000;
                    total[indeks]= jumlah;
                    total_akhir = total_akhir + total[indeks];
                    break;
                case 5 :
                    pesanan[indeks]="Bakso";
                    harga[indeks]= 10000;
                    System.out.print("Porsi = ");
                    porsi[indeks]= s.nextInt();
                    jumlah = porsi[indeks]*10000;
                    total[indeks]= jumlah;
                    total_akhir = total_akhir + total[indeks];
                    break;
            }indeks++;
        }while (pilih!=6);
        //menampilkan pesanan
        System.out.println("------------------------------------------------------------");
        System.out.println("PESANAN");
        for (int i=0; i< indeks-1; i++){
            System.out.println((i+1) + "." + pesanan[i]+ "\t Rp. " + harga[i] + "\t Porsi : "+porsi[i]+ "\t Jumlah : Rp. "+total[i]);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("TOTAL : Rp. "+total_akhir);
        
    }
}
