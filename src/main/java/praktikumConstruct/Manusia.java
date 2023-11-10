/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumConstruct;

/**
 *
 * @author Radit
 */
public class Manusia {
    private int Umur;
    private String Nama;
    
    Manusia(){
        
    }
    
    Manusia(String Nama){
        this.Nama = Nama;
    }
    
    Manusia(String Nama, int Umur){
         this.Nama = Nama;
         this.Umur = Umur;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void setUmur(int umur) {
        this.Umur = umur;
    }
    
    public String getNama(){
        return this.Nama;
    }
    
    public int getUmur(){
        return this.Umur;
    }
    
    public void cetak(){
        System.out.println("Nama : "+this.getNama());
        System.out.println("Umur : "+this.getUmur());
    }
}
