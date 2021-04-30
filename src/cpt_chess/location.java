/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

/**
 *
 * @author asali
 */
public class location {
    
    /*
    pre: none
    post: returns user directory for sf file
    */
    public static String getdir()
    {
        return System.getProperty("user.dir") + "\\src\\cpt_chess\\sf.exe";
        
    }
    
}
