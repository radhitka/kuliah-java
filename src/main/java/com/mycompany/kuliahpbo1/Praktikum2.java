/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuliahpbo1;

/**
 *
 * @author Radit
 */
public class Praktikum2 {

    public static void main(String[] args) {

        boolean makan = true;

        System.out.println("Makan " + makan);

        System.out.println(6 + 2 == 5);
        System.out.println(6 + 2 != 5);

        // operasi && (dan)
        int x;
        x = 5;
        System.out.println("x :" + x + " " + (x > 10 && x < 30));
        x = 20;
        System.out.println("x :" + x + " " + (x > 10 && x < 30));
        x = 35;
        System.out.println("x :" + x + " " + (x > 10 && x < 30));

        // operasi || (atau)
        x = 5;
        System.out.println("x :" + x + " " + (x < 10 || x > 30));
        x = 20;
        System.out.println("x :" + x + " " + (x < 10 || x > 30));
        x = 35;
        System.out.println("x :" + x + " " + (x < 10 || x > 30));

        // operasi !(bukan)
        x = 20;
        System.out.println(x >= 30);
        System.out.println(!(x >= 30));

        // if statement
        x = 10;
        if (x == 10) {
            System.out.println("x sama dengan 10");
        }

        x = 15;
        if (x == 10) {
            System.out.println("x sama dengan 10");
        }

        // if statement block dengan else
        x = 40;
        if (x < 30) {
            System.out.println("Kondisi ini adalah true");
            System.out.println("x lebih kecil dari 30");
        } else {
            System.out.println("x lebih besar dari atau sama dengan 30");
        }

        // if statement block dengan else if
        x = 25;
        if (x >= 30) {
            System.out.println("x lebih besar dari atau sama dengan 30");
        } else if (x > 20) {
            System.out.println("x lebih besar dari 20 tapi lebih kecil dari 30");
        } else {
            System.out.println("x lebih kecil dari atau sama dengan 20");
        }

        // switch case
        x = 8;

        switch (x % 2) {
            case 0:
                System.out.println("Bilangan Genap");
                break;
            case 1:
                System.out.println("Bilangan Ganjil");
                break;
        }

        // switch case default
        int rank = 5;
        switch (rank) {
            case 1:
                System.out.println("Mendali Emas");
                break;
            case 2:
                System.out.println("Mendali Perak");
                break;
            case 3:
                System.out.println("Mendali Perunggu");
                break;
            default:
                System.out.println("Mendali Tidak memenangkan mendali");
        }

        // loop while
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // loop for
        for (int j = 1; j <= 5; j++) {
            System.out.println("Loncatan " + j);
        }

        for (int k = 1; k <= 10; k++) {
            if (k > 5) {
                break;
            }
            System.out.println(k);
        }

        for (int l = 1; l <= 10; l++) {
            if (l % 3 == 0) {
                continue;
            }
            System.out.println(l);
        }

        // array
        int[] numbers = { 5, 13, 29 };
        String[] names = { "Tor", "Yad", "Kyy" };

        System.out.println("Nama saya adalah :" + names[0]);

        System.out.println("Nama awal saya adalah :" + names[1]);
        names[1] = "Mahar";
        System.out.println("Nama saya diubah menjadi :" + names[1]);

        // array loop
        for (int j = 0; j < names.length; j++) {
            String name = names[j];
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }

        for (int nummer : numbers) {
            System.out.println(nummer);
        }

        // project akhir
        int[] myNumbers = { 1, 4, 6, 9, 13, 16 };
        int bilangGenap = 0;
        int bilangGanjil = 0;

        for (int myNumber : myNumbers) {
            if (myNumber % 2 == 0) {
                bilangGenap = bilangGenap + myNumber;
            } else {
                bilangGanjil = bilangGanjil + myNumber;
            }
        }

        System.out.println("Jumlah bilangan Genap :" + bilangGenap);
        System.out.println("Jumlah bilangan Genap :" + bilangGanjil);
    }
}
