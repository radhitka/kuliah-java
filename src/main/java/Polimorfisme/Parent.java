/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author Radit
 */
public class Parent {
    int x = 5;

    public void Info() {
        System.out.println("Ini class Parent");
    }

    public void method2() {
        System.out.println("Parent's method2()");
        method1();
    }

    private void method1() {
        System.out.println("Parent's method1()");
    }
}
