/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author Radit
 */
public class TestTugas {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        bank.tambahNasabah("Agus", "Daryanto");
        bank.getNasabah(0).setTabungan(new Tabungan(5000));
        
        bank.tambahNasabah("Tuti", "Irawan");
        bank.getNasabah(1).setTabungan(new Tabungan(7000));
        
        bank.tambahNasabah("Ani", "Ratna");
        bank.getNasabah(2).setTabungan(new Tabungan(4000));
        
        bank.tambahNasabah("Bambang", "Darmawan");
        bank.getNasabah(3).setTabungan(new Tabungan(6500));
      
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            
            String namaAwal = bank.getNasabah(i).getNamaAwal();
            String namaAkhir = bank.getNasabah(i).getNamaAkhir();
            int saldo = bank.getNasabah(i).getTabungan().getSaldo();
            
            System.out.println("Nasabah ke-" + (i+1) + " : " + namaAwal+ " " + namaAkhir +" ; Saldo = " + saldo);
        }
    }
}
