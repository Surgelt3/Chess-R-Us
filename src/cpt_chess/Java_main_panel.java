/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

import static cpt_chess.Main_Java_Frame.splash_screen;
import static cpt_chess.Main_Java_Frame.menu1;
import static cpt_chess.Main_Java_Frame.single_Multiplayer_Prompt1;
import static cpt_chess.Main_Java_Frame.difficulty_game_prompt1;
import static cpt_chess.Main_Java_Frame.chess_trainer_menu;
import static cpt_chess.Main_Java_Frame.puzzle_select_dificulty_panel;
import static cpt_chess.Main_Java_Frame.chess_puzzles_easy;
import static cpt_chess.Main_Java_Frame.game_over_panel;
import static cpt_chess.Main_Java_Frame.puzzle_end_panel;
import static cpt_chess.Main_Java_Frame.lesson_1_panel;
import static cpt_chess.Main_Java_Frame.lessons_menu;
import static cpt_chess.Main_Java_Frame.chess_puzzles_medium;
import static cpt_chess.Main_Java_Frame.chess_puzzles_hard;
import static cpt_chess.Main_Java_Frame.help_panel;
import java.awt.CardLayout;
import javax.swing.JPanel;



/**
 *
 * @author lucas
 */
public class Java_main_panel extends JPanel{

    public static CardLayout CardLayout = new CardLayout();
    
    /*
    pre: none
    post: add all panels to card layout
    */
    public Java_main_panel(){
        
        //call all panels
        splash_screen = new cpt_chess.Splash_Screen();
        menu1 = new cpt_chess.Menu();
        single_Multiplayer_Prompt1 = new cpt_chess.Single_Multiplayer_Prompt();
        difficulty_game_prompt1 = new cpt_chess.Difficulty_Game_Prompt();
        chess_trainer_menu = new cpt_chess.Chess_Trainer_Menu();
        puzzle_select_dificulty_panel = new cpt_chess.Puzzle_Select_Difficulty_Panel();
        chess_puzzles_easy = new cpt_chess.Chess_Puzzles_Easy();
        game_over_panel = new cpt_chess.Game_Over_Panel();
        puzzle_end_panel = new cpt_chess.Puzzle_End_Panel();
        lesson_1_panel = new cpt_chess.Lesson_1_Panel();
        lessons_menu = new cpt_chess.Lessons_Menu();
        chess_puzzles_medium = new cpt_chess.Chess_Puzzles_Medium();
        chess_puzzles_hard = new cpt_chess.Chess_Puzzles_Hard();
        help_panel = new cpt_chess.Help_Panel();

        //add all panels to card layout
        setPreferredSize(new java.awt.Dimension(680, 470));
        this.setLayout(CardLayout);
        this.add(splash_screen, "card1");
        this.add(menu1, "card2");
        this.add(single_Multiplayer_Prompt1, "card3");
        this.add(difficulty_game_prompt1, "card4");
        this.add(chess_trainer_menu, "card5");
        this.add(puzzle_select_dificulty_panel, "card6");
        this.add(chess_puzzles_easy, "card7");
        this.add(game_over_panel, "game_over");
        this.add(puzzle_end_panel, "puzzle_end");
        this.add(lessons_menu, "card8");
        this.add(lesson_1_panel, "card9");
        this.add(chess_puzzles_medium, "card10");
        this.add(chess_puzzles_hard, "card11");
        this.add(help_panel, "help");
        
        
    }
    
}
