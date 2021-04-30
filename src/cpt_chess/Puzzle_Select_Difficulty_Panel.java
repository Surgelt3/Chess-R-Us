/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

import static cpt_chess.Java_main_panel.CardLayout;
import static cpt_chess.Main_Java_Frame.parent;

/**
 *
 * @author lucas
 */
public class Puzzle_Select_Difficulty_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Puzzle_Select_Panel
     */
    public Puzzle_Select_Difficulty_Panel() {
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

        Chess_Puzzles_Title = new javax.swing.JLabel();
        Easy_Puzzles_prompt = new javax.swing.JPanel();
        Single_Player_Label = new javax.swing.JLabel();
        Hard_Puzzles_prompt = new javax.swing.JPanel();
        Single_Player_Label2 = new javax.swing.JLabel();
        Medium_Puzzles_prompt = new javax.swing.JPanel();
        Single_Player_Label3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(59, 61, 62));
        setPreferredSize(new java.awt.Dimension(750, 490));

        Chess_Puzzles_Title.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        Chess_Puzzles_Title.setForeground(new java.awt.Color(194, 194, 194));
        Chess_Puzzles_Title.setText("Chess Puzzles");

        Easy_Puzzles_prompt.setBackground(new java.awt.Color(65, 68, 70));
        Easy_Puzzles_prompt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Easy_Puzzles_prompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Easy_Puzzles_promptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Easy_Puzzles_promptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Easy_Puzzles_promptMouseExited(evt);
            }
        });

        Single_Player_Label.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        Single_Player_Label.setForeground(new java.awt.Color(194, 194, 194));
        Single_Player_Label.setText("Easy");

        javax.swing.GroupLayout Easy_Puzzles_promptLayout = new javax.swing.GroupLayout(Easy_Puzzles_prompt);
        Easy_Puzzles_prompt.setLayout(Easy_Puzzles_promptLayout);
        Easy_Puzzles_promptLayout.setHorizontalGroup(
            Easy_Puzzles_promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Easy_Puzzles_promptLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Single_Player_Label)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        Easy_Puzzles_promptLayout.setVerticalGroup(
            Easy_Puzzles_promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Easy_Puzzles_promptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Single_Player_Label)
                .addGap(122, 122, 122))
        );

        Hard_Puzzles_prompt.setBackground(new java.awt.Color(65, 68, 70));
        Hard_Puzzles_prompt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hard_Puzzles_prompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hard_Puzzles_promptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Hard_Puzzles_promptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Hard_Puzzles_promptMouseExited(evt);
            }
        });

        Single_Player_Label2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        Single_Player_Label2.setForeground(new java.awt.Color(194, 194, 194));
        Single_Player_Label2.setText("Hard");

        javax.swing.GroupLayout Hard_Puzzles_promptLayout = new javax.swing.GroupLayout(Hard_Puzzles_prompt);
        Hard_Puzzles_prompt.setLayout(Hard_Puzzles_promptLayout);
        Hard_Puzzles_promptLayout.setHorizontalGroup(
            Hard_Puzzles_promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Hard_Puzzles_promptLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(Single_Player_Label2)
                .addGap(55, 55, 55))
        );
        Hard_Puzzles_promptLayout.setVerticalGroup(
            Hard_Puzzles_promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Hard_Puzzles_promptLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(Single_Player_Label2)
                .addGap(123, 123, 123))
        );

        Medium_Puzzles_prompt.setBackground(new java.awt.Color(65, 68, 70));
        Medium_Puzzles_prompt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medium_Puzzles_prompt.setPreferredSize(new java.awt.Dimension(132, 135));
        Medium_Puzzles_prompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Medium_Puzzles_promptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Medium_Puzzles_promptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Medium_Puzzles_promptMouseExited(evt);
            }
        });

        Single_Player_Label3.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        Single_Player_Label3.setForeground(new java.awt.Color(194, 194, 194));
        Single_Player_Label3.setText("Medium");

        javax.swing.GroupLayout Medium_Puzzles_promptLayout = new javax.swing.GroupLayout(Medium_Puzzles_prompt);
        Medium_Puzzles_prompt.setLayout(Medium_Puzzles_promptLayout);
        Medium_Puzzles_promptLayout.setHorizontalGroup(
            Medium_Puzzles_promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_Puzzles_promptLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(Single_Player_Label3)
                .addGap(39, 39, 39))
        );
        Medium_Puzzles_promptLayout.setVerticalGroup(
            Medium_Puzzles_promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_Puzzles_promptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Single_Player_Label3)
                .addGap(122, 122, 122))
        );

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("BACK");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(Chess_Puzzles_Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Easy_Puzzles_prompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(Medium_Puzzles_prompt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(Hard_Puzzles_prompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Chess_Puzzles_Title)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Hard_Puzzles_prompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Medium_Puzzles_prompt, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(Easy_Puzzles_prompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel visible false and switch to card7 in card layout
    */
    private void Easy_Puzzles_promptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Easy_Puzzles_promptMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        
        CardLayout.show(parent, "card7");
    }//GEN-LAST:event_Easy_Puzzles_promptMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Easy_Puzzles_prompt background to light grey
    */
    private void Easy_Puzzles_promptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Easy_Puzzles_promptMouseEntered
        // TODO add your handling code here:
        Easy_Puzzles_prompt.setBackground(new java.awt.Color(102, 102, 102));
        
    }//GEN-LAST:event_Easy_Puzzles_promptMouseEntered

    /*
    pre: java.awt.event.MouseEvent evt
    post: set background of Easy_Puzzles_prompt to original
    */
    private void Easy_Puzzles_promptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Easy_Puzzles_promptMouseExited
        // TODO add your handling code here:
        Easy_Puzzles_prompt.setBackground(new java.awt.Color(65,68,70));
    }//GEN-LAST:event_Easy_Puzzles_promptMouseExited

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel visible false and switch to card11 in card layout
    */
    private void Hard_Puzzles_promptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hard_Puzzles_promptMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        
        CardLayout.show(parent, "card11");
    }//GEN-LAST:event_Hard_Puzzles_promptMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Hard_Puzzles_prompt background to light grey
    */
    private void Hard_Puzzles_promptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hard_Puzzles_promptMouseEntered
        // TODO add your handling code here:
        Hard_Puzzles_prompt.setBackground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_Hard_Puzzles_promptMouseEntered

    /*
    pre: java.awt.event.MouseEvent evt
    post: set background of Hard_Puzzles_prompt to original
    */
    private void Hard_Puzzles_promptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hard_Puzzles_promptMouseExited
        // TODO add your handling code here:
        Hard_Puzzles_prompt.setBackground(new java.awt.Color(65,68,70));
    }//GEN-LAST:event_Hard_Puzzles_promptMouseExited

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel visible false and switch to card10 in card layout
    */
    private void Medium_Puzzles_promptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medium_Puzzles_promptMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        CardLayout.show(parent, "card10");
        
    }//GEN-LAST:event_Medium_Puzzles_promptMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Medium_Puzzles_prompt background to light grey
    */
    private void Medium_Puzzles_promptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medium_Puzzles_promptMouseEntered
        // TODO add your handling code here:
        Medium_Puzzles_prompt.setBackground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_Medium_Puzzles_promptMouseEntered

    /*
    pre: java.awt.event.MouseEvent evt
    post: set background of Medium_Puzzles_prompt to original
    */
    private void Medium_Puzzles_promptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medium_Puzzles_promptMouseExited
        // TODO add your handling code here:
        Medium_Puzzles_prompt.setBackground(new java.awt.Color(65,68,70));
    }//GEN-LAST:event_Medium_Puzzles_promptMouseExited

    /*
    pre: java.awt.event.ActionEvent evt
    post: set panel visible false and switch to card5 in card layout
    */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        CardLayout.show(parent, "card5");

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Chess_Puzzles_Title;
    private javax.swing.JPanel Easy_Puzzles_prompt;
    private javax.swing.JPanel Hard_Puzzles_prompt;
    private javax.swing.JPanel Medium_Puzzles_prompt;
    private javax.swing.JLabel Single_Player_Label;
    private javax.swing.JLabel Single_Player_Label2;
    private javax.swing.JLabel Single_Player_Label3;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
