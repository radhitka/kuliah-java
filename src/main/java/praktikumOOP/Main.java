package praktikumOOP;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Radit
 */
public class Main {

    public static void main(String[] args) {

        Hewan hewan1 = new Hewan();
        hewan1.nama = "Kelinci";
        hewan1.ismamalia = true;
        
        Hewan hewan2 = new Hewan();
        hewan2.nama = "Ayam";
        hewan2.ismamalia = false;
        
        System.out.println("Hewan pertama adalah " + hewan1.getNama() + " dan adalah " + hewan1.getJenisHewan());
        System.out.println("Hewan kedua adalah " + hewan2.getNama() + " dan adalah " + hewan2.getJenisHewan());
    }
}
