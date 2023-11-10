/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author Radit
 */
public class TestLatihan {
    public static void main(String[] args) {
        int tmp;
        boolean status;
        
        Nasabah nasabah = new Nasabah("Agus","Daryanto");
        System.out.println("Nasabah atas nama " + nasabah.getNamaAwal() +" "+ nasabah.getNamaAkhir());
        
        nasabah.setTabungan(new Tabungan(5000));
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo awal :" + tmp);
        
        nasabah.getTabungan().simpanSaldo(3000);
        System.out.println("Jumlah yang disimpan 3000");
        
        status = nasabah.getTabungan().ambilSaldo(6000);
        System.out.println("Uang yang diambil 6000");
        
        if (status) {
            System.out.println("OK");
        }else{
            System.out.println("Gagal");
        }
        
        nasabah.getTabungan().simpanSaldo(3500);
        System.out.println("Jumlah yang disimpan 3500");
        
        status = nasabah.getTabungan().ambilSaldo(4000);
        System.out.println("Uang yang diambil 4000");
        
        if (status) {
            System.out.println("OK");
        }else{
            System.out.println("Gagal");
        }
        
        status = nasabah.getTabungan().ambilSaldo(1600);
        System.out.println("Uang yang diambil 1600");
        
        if (status) {
            System.out.println("OK");
        }else{
            System.out.println("Gagal");
        }
        
        nasabah.getTabungan().simpanSaldo(2000);
        System.out.println("Jumlah yang disimpan 2000");
        
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo selarang = " + tmp);
    }
}
