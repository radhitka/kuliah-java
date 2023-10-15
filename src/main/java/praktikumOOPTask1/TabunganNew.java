package praktikumOOPTask1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Radit
 */
public class TabunganNew {
    public int saldo;

    public TabunganNew(int intsaldo) {
        this.saldo = intsaldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void simpanUang(int jumlah) {
        this.saldo = this.saldo + jumlah;
    }

    public boolean ambilUang(int jumlah) {
        
        boolean validateSaldo = jumlah > this.saldo;
        
        if (validateSaldo) {
            return false;
        }
        
        this.saldo = this.saldo - jumlah;

        return true;
    }
}
