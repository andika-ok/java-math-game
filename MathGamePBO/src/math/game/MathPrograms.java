/*
developed by Moo.
 */
package math.game;

import java.util.*;

public class MathPrograms {

    public int pilihan_menu, pilihan_menu_dua, last_level, last_score;

    public void Playthegame() {
        Scanner in = new Scanner(System.in);
        MathMainClass cplus = new MathMainClass();
        MathMainClass cmin = new MathSubClass();
        System.out.println("****************************");
        System.out.println("    Math Game Kelompok 3    ");
        System.out.println("****************************");
        System.out.println("Silakan pilih permainan anda");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("Pilih no menu :");
        pilihan_menu = in.nextInt();
        if (pilihan_menu == 1) {
            System.out.println("****************************");
            System.out.println("     Math - Penjumlahan     ");
            System.out.println("****************************");
            System.out.println("1. Lanjut");
            System.out.println("2. Ulang");
            System.out.println("Pilih no menu :");
            pilihan_menu_dua = in.nextInt();
            if (pilihan_menu_dua == 1) {
                System.out.println("****************************");
                System.out.println("     Math - Penjumlahan     ");
                System.out.println("****************************");
                System.out.println("Masukkan Level Terakhir : ");
                last_level = in.nextInt();
                System.out.println("Masukkan Score Terakhir : ");
                last_score = in.nextInt();
                cplus.Play(last_score, last_level);
            } else if (pilihan_menu_dua == 2) {
                cplus.Play();
            }
        } else if (pilihan_menu == 2) {
            System.out.println("****************************");
            System.out.println("     Math - Pengurangan     ");
            System.out.println("****************************");
            System.out.println("1. Lanjut");
            System.out.println("2. Ulang");
            System.out.println("Pilih no menu :");
            pilihan_menu_dua = in.nextInt();
            if (pilihan_menu_dua == 1) {
                System.out.println("****************************");
                System.out.println("     Math - Penjumlahan     ");
                System.out.println("****************************");
                System.out.println("Masukkan Level Terakhir : ");
                last_level = in.nextInt();
                System.out.println("Masukkan Score Terakhir : ");
                last_score = in.nextInt();
                cmin.Play(last_score, last_level);
            } else if (pilihan_menu_dua == 2) {
                cmin.Play();
            }
        } else {

        }

    }
}
