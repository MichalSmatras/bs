/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu.smatras.apiproject2;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author Misiek
 */
public class Waluty {
    static Waluta[] walutyArr() throws IOException, InterruptedException{
   Waluta[] waluty = {
        new Waluta("chf"),
        new Waluta("usd"),
        new Waluta("gbp"),
        new Waluta("eur")
   };
    return waluty;
    }
    
}
