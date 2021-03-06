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
public class Chess_Trainer_Menu extends javax.swing.JPanel {

    /**
     * Creates new form Chess_Trainer_Menu
     */
    public Chess_Trainer_Menu() {
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Training_Title = new javax.swing.JLabel();
        Chess_Puzzles_Prompt = new javax.swing.JPanel();
        Single_Player_Label3 = new javax.swing.JLabel();
        Lessons_Prompt = new javax.swing.JPanel();
        Single_Player_Label4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jButton2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton2.setText("BACK");

        jPanel1.setBackground(new java.awt.Color(59, 61, 62));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));

        Training_Title.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        Training_Title.setForeground(new java.awt.Color(194, 194, 194));
        Training_Title.setText("Training");

        Chess_Puzzles_Prompt.setBackground(new java.awt.Color(65, 68, 70));
        Chess_Puzzles_Prompt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Chess_Puzzles_Prompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Chess_Puzzles_PromptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Chess_Puzzles_PromptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Chess_Puzzles_PromptMouseExited(evt);
            }
        });

        Single_Player_Label3.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        Single_Player_Label3.setForeground(new java.awt.Color(192, 192, 192));
        Single_Player_Label3.setText("Chess Puzzles");

        javax.swing.GroupLayout Chess_Puzzles_PromptLayout = new javax.swing.GroupLayout(Chess_Puzzles_Prompt);
        Chess_Puzzles_Prompt.setLayout(Chess_Puzzles_PromptLayout);
        Chess_Puzzles_PromptLayout.setHorizontalGroup(
            Chess_Puzzles_PromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Chess_Puzzles_PromptLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Single_Player_Label3)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Chess_Puzzles_PromptLayout.setVerticalGroup(
            Chess_Puzzles_PromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Chess_Puzzles_PromptLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(Single_Player_Label3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Lessons_Prompt.setBackground(new java.awt.Color(65, 68, 70));
        Lessons_Prompt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lessons_Prompt.setPreferredSize(new java.awt.Dimension(138, 231));
        Lessons_Prompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lessons_PromptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Lessons_PromptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Lessons_PromptMouseExited(evt);
            }
        });

        Single_Player_Label4.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        Single_Player_Label4.setForeground(new java.awt.Color(192, 192, 192));
        Single_Player_Label4.setText("Lessons");

        javax.swing.GroupLayout Lessons_PromptLayout = new javax.swing.GroupLayout(Lessons_Prompt);
        Lessons_Prompt.setLayout(Lessons_PromptLayout);
        Lessons_PromptLayout.setHorizontalGroup(
            Lessons_PromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lessons_PromptLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Single_Player_Label4)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        Lessons_PromptLayout.setVerticalGroup(
            Lessons_PromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lessons_PromptLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(Single_Player_Label4)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("BACK");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(Training_Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(Chess_Puzzles_Prompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(Lessons_Prompt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Training_Title))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Chess_Puzzles_Prompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lessons_Prompt, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel visible to false and go to puzzles panel
    */
    private void Chess_Puzzles_PromptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Chess_Puzzles_PromptMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        
        CardLayout.show(parent, "card6");
        
    }//GEN-LAST:event_Chess_Puzzles_PromptMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel colour to light grey
    */
    private void Chess_Puzzles_PromptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Chess_Puzzles_PromptMouseEntered
        // TODO add your handling code here:

        Chess_Puzzles_Prompt.setBackground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_Chess_Puzzles_PromptMouseEntered

    /*
    pre: java.awt.event.MouseEvent evt
    post: revert panel colour to original
    */
    private void Chess_Puzzles_PromptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Chess_Puzzles_PromptMouseExited
        // TODO add your handling code here:

        Chess_Puzzles_Prompt.setBackground(new java.awt.Color(65,68,70));
    }//GEN-LAST:event_Chess_Puzzles_PromptMouseExited

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel visible to false and go to lessons panel
    */
    private void Lessons_PromptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lessons_PromptMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        
        CardLayout.show(parent, "card8");
    }//GEN-LAST:event_Lessons_PromptMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel colour to light grey
    */
    private void Lessons_PromptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lessons_PromptMouseEntered
        // TODO add your handling code here:
        Lessons_Prompt.setBackground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_Lessons_PromptMouseEntered

    /*
    pre: java.awt.event.MouseEvent evt
    post: revert panel colour to original
    */
    private void Lessons_PromptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lessons_PromptMouseExited
        // TODO add your handling code here:
        Lessons_Prompt.setBackground(new java.awt.Color(65,68,70));
    }//GEN-LAST:event_Lessons_PromptMouseExited

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel visible to false and go to previous panel
    */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        CardLayout.show(parent, "card2");
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Chess_Puzzles_Prompt;
    private javax.swing.JPanel Lessons_Prompt;
    private javax.swing.JLabel Single_Player_Label3;
    private javax.swing.JLabel Single_Player_Label4;
    private javax.swing.JLabel Training_Title;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
