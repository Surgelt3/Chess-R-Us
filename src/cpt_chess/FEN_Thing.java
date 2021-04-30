/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author lucas
 */
public class FEN_Thing {
    
    /*
    pre: String[][] locations, String Colour
    post: return array as fen string
    */
    public static String return_FEN(String[][] locations, String Colour){
        
        String FEN_str = "";
        
        //for loops go through array
        for(int i = 0; i < 8; i++){
                        
            String str = "";
            
            for(int j = 0; j < 8; j++){
                
                String location = locations[i][j];
                
                if(location.equalsIgnoreCase("R")|| location.equalsIgnoreCase("N") || location.equalsIgnoreCase("B")|| location.equalsIgnoreCase("Q") || location.equalsIgnoreCase("K") || location.equalsIgnoreCase("P")){
                    
                    int add = str.length();
                    
                    if(add != 0){
                        
                        FEN_str = FEN_str + add;
                        
                    }
                    
                    FEN_str = FEN_str + location;
                    
                    str = "";
                }
                
                if(location.equals("E")){
                    
                    str = str + "E";
                    
                }
                
            }
            
            int add = str.length();
            
            //adding values to FEN_str
            if(add != 0){
                
                FEN_str = FEN_str + add;
            }
            
            
            if(i != 7){
                
                FEN_str = FEN_str + "/";
            
            }
            
        }
      
        return FEN_str + " " + Colour;
    }

}

