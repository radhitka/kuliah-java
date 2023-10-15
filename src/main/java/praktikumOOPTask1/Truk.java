/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumOOPTask1;

/**
 *
 * @author Radit
 */
public class Truk {
    public double muatan;
    public double muatanmax;
    
    public Truk(double beratmax){
        this.muatanmax = beratmax;
    }
    
    public double getMuatan(){
        return this.muatan;
    }
    
    public double getMuatanMax(){
        return this.muatanmax;
    }
    
    public void tambahMuatan(double berat){
        
        double checkMuatan = this.muatan + berat;
        if (checkMuatan >= this.muatanmax ) {
            return;
        }
        
        this.muatan = checkMuatan;
        
        return;
    }
}
