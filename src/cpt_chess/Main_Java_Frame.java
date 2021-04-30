/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

import static cpt_chess.io.write_file;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lucas
 */
public class Main_Java_Frame {
    
    //static variables
    public static cpt_chess.Splash_Screen splash_screen;
    public static cpt_chess.Menu menu1;
    public static cpt_chess.Single_Multiplayer_Prompt single_Multiplayer_Prompt1;
    public static cpt_chess.Difficulty_Game_Prompt difficulty_game_prompt1;
    public static cpt_chess.Chess_Trainer_Menu chess_trainer_menu;
    public static cpt_chess.Puzzle_Select_Difficulty_Panel puzzle_select_dificulty_panel;
    public static cpt_chess.Chess_Puzzles_Easy chess_puzzles_easy;
    public static cpt_chess.Game_Over_Panel game_over_panel;
    public static cpt_chess.Lessons_Menu lessons_menu;
    public static cpt_chess.Lesson_1_Panel lesson_1_panel;
    public static cpt_chess.Puzzle_End_Panel puzzle_end_panel;
    public static cpt_chess.Chess_Puzzles_Medium chess_puzzles_medium;
    public static cpt_chess.Chess_Puzzles_Hard chess_puzzles_hard;
    public static cpt_chess.Help_Panel help_panel;
    public static cpt_chess.Java_main_panel parent;
    public static JFrame main_frame;
    
    /*
    pre: none
    post: add parent to main_frame
    */
    public Main_Java_Frame() throws IOException{
        
        main_frame = new JFrame();
        
        parent = new cpt_chess.Java_main_panel();

        main_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        main_frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        //if window is exited
        main_frame.addWindowListener(new WindowAdapter() {
            @Override
            /*
            pre: WindowEvent event
            post: run exitProcedure function
            */
            public void windowClosing(WindowEvent event) {
                try {
                    exitProcedure();
                } catch (IOException ex) {
                    Logger.getLogger(Main_Java_Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        //set frame size
        
        main_frame.setPreferredSize(new java.awt.Dimension(750, 500));
        main_frame.setResizable(false);
        main_frame.getContentPane().setLayout(new java.awt.CardLayout());
        
        //add to frame and set visible
        main_frame.add(parent);
        
        main_frame.pack();
        main_frame.setVisible(true);
        
    }
    
    
    /*
    pre: none
    post: write to file XPtot
    post: exit code and frame
    */
    public void exitProcedure() throws IOException{
        
        write_file("exp", Integer.toString(cpt_chess.Experience.XPtot));
        main_frame.dispose();
        System.exit(0);
        
    }
    
}
