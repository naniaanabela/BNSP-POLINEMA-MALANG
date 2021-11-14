package Perulangan_bersarang;
import java.util.Scanner;
/*
 * @author Faradila
 */
public class bilprima {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Masukkan N = ");
        N = input.nextInt();
        System.out.println("---------------");
        
        int bil = 2; 
        while(N!=0){
            int faktor=0;
            for(int i=1;i<=bil;i++){
                if(bil%i == 0){
                    faktor++;
                }
            }
            if(faktor == 2){
                System.out.print(bil+" ");
                N--;
            }
            bil++;
        }
        System.out.println("");
     }
}
    
 
   
