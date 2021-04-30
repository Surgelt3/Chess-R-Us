/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

import static cpt_chess.Java_main_panel.CardLayout;
import static cpt_chess.Main_Java_Frame.main_frame;
import static cpt_chess.CPT_Chess.puzzle;
import static cpt_chess.Main_Java_Frame.parent;
import static cpt_chess.puzzles.puzzle_1c;
import static cpt_chess.puzzles.puzzle_1d;
import static cpt_chess.puzzles.puzzle_1f;
import static cpt_chess.puzzles.puzzle_2c;
import static cpt_chess.puzzles.puzzle_2d;
import static cpt_chess.puzzles.puzzle_2f;
import static cpt_chess.puzzles.puzzle_3c;
import static cpt_chess.puzzles.puzzle_3d;
import static cpt_chess.puzzles.puzzle_3f;
import static cpt_chess.puzzles.puzzle_4c;
import static cpt_chess.puzzles.puzzle_4f;
import static cpt_chess.puzzles.puzzle_5c;
import static cpt_chess.puzzles.puzzle_5f;
import static cpt_chess.puzzles.puzzle_6c;
import static cpt_chess.puzzles.puzzle_6f;
import static cpt_chess.puzzles.puzzle_7c;
import static cpt_chess.puzzles.puzzle_7f;
import static cpt_chess.puzzles.puzzle_8f;
import static cpt_chess.puzzles.puzzle_9f;
import static cpt_chess.puzzles.puzzle_selected;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class Puzzle_End_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Puzzle_End_Panel
     */
    public Puzzle_End_Panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Puzzle_Result = new javax.swing.JLabel();
        Select_New_Puzzle = new javax.swing.JButton();
        Try_Again_Button = new javax.swing.JButton();

        setBackground(new java.awt.Color(59, 61, 62));

        Puzzle_Result.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        Puzzle_Result.setForeground(new java.awt.Color(194, 194, 194));
        Puzzle_Result.setText(cpt_chess.Puzzles_Main.winner_loser_text);

        Select_New_Puzzle.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        Select_New_Puzzle.setText("Select New Puzzle");
        Select_New_Puzzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_New_PuzzleActionPerformed(evt);
            }
        });

        Try_Again_Button.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        Try_Again_Button.setText("Try Again");
        Try_Again_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Try_Again_ButtonActionPerformed(evt);
            }
        });
        Try_Again_Button.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Puzzle_Result)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Select_New_Puzzle, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(Try_Again_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(275, 275, 275))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Puzzle_Result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(Select_New_Puzzle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Try_Again_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /*
    pre: java.awt.event.ActionEvent evt
    post: set panel visible false and switch panel to card6
    */
    private void Select_New_PuzzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_New_PuzzleActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CardLayout.show(parent, "card6");
        
    }//GEN-LAST:event_Select_New_PuzzleActionPerformed

    /*
    pre: java.awt.event.ActionEvent evt
    post: removeAll from main_frame and run Puzzles_Main
    */
    private void Try_Again_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Try_Again_ButtonActionPerformed
        // TODO add your handling code here:
        
        if(puzzle_selected.equals("1c")){
            puzzle = puzzle_1c;
            
        }else if(puzzle_selected.equals("2c")){
            puzzle = puzzle_2c;
            
        }else if(puzzle_selected.equals("3c")){
            puzzle = puzzle_3c;
            
        }else if(puzzle_selected.equals("4c")){
            puzzle = puzzle_4c;
            
        }else if(puzzle_selected.equals("5c")){
            puzzle = puzzle_5c;
            
        }else if(puzzle_selected.equals("6c")){
            puzzle = puzzle_6c;
            
        }else if(puzzle_selected.equals("7c")){
            puzzle = puzzle_7c;
            
        }else if(puzzle_selected.equals("1d")){
            puzzle = puzzle_1d;
            
        }else if(puzzle_selected.equals("2d")){
            puzzle = puzzle_2d;
            
        }else if(puzzle_selected.equals("3d")){
            puzzle = puzzle_3d;
            
        }else if(puzzle_selected.equals("1f")){
            puzzle = puzzle_1f;
            
        }else if(puzzle_selected.equals("2f")){
            puzzle = puzzle_2f;
            
        }else if(puzzle_selected.equals("3f")){
            puzzle = puzzle_3f;
            
        }else if(puzzle_selected.equals("4f")){
            puzzle = puzzle_4f;
            
        }else if(puzzle_selected.equals("5f")){
            puzzle = puzzle_5f;
            
        }else if(puzzle_selected.equals("6f")){
            puzzle = puzzle_6f;
            
        }else if(puzzle_selected.equals("7f")){
            puzzle = puzzle_7f;
            
        }else if(puzzle_selected.equals("8f")){
            puzzle = puzzle_8f;
            
        }else if(puzzle_selected.equals("9f")){
            puzzle = puzzle_9f;
            
        }
        
        main_frame.getContentPane().removeAll();
        
        try {
            Puzzles_Main puzzle_main = new Puzzles_Main();
        } catch (IOException ex) {
            Logger.getLogger(Chess_Puzzles_Easy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Chess_Puzzles_Easy.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Try_Again_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Puzzle_Result;
    private javax.swing.JButton Select_New_Puzzle;
    public static javax.swing.JButton Try_Again_Button;
    // End of variables declaration//GEN-END:variables
}