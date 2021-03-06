/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt_chess;
import static cpt_chess.CPT_Chess.puzzle;
import static cpt_chess.CPT_Chess.puzzles_answers;
import static cpt_chess.Java_main_panel.CardLayout;
import static cpt_chess.Main_Java_Frame.parent;
import static cpt_chess.puzzles.puzzle_selected;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;


/**
 *
 * @author lucas
 */
public class Chess_Puzzles_Medium extends javax.swing.JPanel {

    /**
     * Creates new form Chess_Puzzles_Medium
     */
    public Chess_Puzzles_Medium() {
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

        Medium_Title = new javax.swing.JLabel();
        Medium_5f = new javax.swing.JPanel();
        level_5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Medium_1f = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Medium_6f = new javax.swing.JPanel();
        level_6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Medium_3f = new javax.swing.JPanel();
        level_3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Medium_2f = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Medium_7f = new javax.swing.JPanel();
        level_7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(59, 61, 62));

        Medium_Title.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        Medium_Title.setForeground(new java.awt.Color(194, 194, 194));
        Medium_Title.setText("Medium");

        Medium_5f.setBackground(new java.awt.Color(51, 51, 51));
        Medium_5f.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medium_5f.setPreferredSize(new java.awt.Dimension(110, 110));
        Medium_5f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Medium_5fMouseClicked(evt);
            }
        });

        level_5.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        level_5.setForeground(new java.awt.Color(194, 194, 194));
        level_5.setText("5");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Unlockable at level 3");

        javax.swing.GroupLayout Medium_5fLayout = new javax.swing.GroupLayout(Medium_5f);
        Medium_5f.setLayout(Medium_5fLayout);
        Medium_5fLayout.setHorizontalGroup(
            Medium_5fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_5fLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(Medium_5fLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(level_5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Medium_5fLayout.setVerticalGroup(
            Medium_5fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_5fLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(level_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(19, 19, 19))
        );

        Medium_1f.setBackground(new java.awt.Color(51, 51, 51));
        Medium_1f.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medium_1f.setPreferredSize(new java.awt.Dimension(110, 110));
        Medium_1f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Medium_1fMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(194, 194, 194));
        jLabel1.setText("1");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Unlockable at level 3 ");

        javax.swing.GroupLayout Medium_1fLayout = new javax.swing.GroupLayout(Medium_1f);
        Medium_1f.setLayout(Medium_1fLayout);
        Medium_1fLayout.setHorizontalGroup(
            Medium_1fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Medium_1fLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(Medium_1fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_1fLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_1fLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );
        Medium_1fLayout.setVerticalGroup(
            Medium_1fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Medium_1fLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Medium_6f.setBackground(new java.awt.Color(51, 51, 51));
        Medium_6f.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medium_6f.setPreferredSize(new java.awt.Dimension(110, 110));
        Medium_6f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Medium_6fMouseClicked(evt);
            }
        });

        level_6.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        level_6.setForeground(new java.awt.Color(194, 194, 194));
        level_6.setText("6");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Unlockable at level 3");

        javax.swing.GroupLayout Medium_6fLayout = new javax.swing.GroupLayout(Medium_6f);
        Medium_6f.setLayout(Medium_6fLayout);
        Medium_6fLayout.setHorizontalGroup(
            Medium_6fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Medium_6fLayout.createSequentialGroup()
                .addGroup(Medium_6fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Medium_6fLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(Medium_6fLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(level_6)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        Medium_6fLayout.setVerticalGroup(
            Medium_6fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_6fLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(level_6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(19, 19, 19))
        );

        Medium_3f.setBackground(new java.awt.Color(51, 51, 51));
        Medium_3f.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medium_3f.setPreferredSize(new java.awt.Dimension(110, 110));
        Medium_3f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Medium_3fMouseClicked(evt);
            }
        });

        level_3.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        level_3.setForeground(new java.awt.Color(194, 194, 194));
        level_3.setText("3");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Unlockable at level 3");

        javax.swing.GroupLayout Medium_3fLayout = new javax.swing.GroupLayout(Medium_3f);
        Medium_3f.setLayout(Medium_3fLayout);
        Medium_3fLayout.setHorizontalGroup(
            Medium_3fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Medium_3fLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(level_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_3fLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        Medium_3fLayout.setVerticalGroup(
            Medium_3fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_3fLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(level_3)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );

        Medium_2f.setBackground(new java.awt.Color(51, 51, 51));
        Medium_2f.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medium_2f.setPreferredSize(new java.awt.Dimension(110, 110));
        Medium_2f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Medium_2fMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(194, 194, 194));
        jLabel2.setText("2");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Unlockable at level 3 ");

        javax.swing.GroupLayout Medium_2fLayout = new javax.swing.GroupLayout(Medium_2f);
        Medium_2f.setLayout(Medium_2fLayout);
        Medium_2fLayout.setHorizontalGroup(
            Medium_2fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Medium_2fLayout.createSequentialGroup()
                .addGroup(Medium_2fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Medium_2fLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(Medium_2fLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        Medium_2fLayout.setVerticalGroup(
            Medium_2fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Medium_2fLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Medium_7f.setBackground(new java.awt.Color(51, 51, 51));
        Medium_7f.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medium_7f.setPreferredSize(new java.awt.Dimension(110, 110));
        Medium_7f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Medium_7fMouseClicked(evt);
            }
        });

        level_7.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        level_7.setForeground(new java.awt.Color(194, 194, 194));
        level_7.setText("7");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Unlockable at level 3 ");

        javax.swing.GroupLayout Medium_7fLayout = new javax.swing.GroupLayout(Medium_7f);
        Medium_7f.setLayout(Medium_7fLayout);
        Medium_7fLayout.setHorizontalGroup(
            Medium_7fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_7fLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(Medium_7fLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(level_7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Medium_7fLayout.setVerticalGroup(
            Medium_7fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Medium_7fLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(level_7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194)
                        .addComponent(Medium_Title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Medium_1f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Medium_5f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Medium_6f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Medium_2f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Medium_3f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Medium_7f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Medium_Title)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Medium_1f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Medium_2f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Medium_3f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Medium_7f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Medium_6f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Medium_5f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
    pre: java.awt.event.MouseEvent evt
    post: make puzzle and puzzle answer that of 1f and start puzzle code
    */
    private void Medium_1fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medium_1fMouseClicked
        // TODO add your handling code here:
        if(cpt_chess.Experience.levelUp() >= 3){
            puzzle_selected = "1f";
            puzzle = cpt_chess.puzzles.puzzle_1f;
            puzzles_answers = cpt_chess.puzzles.puzzle_1f_answer;

            try {
                Puzzles_Main puzzle_main = new Puzzles_Main();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_Medium_1fMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: make puzzle and puzzle answer that of 3f and start puzzle code
    */
    private void Medium_3fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medium_3fMouseClicked
        // TODO add your handling code here:
        if(cpt_chess.Experience.levelUp() >= 3){
            puzzle_selected = "3f";
            puzzle = cpt_chess.puzzles.puzzle_3f;
            puzzles_answers = cpt_chess.puzzles.puzzle_3f_answer;

            try {
                Puzzles_Main puzzle_main = new Puzzles_Main();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_Medium_3fMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: make puzzle and puzzle answer that of 2f and start puzzle code
    */
    private void Medium_2fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medium_2fMouseClicked
        // TODO add your handling code here:
        if(cpt_chess.Experience.levelUp() >= 3){
            puzzle_selected = "2f";
            puzzle = cpt_chess.puzzles.puzzle_2f;
            puzzles_answers = cpt_chess.puzzles.puzzle_2f_answer;

            try {
                Puzzles_Main puzzle_main = new Puzzles_Main();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_Medium_2fMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: set panel to visible false and go to previous panel
    */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        CardLayout.show(parent, "card6");
    }//GEN-LAST:event_jButton3ActionPerformed

    /*
    pre: java.awt.event.MouseEvent evt
    post: make puzzle and puzzle answer that of 5f and start puzzle code
    */
    private void Medium_5fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medium_5fMouseClicked
        // TODO add your handling code here:
        if(cpt_chess.Experience.levelUp() >= 3){
            puzzle_selected = "5f";
            puzzle = cpt_chess.puzzles.puzzle_5f;
            puzzles_answers = cpt_chess.puzzles.puzzle_5f_answer;

            try {
                Puzzles_Main puzzle_main = new Puzzles_Main();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Medium_5fMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: make puzzle and puzzle answer that of 7f and start puzzle code
    */
    private void Medium_7fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medium_7fMouseClicked
        // TODO add your handling code here:
        if(cpt_chess.Experience.levelUp() >= 3){
            puzzle_selected = "7f";
            puzzle = cpt_chess.puzzles.puzzle_7f;
            puzzles_answers = cpt_chess.puzzles.puzzle_7f_answer;

            try {
                Puzzles_Main puzzle_main = new Puzzles_Main();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Medium_7fMouseClicked

    /*
    pre: java.awt.event.MouseEvent evt
    post: make puzzle and puzzle answer that of 6f and start puzzle code
    */
    private void Medium_6fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medium_6fMouseClicked
        // TODO add your handling code here:
        if(cpt_chess.Experience.levelUp() >= 3){
            puzzle_selected = "6f";
            puzzle = cpt_chess.puzzles.puzzle_6f;
            puzzles_answers = cpt_chess.puzzles.puzzle_6f_answer;

            try {
                Puzzles_Main puzzle_main = new Puzzles_Main();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Chess_Puzzles_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Medium_6fMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Medium_1f;
    private javax.swing.JPanel Medium_2f;
    private javax.swing.JPanel Medium_3f;
    private javax.swing.JPanel Medium_5f;
    private javax.swing.JPanel Medium_6f;
    private javax.swing.JPanel Medium_7f;
    private javax.swing.JLabel Medium_Title;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel level_3;
    private javax.swing.JLabel level_5;
    private javax.swing.JLabel level_6;
    private javax.swing.JLabel level_7;
    // End of variables declaration//GEN-END:variables
}
