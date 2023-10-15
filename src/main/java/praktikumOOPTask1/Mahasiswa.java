/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumOOPTask1;

/**
 *
 * @author Radit
 */
public class Mahasiswa {
    private int nrp;
    private String nama;

    public Mahasiswa(int i, String n) {
        this.nrp = i;
        this.nama = n;
    }

    public int getNrp() {
        return this.nrp;
    }

    public String getNama() {
        return this.nama;
    }
}
