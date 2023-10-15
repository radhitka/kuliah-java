/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumOOP;

/**
 *
 * @author Radit
 */
public class Hewan { // kelas
    public String nama; // atribut
    public boolean ismamalia; // atribut

    public String getNama() { // method
        return this.nama;
    }

    public String getJenisHewan() { // method
        if (this.ismamalia) {
            return "Mamalia";
        }

        return "Bukan Mamalia";
    }
}
