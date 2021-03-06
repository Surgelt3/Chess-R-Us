/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JSlider;
import javax.swing.border.Border;
import static cpt_chess.CPT_Chess.level_str;
import static cpt_chess.CPT_Chess.colour_select;
import static cpt_chess.Java_main_panel.CardLayout;
import static cpt_chess.Main_Java_Frame.parent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class Difficulty_Game_Prompt extends javax.swing.JPanel {

    /**
     * Creates new form Difficulty_Game_Prompt
     */
    public Difficulty_Game_Prompt() {
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

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        White_Select = new javax.swing.JPanel();
        Border redBorder_White = BorderFactory.createLineBorder(Color.RED,5);
        jLabel3 = new javax.swing.JLabel();
        Black_Select = new javax.swing.JPanel();
        Border redBorder_Black = BorderFactory.createLineBorder(Color.RED,5);
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(59, 61, 62));
        setPreferredSize(new java.awt.Dimension(750, 500));

        jSlider1.setBackground(new java.awt.Color(59, 61, 62));
        jSlider1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(194, 194, 194));
        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(20);
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(194, 194, 194));
        jLabel1.setText("Choose Difficulty");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(194, 194, 194));
        jLabel2.setText("Select Colour");

        jPanel1.setBackground(new java.awt.Color(59, 61, 62));

        White_Select.setBackground(new java.awt.Color(80, 85, 87));
        White_Select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        White_Select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                White_SelectMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpt_chess/Images/whitePawn.png"))); // NOI18N

        javax.swing.GroupLayout White_SelectLayout = new javax.swing.GroupLayout(White_Select);
        White_Select.setLayout(White_SelectLayout);
        White_SelectLayout.setHorizontalGroup(
            White_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(White_SelectLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        White_SelectLayout.setVerticalGroup(
            White_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(White_SelectLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Black_Select.setBackground(new java.awt.Color(80, 85, 87));
        Black_Select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Black_Select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Black_SelectMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpt_chess/Images/blackPawn.png"))); // NOI18N

        javax.swing.GroupLayout Black_SelectLayout = new javax.swing.GroupLayout(Black_Select);
        Black_Select.setLayout(Black_SelectLayout);
        Black_SelectLayout.setHorizontalGroup(
            Black_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Black_SelectLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel4)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        Black_SelectLayout.setVerticalGroup(
            Black_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Black_SelectLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(White_Select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Black_Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Black_Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(White_Select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Play");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(507, 507, 507)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(315, 315, 315))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
    pre: java.awt.event.MouseEvent evt
    post: have white boarder around panel and make colour_select = "w"
    post: make black_select have no border
    */
    private void White_SelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_White_SelectMouseClicked
        // TODO add your handling code here:
        Border white_boarder = BorderFactory.createLineBorder(Color.WHITE);
        White_Select.setBorder(white_boarder);
        Black_Select.setBorder(null);
        colour_select = "w";
    }//GEN-LAST:event_White_SelectMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: run game
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        cpt_chess.Main_Game game;
                
        if(colour_select != null){
            
            if(colour_select.equals("b") || colour_select.equals("w")){

                try {
                    game = new cpt_chess.Main_Game();
                } catch (IOException ex) {
                    Logger.getLogger(Single_Multiplayer_Prompt.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Single_Multiplayer_Prompt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /*
    pre: java.awt.event.MouseEvent evt
    post: have white boarder around panel and make colour_select = "b"
    post: make white_select have no border
    */
    private void Black_SelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Black_SelectMouseClicked
        // TODO add your handling code here:
        Border white_boarder = BorderFactory.createLineBorder(Color.WHITE);
        Black_Select.setBorder(white_boarder);
        White_Select.setBorder(null);
        colour_select = "b";
        
    }//GEN-LAST:event_Black_SelectMouseClicked

    /*
    pre: javax.swing.event.ChangeEvent evt
    post: change level_str to value on slider
    */
    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        
        int level_int = jSlider1.getValue();
        level_str = Integer.toString(level_int);
        
        
    }//GEN-LAST:event_jSlider1StateChanged

    /*
    pre: java.awt.event.ActionEvent evt
    post: set panel visible to false and go to previous panel
    */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        
        CardLayout.show(parent, "card3");
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Black_Select;
    private javax.swing.JPanel White_Select;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
