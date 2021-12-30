/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu.smatras.apiproject2;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Misiek
 */
public class Wrapper extends JFrame{
    JTextField nazwaWatosc, skrotWatosc, kursDataWatosc,kursWatosc;
    Waluta[] walutyDane;

    public Wrapper() throws HeadlessException, IOException, InterruptedException {
        super("Kursy walut");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 250);        
        setLocationRelativeTo(null); 
        JPanel main = new JPanel();        
        BoxLayout ver = new BoxLayout(main, BoxLayout.Y_AXIS);
        main.setLayout(ver);
        JLabel tekst = new JLabel("Wybierz walutę:");
        JPanel radioWaluty = new JPanel();
        JRadioButton euro = new JRadioButton("EUR");
        JRadioButton usd = new JRadioButton("USD");
        JRadioButton chf = new JRadioButton("CHF");   
        JRadioButton gbp = new JRadioButton("GBP");   
        radioWaluty.add(usd);  
        radioWaluty.add(chf);   
        radioWaluty.add(euro);
        radioWaluty.add(gbp);
        ButtonGroup grupa = new ButtonGroup();
        grupa.add(chf);
        grupa.add(usd);
        grupa.add(euro);
        grupa.add(gbp);
        main.add(tekst);
        main.add(radioWaluty);
        JPanel panelKurs = new JPanel();
        JLabel nazwa = new JLabel("Nazwa:");
        nazwaWatosc = new JTextField(12);
        panelKurs.add(nazwa);
        panelKurs.add(nazwaWatosc);
        JLabel skrot = new JLabel("Symbol:");
        skrotWatosc = new JTextField(4);
        panelKurs.add(skrot);
        panelKurs.add(skrotWatosc);
        JLabel kursData = new JLabel("Z dnia:");
        kursDataWatosc = new JTextField(8);
        panelKurs.add(kursData);
        panelKurs.add(kursDataWatosc);
        JLabel kurs = new JLabel("Kurs:");
        kursWatosc = new JTextField(5);
        panelKurs.add(kurs);
        panelKurs.add(kursWatosc);
        main.add(panelKurs);
        euro.addActionListener(a->{
            if (euro.isSelected()){
                setValues("eur");
            }});
        chf.addActionListener(aa->{
            if (chf.isSelected()){
               setValues("chf");
             }});
        usd.addActionListener(aaaa->{
            if (usd.isSelected()){
                setValues("usd");
            }});
        
        gbp.addActionListener(aaa->{
            if (gbp.isSelected()){
                setValues("gbp");
            }});
        
        add(main);
        pack();
        setVisible(true);   
        walutyDane = Waluty.walutyArr();
     
    }
        private void setValues (String val){
            List <Waluta>kurs =
             Arrays.stream(walutyDane).filter(e->val.equals(e.getSymbol()))
                     .toList();
            nazwaWatosc.setText(kurs.get(0).getNazwa().toUpperCase());
            skrotWatosc.setText(kurs.get(0).getSymbol().toUpperCase());
            kursDataWatosc.setText(kurs.get(0).getData());
            kursWatosc.setText(kurs.get(0).getKurs());
    }
      
    
}

