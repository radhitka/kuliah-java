/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author Radit
 */
public class ManagerNew extends PegawaiNew {

    private int tunjangan;

    public ManagerNew(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int infoTunjangan() {
        return this.tunjangan;
    }

    public int infoGaji() {
        return super.gaji;
    }

}
