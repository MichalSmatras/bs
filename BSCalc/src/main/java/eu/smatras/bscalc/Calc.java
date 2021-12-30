/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu.smatras.bscalc;

import java.io.IOException;

/**
 *
 * @author Misiek
 */
public class Calc {
    public static void main(String[] args) throws IOException {
        
    simpleCalc sc = new simpleCalc("C:\\Users\\Misiek\\Desktop\\1.txt");
    sc.doCalc();
    }
}
