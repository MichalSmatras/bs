/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu.smatras.bscalc;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author Misiek
 */
/* 
Generalnie nie dziala (3x zmienialem koncepcje), ale i tak wysle
dodawanie kolejnych operacji przez rozbudowanie switcha
logowanie w logOut()
*/

public class simpleCalc {
    private String in;
    Stack <Integer> s = new Stack();
    
    public simpleCalc(String in) {
        this.in = in;
    }

    void doCalc() throws IOException{   
        int tmp1;
        String tmp;
        Scanner sc = new Scanner(in);
        while(sc.hasNextLine()) {
           String line = sc.nextLine();
            System.out.println(line);
            if (NumberUtils.toInt(line) != 0)
                s.push(NumberUtils.toInt(line));
            else {
                switch (line){
                    case "ADD":
                        tmp = sc.nextLine();
                        logOut("ADD",tmp);
                        break;
                    case "MULTIPLY":
                        tmp = sc.nextLine();
                        logOut("MULTIPLY", tmp);
                        break; 
                }
            }
            
    }
    }


    private void logOut(String op,  String val2) {
      int sum;
      if (op == "ADD"){
          int pop1 = s.pop();
          int val = NumberUtils.toInt(val2);
          System.out.println(pop1 + " + " + val + " = " + pop1+val);
          s.push(pop1+val);          
      }
      else if (op == "MULTIPLY"){
          int pop1 = s.pop();
          int val = NumberUtils.toInt(val2);
          System.out.println(pop1 + " * " + val + " = " + pop1*val);
          s.push(pop1*val);          
      }
        
    }    
    
}
