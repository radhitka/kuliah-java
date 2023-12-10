/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Radit
 */
public class Truk {
    private double muatan;
    private double muatanmaks;
    private double newtsInKilo;

    Truk(double beratmaks) {
        this.muatanmaks = beratmaks;
        this.newtsInKilo = 9.8;
    }

    public double getMuatanMaks() {
        return this.muatanmaks;
    }

    public double getMuatan() {
        return this.muatan;
    }

    public void setMuatan(double muatan) {
        this.muatan = muatan;
    }

    public boolean tambahMuatan(double berat) {

        double total = this.muatan + berat;

        boolean check = total >= this.getMuatanMaks();
        if (check) {
            return false;
        }

        this.muatan = total;
        return true;

    }

    public double newtsToKilo(double berat) {
        return berat / this.newtsInKilo;
    }

    public double kiloToNewts(double berat) {
        return berat * this.newtsInKilo;
    }
}
