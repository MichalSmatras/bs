/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu.smatras.apiproject2;

import java.io.IOException;

/**
 *
 * @author Misiek
 */
public class Waluta {
    private String symbol;
    private String nazwa;
    private String kurs;
    private String data;  

    public Waluta(String symbol) throws IOException, InterruptedException {
        this.symbol = symbol;
        kurs = new KursNBP(symbol).getKurs();
        nazwa = new KursNBP(symbol).getWalutaName();
        data = new KursNBP(symbol).getKursData();
    }

    public String getSymbol() {
        return symbol;
    }

    public String getKurs() {
        return kurs;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Kurs waluty "+ getNazwa().toUpperCase() + " (" + getSymbol() + ")\n" + "z dnia " + getData() + "\nwynosi: " + getKurs();
    }
    
    
}