/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumConstruct;

/**
 *
 * @author Radit
 */
public class main {
    
    public static void main(String[] args) {
        Manusia man1 = new Manusia();
        man1.setNama("Radit");
        man1.setUmur(19);
        man1.cetak();
        
        System.out.println("========");
        
        Manusia man2 = new Manusia("Radhitka");
        man2.setUmur(17);
        man2.cetak();
        
        System.out.println("========");
        
        Manusia man3 = new Manusia("Radhitka Adha", 18);
        man3.cetak();
        
        System.out.println("========");
    } 
}
