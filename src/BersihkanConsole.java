/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aa
 */
public class BersihkanConsole {
    
    public void BersihkanConsole(){
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        } 
        catch (Exception e) {       
        }
    }
}
