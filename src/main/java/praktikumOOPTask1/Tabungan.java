/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumOOPTask1;

/**
 *
 * @author Radit
 */
public class Tabungan {
    public int saldo;
    
    public Tabungan(int i){
        this.saldo = i;
    }
    
    public void ambilUang(int jumlah){
        this.saldo = this.saldo - jumlah;
    }
}
