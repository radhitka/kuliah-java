/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author Radit
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public void simpanSaldo(int jumlah){
        this.saldo = this.saldo + jumlah;
    }
    
    public boolean ambilSaldo(int jumlah){
        boolean check = this.saldo > jumlah;
        if (check) {
            this.saldo = this.saldo - jumlah;
            
            return true;
        }
        return false;
    }
}
