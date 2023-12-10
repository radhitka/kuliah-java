/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

import Task2.Tabungan;

/**
 *
 * @author Radit
 */
public class TestMultiTabunganJava {
    public static void main(String[] args) {
        // tabungan awal Rp 100.000
        Tabungan t = new Tabungan(100000);

        MultiTabungan mt = new MultiTabungan();

        // tambah tabungan menggunakan USD 20 = 20 * 9.000 = 180.000
        int usd = mt.setUsdToIdr(20);
        System.out.println("Saldo disimpan menjadi :" + t.getSaldo());
        t.simpanSaldo(usd);

        // ambil tabungan dengan USD 15 = 15 * 9.000 = 135.000
        int usdGet = mt.setUsdToIdr(15);
        System.out.println("Saldo diambil menjadi :" + t.getSaldo());
        t.ambilSaldo(usdGet);

        // menggunakan RP
        // total saldo sekarang saldo awal 100.000 + 180.000 - 135.000 = 145.000
        System.out.println("Saldo sekarang menggunakan RP: " + t.getSaldo());

        // menggunakan USD
        // total saldo sekarang saldo awal 100.000 + 180.000 - 135.000 = (145.000 /
        // 9.000) = 16.111
        System.out.println("Saldo sekarang menggunakan USD: " + mt.setIdrToUsd(t.getSaldo()));

        System.out.println("================");

        // sisa saldo akhir yaitu 145.000 atau 16.111

        // tambah tabungan menggunakan AUD 10 = 10 * 10.000 = 100.000
        int aud = mt.setAudToIdr(10);
        t.simpanSaldo(aud);
        System.out.println("Saldo disimpan menjadi :" + t.getSaldo());

        // ambil tabungan dengan AUD 5 = 5 * 10.000 = 50.000
        int audGet = mt.setAudToIdr(5);
        t.ambilSaldo(audGet);
        System.out.println("Saldo diambil menjadi :" + t.getSaldo());

        // menggunakan RP
        // total saldo sekarang saldo awal 145.000 + 100.000 - 50.000 = 195.000
        System.out.println("Saldo sekarang menggunakan RP: " + t.getSaldo());

        // menggunakan AUD
        // total saldo sekarang saldo awal 145.000 + 100.000 - 50.000 = (195.000 /
        // 10.000) = 95
        System.out.println("Saldo sekarang menggunakan AUD: " + mt.setIdrToAud(t.getSaldo()));

    }
}
