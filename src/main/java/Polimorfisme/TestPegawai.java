/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author Radit
 */
public class TestPegawai {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        pegawai.kerja();

        Kurir kurir = new Kurir();
        kurir.kerja();

        Manager manager = new Manager();
        manager.kerja();
    }
}
