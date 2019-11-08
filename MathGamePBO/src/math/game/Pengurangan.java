/*
developed by Moo.
*/
package math.game;
import java.util.Scanner;
public class Pengurangan extends Penjumlahan {
    @Override
    public void Play(){
        Penjumlahan data = new Penjumlahan();
        Penjumlahan ar1 = new Penjumlahan();
        Penjumlahan ar2 = new Penjumlahan();
        Scanner in = new Scanner(System.in);
        Scanner un = new Scanner(System.in);
        System.out.println("Masukkan nama kamu :");
        String username = un.next();
        data.setLevel(1);
        data.setNyawa(3);
        data.setSkor(0);
        int score = data.getSkor();
        int lives = data.getNyawa();
        int lvl = data.getLevel();
        int lvl2 = lvl + 1;
        int lvl3 = lvl2 + 1;
        while (true){
            while(score >= 0 && score < 101){
                if (lives>0){
                    System.out.println("****************************");
                    System.out.println("     Math - Penjumlahan     ");
                    System.out.println("****************************");
                    ar1.setRandom(11);
                    ar2.setRandom(11);
                    int bilangan1 = ar1.getRandom();
                    int bilangan2 = ar2.getRandom();
                    System.out.println("Berapakah hasil dari "+bilangan1+" + "+bilangan2+" ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan){
                        score = score + 4;
                        System.out.println("[Hallo "+username+"][Score: "+score+"][Lives: "+lives+"][level: "+lvl+"]");
                        System.out.println("___________________________________");
                    }else{
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Hallo "+username+"][Score: "+score+"][Lives: "+lives+"][leve1"
                                + "l: "+lvl+"]");
                        System.out.println("___________________________________");
                    }
                }else{
                    System.out.println("[Maaf "+username+" kamu kehabisan nyawa, silakan mulai ulang game ini]");
                    break;
                }
            }
            if(score == -1){
                System.out.println("[Maaf "+username+" skor kamu tidak valid]");
                break;
            }
            while(score > 100 && score < 201){
                if (lives>0){
                    System.out.println("****************************");
                    System.out.println("     Math - Penjumlahan     ");
                    System.out.println("****************************");
                    ar1.setRandom(11);
                    ar2.setRandom(11);
                    int bilangan1 = -1*(1+ar1.getRandom());
                    int bilangan2 = -1*(1+ar2.getRandom());
                    System.out.println("Berapakah hasil dari "+bilangan1+" + "+bilangan2+" ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan){
                        score = score + 4;
                        System.out.println("[Hallo "+username+"][Score: "+score+"][Lives: "+lives+"][level: "+lvl2+"]");
                        System.out.println("___________________________________");
                    }else{
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Hallo "+username+"][Score: "+score+"][Lives: "+lives+"][leve1"
                                + "l: "+lvl2+"]");
                        System.out.println("___________________________________");
                    }
                }else{
                    System.out.println("[Maaf "+username+" kamu kehabisan nyawa, silakan mulai ulang game ini]");
                    break;
                }
            }
            while(score > 200 && score <= 300){
                if (lives>0){
                    System.out.println("****************************");
                    System.out.println("     Math - Penjumlahan     ");
                    System.out.println("****************************");
                    ar1.setRandom(20);
                    ar2.setRandom(20);
                    int bilangan1 = ar1.getRandom()-10;
                    int bilangan2 = ar2.getRandom()-10;
                    System.out.println("Berapakah hasil dari "+bilangan1+" + "+bilangan2+" ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan){
                        score = score + 4;
                        System.out.println("[Hallo "+username+"][Score: "+score+"][Lives: "+lives+"][level: "+lvl3+"]");
                        System.out.println("___________________________________");
                    }else{
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Hallo "+username+"][Score: "+score+"][Lives: "+lives+"][leve1"
                                + "l: "+lvl3+"]");
                        System.out.println("___________________________________");
                    }
                }else{
                    System.out.println("[Maaf "+username+" kamu kehabisan nyawa, silakan mulai ulang game ini]");
                    break;
                }
                if(score >300){
                    System.out.println("[Selamat "+username+", Anda telah menyelesaikan soal penjumlahan dengan baik. Silakan dicoba soal pengurangan ya]");
                    break;
                }
            }
            break;
        }
    }
}
