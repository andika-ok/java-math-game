/*
developed by Moo.
*/
package math.game;
import java.util.*;
public class CollectAngka{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Penjumlahan op = new Penjumlahan();
        System.out.println("****************************");
        System.out.println("    Math Game Kelompok 3    ");
        System.out.println("****************************");
        System.out.println("Silakan pilih permainan anda");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("Pilih no menu :");
        int choice = in.nextInt();
        if(choice==1){
            op.Play();
        }
    }
}
