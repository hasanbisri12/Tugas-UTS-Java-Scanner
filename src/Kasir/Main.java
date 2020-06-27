/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir;

import java.util.Scanner;

/**
 *
 * @author MOHAMAD HASAN BISRI
 */
public class Main {
    public static void main(String[] args) {
       //Java Library Scanner
       Scanner scan = new Scanner(System.in);
       
        //Header Toko
        System.out.println("======================================");
        System.out.println("||           WARUNG CAK BISRI       ||");
        System.out.println("======================================");
        //Menampilkan Menu Makanan
        System.out.println("|           o MENU MAKANAN o         |");
        System.out.println("|           WARUNG CAK BISRI         |");
        System.out.println("======================================");
        System.out.println("|o NAMA            | HARGA           |");
        System.out.println("|1 Nasi Goreng     |   Rp 15.000     |");
        System.out.println("|2 Ayam Geprek     |   Rp 13.000     |");
        System.out.println("|3 Mie Ayam        |   Rp 12.000     |");
        System.out.println("|4 Kwetiaw         |   Rp 15.000     |");
        System.out.println("|5 Seblak          |   Rp 15.000     |");
        System.out.println("|6 Gado-Gado       |   Rp 10.000     |");
        System.out.println("======================================");
        
        //Pembayaran & kembalian
        int bayar, kembalian;
        //Harga awal
        int harga  = 0;
        //Harga Per-Item Menu
        int m1 = 15000, m2 = 13000, m3 = 12000, m4 = 15000, m5 = 15000, m6 = 10000;
        String menu = null;
        
        //Variable Menu
        int mnNomor = 0, mnJumlah = 0;
        
        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("_____________________________________");
        //Input No Pesanan pada menu
        System.out.print("Pilih Nomor Pesanan yang ada di Menu : ");
        mnNomor = scan.nextInt();
        System.out.print("Masukkan Jumlah Pesanan : ");
        mnJumlah = scan.nextInt();
        System.out.println("_____________________________________");
        
            switch (mnNomor) {
                case 1:
                    //jika di pilih nomor satu, maka yang akan muncul adalah menu Nasi Goreng, dan hargan yang ter tera pada item int pada m1.
                    menu = " Nasi Goreng";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + menu);
                    harga = harga + m1 * mnJumlah;
                    break;
                case 2:
                    //jika di pilih nomor dua, maka yang akan muncul adalah menu Ayam Geprek, dan hargan yang ter tera pada item int pada m2.
                    menu = " Ayam Geprek";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + menu);
                    harga = harga + m2 * mnJumlah;
                    break;
                case 3:
                    //jika di pilih nomor tiga, maka yang akan muncul adalah menu Mie Ayam, dan hargan yang ter tera pada item int pada m3.
                    menu = " Mie Ayam";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + menu);
                    harga = harga + m3 * mnJumlah;
                    break;
                case 4:
                    //jika di pilih nomor empat, maka yang akan muncul adalah menu Kwetiaw, dan hargan yang ter tera pada item int pada m4.
                    menu = " Kwetiaw";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + menu);
                    harga = harga + m4 * mnJumlah;
                    break;
                case 5:
                    //jika di pilih nomor lima, maka yang akan muncul adalah menu Seblak, dan hargan yang ter tera pada item int pada m5.
                    menu = " Seblak";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + menu);
                    harga = harga + m5 * mnJumlah;
                    break;
                case 6:
                    //jika di pilih nomor enam, maka yang akan muncul adalah menu Gado-Gado, dan hargan yang ter tera pada item int pada m6.
                    menu = " Gado-Gado";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + menu);
                    harga = harga + m6 * mnJumlah;
                    break;
                    //jika di pilih selain nomor satu sampai enam, maka akan ditampilkan "Nomor yang dipilih tidak ada di menu."
                default:
                    System.out.println("Nomor pesanan yang dipilih tidak ada pada daftar menu di atas.");
                    break;
            }
            
            System.out.println("Total Yang harus di bayar = Rp."+harga);
            System.out.println("Masukkan Jumlah Uang : ");
            bayar = scan.nextInt();
            kembalian = bayar-harga;
            System.out.println("======================================");
            System.out.println("||         WARUNG CAK BISRI         ||");
            System.out.println("||    Dsn. Bolorejo Ds. Mojojajar   ||");
            System.out.println("||        Telp. 081259780718        ||");
            System.out.println("======================================");
            System.out.println("Anda Memesan :                        ");
            System.out.println(" " + menu +"   " + "X"+mnJumlah +"   " + "Rp"+ harga);
            System.out.println("--------------------------------------");
            System.out.println("Total                " + "Rp" + harga);
            System.out.println("Jumlah Uang          " + "Rp" + bayar);
            System.out.println("Kembalian            " + "Rp" + kembalian);
            System.out.println("======================================");
            System.out.println("||            Terima Kasih          ||");
            System.out.println("||          Selamat Menikmati       ||");
            System.out.println("======================================");

            
            System.out.print("Apakah anda ingin Memesan Lagi? [Y/T] : ");
            i = scan.next();
            
        }
        
        
    }
    }
    

