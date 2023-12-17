/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author Radit
 */
public class Child extends Parent {
    public static void main(String args[]) {
        Parent p = new Child();
        p.method2();
    }

    int x = 10;

    public void Info() {
        System.out.println("Ini class Child");
    }
}
