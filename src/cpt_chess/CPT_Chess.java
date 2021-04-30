/*
Names: Lucas T, Asa L, Chris N, Junhu W
Course Code: ICS4U1-02
Written on April 29
Title: Chess r us
Description: A multifaceted and multidimensional chess application designed to help beginner players expand their mental capacity in the area of chess and advanced players to refine their skills to the highest ability. It provides this service by allowing the player to play against the computer of their desired skill level. While giving them access to wide range education tools in the way of puzzles and lessons to learn more. It also offers the unique feature of being customizable in the way of different chess skins.     

 */
package cpt_chess;

import static cpt_chess.Chess_Board_Panel.game_panel;
import static cpt_chess.Main_Game.Main_Game_Panel;
import static cpt_chess.io.createFile;
import static cpt_chess.io.read_file;
import java.io.IOException;
import static cpt_chess.test_chess.highlight_squares;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author lucas
 */
public class CPT_Chess {

    /**
     * @param args the command line arguments
     */
    
    
    public static String level_str = "20";
    public static String colour_select;
    public static int[][] puzzles_answers;
    public static String[][] puzzle;
    
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        
        
        //creating new file and reading the file for expirience
        createFile("exp");
        cpt_chess.Experience.XPtot = Integer.valueOf(read_file ("exp"));
        
        //runnning program
        cpt_chess.Main_Java_Frame Main_Java_Frame;
        Main_Java_Frame = new cpt_chess.Main_Java_Frame();
        
        //cpt_chess.Test_Frame testing;
        //testing = new cpt_chess.Test_Frame();
        
        
    }
    
}
