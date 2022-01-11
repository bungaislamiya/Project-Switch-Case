/*
Nama    : Bunga Islamiya Putri
NPM     : 20191310053
 */
package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a, b ;

        System.out.println("\tProgram switch case");
        System.out.print("masukan nilai A:");
        a= input.nextInt();
        System.out.print("masukan nilai B:");
        b= input.nextInt();
        System.out.println("Menu Pilihan");
        System.out.println("1.Penjumlahan");
        System.out.println("2.PEngurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.print("Masukan Pilihan Anda :");
        int pilihan = input.nextInt();

        switch(pilihan){
            case 1: {
                int jumlah = a + b;
                System.out.println("Penjumlahan" +a+ " + " + b+"adalah "+jumlah);
                break;
            }
            case 2:  {
                int kurang = a - b;
                System.out.println("Pengurangan" +a+ " - " + b+"adalah "+kurang);
                break;

            }
            case 3: {
                int bagi = a / b;
                System.out.println("Pembagian" +a+ " / " + b+"adalah "+bagi);
                break;
            }
            case 4: {
                int kali = a * b;
                System.out.println("Perkalian" +a+ " * " + b+"adalah "+kali);
                break;
            }
        }
        // TODO code application logic here
    }
}
