/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

import java.util.ArrayList;

/**
 *
 * @author Radit
 */
public class Bank {
    private ArrayList<Nasabah> nasabah;
    private int jumlahNasabah;
    
    public Bank(){
        this.nasabah = new ArrayList<>();
        this.jumlahNasabah = 0;
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir){
        Nasabah newNasabah = new Nasabah(namaAwal, namaAkhir);
        this.nasabah.add(newNasabah);
        this.jumlahNasabah++;
    }
    
    public int getJumlahNasabah(){
        return this.jumlahNasabah;
    }
    
    public Nasabah getNasabah(int index){
        return this.nasabah.get(index);
    }
}
