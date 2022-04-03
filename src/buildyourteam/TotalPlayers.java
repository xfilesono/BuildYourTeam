
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xfilesono
 */
public class TotalPlayers {
    
    public int totalPlayers(String str) {
        int counter = 0;
        try {
            FileInputStream stream = new FileInputStream(str);
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buffer = new BufferedReader(reader);

            for(int i = 0 ; i < 40 ; i++) {
                counter += buffer.lines().count();
            }
        }
        catch(Exception e) {
            System.out.println("Error (Number of Team Players): " + e.getMessage());
        }
        
        return counter;
    }
    
}
