package cpt_chess;

import static cpt_chess.test_chess.pos_translate;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Math.abs;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class puzzles {

    //lessson paths
    public static int path = 0;
    public static String[] Lesson_1_paths = {"C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_1.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_2.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_3.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_4.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_5.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_6.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_7.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_8.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_9.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\Lesson_1_Img\\Lesson_1_New\\Lesson_1_10.png"};
    public static String[] Lesson_2_paths = {"C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_2_img\\New_Lesson_2\\Lesson_2_1.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_2_img\\New_Lesson_2\\Lesson_2_2.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_2_img\\New_Lesson_2\\Lesson_2_4.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_2_img\\New_Lesson_2\\Lesson_2_5.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_2_img\\New_Lesson_2\\Lesson_2_6.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_2_img\\New_Lesson_2\\Lesson_2_7.png"};
    public static String[] Lesson_3_paths = {"C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_3_img\\New_Lesson_3\\Lesson_3_1.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_3_img\\New_Lesson_3\\Lesson_3_2.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_3_img\\New_Lesson_3\\Lesson_3_3.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_3_img\\New_Lesson_3\\Lesson_3_4.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_3_img\\New_Lesson_3\\Lesson_3_5.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_3_img\\New_Lesson_3\\Lesson_3_6.png"};
    public static String[] Lesson_4_paths = {"C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_4_img\\New_Lesson_4\\Lesson_4_1.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_4_img\\New_Lesson_4\\Lesson_4_2.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_4_img\\New_Lesson_4\\Lesson_4_3.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_4_img\\New_Lesson_4\\Lesson_4_4.png"};
    public static String[] Lesson_5_paths = {"C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_5_img\\New_Lesson_5\\Lesson_5_1.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_5_img\\New_Lesson_5\\Lesson_5_2.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_5_img\\New_Lesson_5\\Lesson_5_3.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_5_img\\New_Lesson_5\\Lesson_5_4.png", "C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Lesson_5_img\\New_Lesson_5\\Lesson_5_5.png"};
    public static String[][] Lessons_All = {Lesson_1_paths, Lesson_2_paths, Lesson_3_paths, Lesson_4_paths, Lesson_5_paths};
    
    public static String puzzle_selected;
    //chess puzzles
    // easy
	static String [][] puzzle_1c = {{"E","E","E","E","E","E","r","k"},{"R","E","E","E","E","E","p","p"},{"E","E","E","N","E","E","E","E"},{"E","E","E","B","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","K","E","E","E"}};
	static int[][] puzzle_1c_answer = {{pos_translate("d"),abs(6-8)},{pos_translate("f"),abs(7-8)}};
        
        static String [][] puzzle_2c = {{"E","E","E","E","E","E","E","E"},{"E","E","k","E","E","E","E","E"},{"E","R","E","N","E","E","E","E"},{"p","E","n","E","E","E","E","E"},{"P","E","N","E","E","E","E","E"},{"K","E","P","E","E","E","E","E"},{"E","P","E","E","E","E","E","E"},{"E","E","E","R","E","E","E","E"}} ;
	static int[][] puzzle_2c_answer = {{pos_translate("d"),abs(1-8)},{pos_translate("a"),abs(1-8)}};
        
        static String [][] puzzle_3c = {{"E","k","r","E","E","E","E","r"},{"p","p","p","E","E","p","p","p"},{"E","E","E","E","b","E","E","E"},{"E","E","E","E","P","E","K","E"},{"q","E","n","P","B","B","E","E"},{"E","P","p","E","E","E","E","P"},{"E","b","P","E","E","Q","P","E"},{"E","K","E","R","E","E","E","R"}};
	static int[][] puzzle_3c_answer = {{pos_translate("a"),abs(4-8)},{pos_translate("a"),abs(1-8)}};
        
	static String [][] puzzle_4c = {{"r","E","b","E","k","b","E","r"},{"p","p","E","n","E","E","p","E"},{"E","Q","p","E","p","E","E","p"},{"E","E","E","E","E","E","E","E"},{"E","E","P","P","E","E","E","B"},{"E","E","E","B","E","N","E","E"},{"P","E","E","E","E","P","P","P"},{"R","E","E","E","E","R","K","E"}};
	static int [][] puzzle_4c_answer = {{pos_translate("d"),abs(3-8)},{pos_translate("g"),abs(6-8)}};
        
	static String [][] puzzle_5c = {{"r","n","E","k","E","b","n","r"},{"p","p","p","E","E","E","p","p"},{"E","E","E","E","E","p","E","E"},{"E","E","E","p","p","E","E","E"},{"E","E","E","P","E","E","E","E"},{"E","E","N","E","P","B","E","E"},{"P","P","b","K","E","P","E","P"},{"R","E","B","E","Q","q","E","R"}};
	static int [][] puzzle_5c_answer = {{pos_translate("f"),abs(1-8)},{pos_translate("d"),abs(3-8)}};
        
	static String [][] puzzle_6c = {{"r","E","E","q","E","b","E","r"},{"p","p","p","b","k","E","E","p"},{"E","E","E","p","E","E","B","E"},{"E","E","E","P","p","E","E","E"},{"E","E","P","E","E","E","E","E"},{"E","E","E","E","B","E","E","P"},{"P","P","E","E","E","P","P","E"},{"R","E","E","E","K","E","E","R"}};
	static int [][] puzzle_6c_answer = {{pos_translate("e"),abs(3-8)},{pos_translate("g"),abs(5-8)}};
        
	static String [][] puzzle_7c = {{"r","E","E","E","k","b","n","r"},{"p","p","E","E","p","p","p","p"},{"n","E","E","E","E","E","E","E"},{"B","E","p","P","p","E","E","E"},{"E","E","E","E","P","E","E","E"},{"E","E","E","E","E","E","E","E"},{"P","P","P","E","E","P","P","P"},{"R","N","E","b","K","B","E","R"}};
	static int [][] puzzle_7c_answer = {{pos_translate("f"),abs(1-8)},{pos_translate("b"),abs(5-8)}};
        
// all hard 
	static String [][] puzzle_1d = {{"E","E","E","E","b","b","r","E"},{"E","E","E","E","E","E","E","E"},{"k","q","N","E","p","B","E","E"},{"E","p","E","p","E","E","E","p"},{"r","P","E","P","P","E","E","P"},{"E","E","Q","E","R","P","E","E"},{"E","E","P","E","E","E","E","E"},{"E","K","E","R","E","E","E","E"}};
	static int [][] puzzle_1d_answer = {{pos_translate("e"),abs(8-8)},{pos_translate("c"),abs(6-8)}};
        
        static String [][] puzzle_2d = {{"E","k","r","E","E","E","E","r"},{"p","E","p","E","E","E","E","q"},{"E","E","R","b","E","E","E","E"},{"Q","E","E","p","N","p","p","E"},{"E","E","E","P","E","E","E","E"},{"P","P","E","E","P","P","N","E"},{"K","B","E","E","E","E","P","E"},{"E","E","E","E","K","E","E","E"}};
	static int [][] puzzle_2d_answer = {{pos_translate("h"),abs(8-8)},{pos_translate("d"),abs(8-8)}};
        
        static String [][] puzzle_3d = {{"E","E","k","n","r","E","E","E"},{"E","E","p","E","E","E","p","p"},{"p","E","E","E","b","p","E","E"},{"E","p","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"P","B","E","E","E","N","E","E"},{"E","P","P","E","E","P","P","P"},{"E","K","E","B","E","E","E","E"}};
	static int [][] puzzle_3d_answer = {{pos_translate("d"),abs(6-8)},{pos_translate("g"),abs(3-8)}};
	
	static String [][] puzzle_1f = {{"E","E","E","E","B","E","E","E"},{"E","E","E","E","E","E","k","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","B","E","E","E","E"},{"p","r","E","E","E","E","E","E"},{"E","E","E","E","E","Q","P","P"},{"E","E","E","E","E","E","E","K"},{"E","E","E","E","E","E","E","E"}};
	static int [][] puzzle_1f_answer = {{pos_translate("f"),abs(3-8)},{pos_translate("c"),abs(3-8)}};
        
        static String [][] puzzle_2f = {{"r","E","b","E","k","E","n","r"},{"p","E","p","p","E","E","p","p"},{"E","E","p","E","q","E","E","E"},{"E","E","E","N","E","E","E","E"},{"E","E","N","E","P","E","E","E"},{"E","E","E","E","E","E","E","E"},{"P","P","P","P","E","P","P","P"},{"R","E","E","E","E","R","K","E"}};
	static int [][] puzzle_2f_answer = {{pos_translate("d"),abs(5-8)},{pos_translate("c"),abs(7-8)}};
        
        static String [][] puzzle_3f = {{"E","E","E","E","E","E","r","k"},{"R","E","E","E","E","E","p","p"},{"E","E","E","N","E","E","E","E"},{"E","E","E","B","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","K","E","E","E"}};
	static int [][] puzzle_3f_answer = {{pos_translate("f"),abs(3-8)},{pos_translate("c"),abs(3-8)}};
        
        static String [][] puzzle_4f = {{"r","E","E","k","E","E","E","r"},{"p","b","p","q","E","E","p","p"},{"E","p","E","E","p","E","E","E"},{"E","E","E","p","E","p","E","E"},{"E","E","E","P","n","P","E","E"},{"B","P","N","B","P","E","E","E"},{"P","E","P","E","Q","E","P","P"},{"R","E","E","K","E","E","E","R"}};
	static int [][] puzzle_4f_answer = {{pos_translate("e"),abs(4-8)},{pos_translate("c"),abs(3-8)}};
        
        static String [][] puzzle_5f = {{"E","k","r","E","r","E","E","E"},{"p","p","p","E","E","E","p","p"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","p","b","E","E"},{"E","n","E","E","N","E","E","E"},{"K","P","E","E","Q","E","E","E"},{"E","E","P","N","E","E","P","P"},{"E","E","E","R","E","R","E","E"}};
	static int [][] puzzle_5f_answer = {{pos_translate("e"),abs(4-8)},{pos_translate("d"),abs(2-8)}};
	
	static String [][] puzzle_6f = {{"E","k","r","E","E","r","E","E"},{"p","p","p","E","E","E","b","p"},{"E","E","n","p","E","E","p","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","P","n","E","E","E"},{"E","Q","E","E","E","E","P","E"},{"P","P","P","E","E","P","B","P"},{"E","K","R","E","E","E","E","R"}};
	static int [][] puzzle_6f_answer = {{pos_translate("b"),abs(4-8)},{pos_translate("c"),abs(2-8)}};
        
	static String [][] puzzle_7f = {{"r","E","b","q","k","b","E","r"},{"p","p","p","p","E","p","p","p"},{"E","E","n","E","E","n","E","p"},{"E","E","E","E","p","E","N","E"},{"E","E","B","E","P","E","E","E"},{"P","P","P","P","E","P","P","P"},{"R","N","B","Q","K","E","E","R"},{"E","E","E","E","K","E","E","E"}};
	static int [][] puzzle_7f_answer = {{pos_translate("g"),abs(5-8)},{pos_translate("f"),abs(7-8)}};
        
        static String [][] puzzle_8f = {{"r","n","b","q","k","E","n","r"},{"p","E","p","p","E","E","E","p"},{"E","p","E","E","E","E","p","E"},{"E","E","E","E","p","E","E","Q"},{"E","b","B","E","P","E","E","E"},{"E","E","N","E","E","E","E","E"},{"P","P","P","P","E","P","P","P"},{"R","E","B","E","K","E","E","R"}};
	static int [][] puzzle_8f_answer = {{pos_translate("h"),abs(5-8)},{pos_translate("e"),abs(5-8)}};
        
        static String [][] puzzle_9f = {{"E","E","E","E","E","E","r","E"},{"p","E","E","q","E","k","E","E"},{"E","p","E","E","E","E","E","E"},{"E","E","p","E","P","E","E","E"},{"E","E","N","p","E","E","p","E"},{"E","E","E","E","E","p","P","E"},{"P","P","E","Q","E","P","E","P"},{"E","E","E","E","E","K","E","E"}};
	static int [][] puzzle_9f_answer = {{pos_translate("e"),abs(5-8)},{pos_translate("e"),abs(6-8)}};
        	
	
}
