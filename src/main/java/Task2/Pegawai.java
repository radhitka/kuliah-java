/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author Radit
 */
public class Pegawai {
    public int nip;
    String nama;
    
    public Pegawai(int nip){
        this(nip, "NoName");
    }
    
    public Pegawai(int nip,String nama_pegawai){
        this.nip = nip;
        this.nama = nama_pegawai;
    }
}
