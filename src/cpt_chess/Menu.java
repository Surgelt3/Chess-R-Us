/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;

import static cpt_chess.Java_main_panel.CardLayout;
import static cpt_chess.Experience.level;
import static cpt_chess.Main_Java_Frame.single_Multiplayer_Prompt1;
import static cpt_chess.Main_Java_Frame.menu1;
import static cpt_chess.Main_Java_Frame.parent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author lucas
 */
public class Menu extends javax.swing.JPanel {

    
        
    
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        Menu_Panel = new javax.swing.JPanel();
        Play_Game1_panel = new javax.swing.JPanel();
        Play_game_label = new javax.swing.JLabel();
        Training1_panel = new javax.swing.JPanel();
        Training_label = new javax.swing.JLabel();
        Skins1_panel = new javax.swing.JPanel();
        Skins_label = new javax.swing.JLabel();
        Help1_panel = new javax.swing.JPanel();
        Help_label = new javax.swing.JLabel();
        Title_label = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        Level_Number_Menu = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 490));

        Menu_Panel.setBackground(new java.awt.Color(59, 61, 62));
        Menu_Panel.setPreferredSize(new java.awt.Dimension(750, 500));

        Play_Game1_panel.setBackground(new java.awt.Color(65, 68, 70));
        Play_Game1_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Play_Game1_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Play_Game1_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Play_Game1_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Play_Game1_panelMouseExited(evt);
            }
        });

        Play_game_label.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Play_game_label.setForeground(new java.awt.Color(192, 192, 192));
        Play_game_label.setText("PLAY GAME");

        javax.swing.GroupLayout Play_Game1_panelLayout = new javax.swing.GroupLayout(Play_Game1_panel);
        Play_Game1_panel.setLayout(Play_Game1_panelLayout);
        Play_Game1_panelLayout.setHorizontalGroup(
            Play_Game1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Play_Game1_panelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(Play_game_label)
                .addGap(26, 26, 26))
        );
        Play_Game1_panelLayout.setVerticalGroup(
            Play_Game1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Play_Game1_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Play_game_label)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Training1_panel.setBackground(new java.awt.Color(65, 68, 70));
        Training1_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Training1_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Training1_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Training1_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Training1_panelMouseExited(evt);
            }
        });

        Training_label.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Training_label.setForeground(new java.awt.Color(192, 192, 192));
        Training_label.setText("TRAINING");

        javax.swing.GroupLayout Training1_panelLayout = new javax.swing.GroupLayout(Training1_panel);
        Training1_panel.setLayout(Training1_panelLayout);
        Training1_panelLayout.setHorizontalGroup(
            Training1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Training1_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Training_label)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        Training1_panelLayout.setVerticalGroup(
            Training1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Training1_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Training_label)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Skins1_panel.setBackground(new java.awt.Color(65, 68, 70));
        Skins1_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Skins1_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Skins1_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Skins1_panelMouseExited(evt);
            }
        });

        Skins_label.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Skins_label.setForeground(new java.awt.Color(192, 192, 192));
        Skins_label.setText("SKINS");

        javax.swing.GroupLayout Skins1_panelLayout = new javax.swing.GroupLayout(Skins1_panel);
        Skins1_panel.setLayout(Skins1_panelLayout);
        Skins1_panelLayout.setHorizontalGroup(
            Skins1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Skins1_panelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Skins_label)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        Skins1_panelLayout.setVerticalGroup(
            Skins1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Skins1_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Skins_label)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Help1_panel.setBackground(new java.awt.Color(65, 68, 70));
        Help1_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Help1_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Help1_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Help1_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Help1_panelMouseExited(evt);
            }
        });

        Help_label.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Help_label.setForeground(new java.awt.Color(192, 192, 192));
        Help_label.setText("HELP");

        javax.swing.GroupLayout Help1_panelLayout = new javax.swing.GroupLayout(Help1_panel);
        Help1_panel.setLayout(Help1_panelLayout);
        Help1_panelLayout.setHorizontalGroup(
            Help1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Help1_panelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(Help_label)
                .addGap(51, 51, 51))
        );
        Help1_panelLayout.setVerticalGroup(
            Help1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Help1_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Help_label)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Title_label.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        Title_label.setForeground(new java.awt.Color(194, 194, 194));
        Title_label.setText("Chess R Us");

        jProgressBar1.setBackground(new java.awt.Color(102, 102, 102));
        jProgressBar1.setForeground(new java.awt.Color(204, 204, 204));
        jProgressBar1.setMaximum(100);
        jProgressBar1.setValue(cpt_chess.Experience.get_remainder());

        Level_Number_Menu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Level_Number_Menu.setForeground(new java.awt.Color(194, 194, 194));
        Level_Number_Menu.setText(Integer.toString(cpt_chess.Experience.levelUp()));

        javax.swing.GroupLayout Menu_PanelLayout = new javax.swing.GroupLayout(Menu_Panel);
        Menu_Panel.setLayout(Menu_PanelLayout);
        Menu_PanelLayout.setHorizontalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title_label)
                .addGap(231, 231, 231))
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Level_Number_Menu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Training1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Play_Game1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Skins1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Help1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(292, 292, 292))
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Title_label)
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Play_Game1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Training1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Skins1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Help1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(Level_Number_Menu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Play_Game1_panel background to light grey
    */
    private void Play_Game1_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Play_Game1_panelMouseEntered
        // TODO add your handling code here:
        
        Play_Game1_panel.setBackground(new java.awt.Color(102, 102, 102));
        
        
    }//GEN-LAST:event_Play_Game1_panelMouseEntered

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Training1_panel background to light grey
    */
    private void Training1_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Training1_panelMouseEntered
        // TODO add your handling code here:
        
        Training1_panel.setBackground(new java.awt.Color(102, 102, 102));
        
    }//GEN-LAST:event_Training1_panelMouseEntered

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Skins1_panel background to light grey
    */
    private void Skins1_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Skins1_panelMouseEntered
        // TODO add your handling code here:
        
        Skins1_panel.setBackground(new java.awt.Color(102, 102, 102));
        
    }//GEN-LAST:event_Skins1_panelMouseEntered

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Help1_panel background to light grey
    */
    private void Help1_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Help1_panelMouseEntered
        // TODO add your handling code here:
        
        Help1_panel.setBackground(new java.awt.Color(102, 102, 102));
        
    }//GEN-LAST:event_Help1_panelMouseEntered

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Play_Game1_panel background to original
    */
    private void Play_Game1_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Play_Game1_panelMouseExited
        // TODO add your handling code here:
        
        Play_Game1_panel.setBackground(new java.awt.Color(65,68,70));
        
    }//GEN-LAST:event_Play_Game1_panelMouseExited

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Training1_panel background to original
    */
    private void Training1_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Training1_panelMouseExited
        // TODO add your handling code here:
        
        Training1_panel.setBackground(new java.awt.Color(65,68,70));
        
    }//GEN-LAST:event_Training1_panelMouseExited

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Skins1_panel background to original
    */
    private void Skins1_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Skins1_panelMouseExited
        // TODO add your handling code here:
        
        Skins1_panel.setBackground(new java.awt.Color(65,68,70));
        
    }//GEN-LAST:event_Skins1_panelMouseExited

    /*
    pre: java.awt.event.MouseEvent evt
    post: set Help1_panel background to original
    */
    private void Help1_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Help1_panelMouseExited
        // TODO add your handling code here:
        
        Help1_panel.setBackground(new java.awt.Color(65,68,70));
        
    }//GEN-LAST:event_Help1_panelMouseExited

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel visible to false and switch panel to card3
    */
    private void Play_Game1_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Play_Game1_panelMouseClicked
        
        this.setVisible(false);

        CardLayout.show(parent, "card3");
       
    }//GEN-LAST:event_Play_Game1_panelMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel visible to false and switch panel to card5
    */
    private void Training1_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Training1_panelMouseClicked
        
        this.setVisible(false);
                
        CardLayout.show(parent, "card5");
        
    }//GEN-LAST:event_Training1_panelMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel visible to false and switch panel to help
    */
    private void Help1_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Help1_panelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        
        CardLayout.show(parent, "help");
    }//GEN-LAST:event_Help1_panelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Help1_panel;
    private javax.swing.JLabel Help_label;
    public static javax.swing.JLabel Level_Number_Menu;
    private javax.swing.JPanel Menu_Panel;
    private javax.swing.JPanel Play_Game1_panel;
    private javax.swing.JLabel Play_game_label;
    private javax.swing.JPanel Skins1_panel;
    private javax.swing.JLabel Skins_label;
    private javax.swing.JLabel Title_label;
    private javax.swing.JPanel Training1_panel;
    private javax.swing.JLabel Training_label;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
