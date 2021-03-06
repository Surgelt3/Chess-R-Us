/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

import static cpt_chess.Java_main_panel.CardLayout;
import static cpt_chess.Main_Java_Frame.main_frame;
import static cpt_chess.Main_Java_Frame.parent;

/**
 *
 * @author lucas
 */
public class Game_Over_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Game_Over_Panel
     */
    public Game_Over_Panel() {
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

        Winner_Title = new javax.swing.JLabel();
        Return_Menu_End = new javax.swing.JButton();

        setBackground(new java.awt.Color(59, 61, 62));
        setPreferredSize(new java.awt.Dimension(750, 490));

        Winner_Title.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        Winner_Title.setForeground(new java.awt.Color(194, 194, 194));
        Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);

        Return_Menu_End.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        Return_Menu_End.setText("Return to Menu");
        Return_Menu_End.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return_Menu_End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_Menu_EndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(Winner_Title)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(Return_Menu_End, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Winner_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(Return_Menu_End, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
    pre: java.awt.event.ActionEvent evt
    post: set panel as visible false and go to main menu
    */
    private void Return_Menu_EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Menu_EndActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CardLayout.show(parent, "card2");
        
    }//GEN-LAST:event_Return_Menu_EndActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Return_Menu_End;
    public static javax.swing.JLabel Winner_Title;
    // End of variables declaration//GEN-END:variables
}
