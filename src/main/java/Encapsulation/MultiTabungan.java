/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Radit
 */
public class MultiTabungan {

    private int priceAud;
    private int priceUsd;

    public MultiTabungan() {
        this.priceAud = 10000;
        this.priceUsd = 9000;
    }

    public double setIdrToUsd(int amount) {
        return amount / this.priceUsd;
    }

    public double setIdrToAud(int amount) {
        return amount / this.priceAud;
    }

    public int setUsdToIdr(int amount) {
        return amount * this.priceUsd;
    }

    public int setAudToIdr(int amount) {
        return amount * this.priceAud;
    }

}
