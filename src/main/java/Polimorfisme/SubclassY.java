/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author Radit
 */
public class SubclassY extends SuperclassX {
    SuperclassX objX = new SubclassY();
    SubclassY objY = new SubclassY();

    void subclassMethodY() {
        objY.superclassMethodX();
        int i;
        i = objY.superclassVarX;
    }
}
