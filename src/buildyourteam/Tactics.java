/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buildyourteam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author onurk
 */
public class Tactics {
        
    public Tactics() {
        
    }
        
    public String[] tactics() {
        String satir ;
        
        try {
            
            String yol = "C:\\Users\\onurk\\Documents\\NetBeansProjects\\BuildYourTeam\\files\\tactics.txt";
            FileInputStream stream = new FileInputStream(yol);
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buffer = new BufferedReader(reader);
                        
            tactics = new String[100];
            //System.out.println(tactics.length);
            int i = 0;
            while(true) {
                
                satir = buffer.readLine();
                if (satir == null)
                    break;
                
                tactics[i] = satir;
                //System.out.println(tactics[i]);
                i++;
            }
            
        }
        catch(Exception e) {
            System.out.println("Error (counter file doesn't exist): " + e.getMessage());
        }
        
        return tactics;
        
    }
    
    String[] tactics;
}
