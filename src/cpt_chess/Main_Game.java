/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

import static cpt_chess.Main_Java_Frame.main_frame;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author lucas
 */
public class Main_Game{
    
    //static variables
    public static ArrayList<String> index_highlight = new ArrayList<String>();
    public static boolean White_turn = true;
    public static int turn_counter = 0;
    public static boolean promotion_possible = false;
    public static boolean has_moved = false;
    public static int amount_pawn_White = 8;
    public static int amount_pawn_Black = 8;
    public static int amount_queen_White = 1;
    public static int amount_queen_Black = 1;
    public static int amount_rook_White = 2;
    public static int amount_rook_Black = 2;
    public static int amount_knight_White = 2;
    public static int amount_knight_Black = 2;
    public static int amount_bishop_Black = 2;
    public static int amount_bishop_White = 2;
    public cpt_chess.Chess_Board_Panel main_game_panel;
    public static JPanel Main_Game_Panel;
    
    /*
    pre: none
    post: removeAll from main_frame and add main_game_panel
    */
    public Main_Game() throws IOException, InterruptedException{
        
        main_frame.getContentPane().removeAll();
        main_game_panel = new cpt_chess.Chess_Board_Panel();
        
        
        main_frame.add(main_game_panel);
        main_frame.revalidate();
        main_frame.repaint();
        
        
    }
    
   
    
    
}
