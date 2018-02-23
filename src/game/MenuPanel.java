/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * @author      Curtis, Gibson, curtis.gibson@city.ac.uk
 * @version     1.0
 * @since       Increment 2
*/
/**
 *  New JFrame form for the button panel along the game window.
*/
public class MenuPanel extends javax.swing.JPanel {

    private Game game;
    
    /**
     * Creates new form MenuForm
     * @param view  Takes game view as a parameter
     */
    public MenuPanel(Game view) {
        this.game = view;
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        playGame = new javax.swing.JButton();
        quitGame = new javax.swing.JButton();
        pauseGame = new javax.swing.JButton();
        restartGame = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setBackground(new java.awt.Color(128, 128, 128));
        setSize(new java.awt.Dimension(500, 400));

        playGame.setText("Play");
        playGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playGameActionPerformed(evt);
            }
        });

        quitGame.setText("Home");
        quitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitGameActionPerformed(evt);
            }
        });

        pauseGame.setText("Pause");
        pauseGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseGameActionPerformed(evt);
            }
        });

        restartGame.setText("Restart");
        restartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pauseGame)
                .addGap(18, 18, 18)
                .addComponent(playGame)
                .addGap(18, 18, 18)
                .addComponent(quitGame)
                .addGap(18, 18, 18)
                .addComponent(restartGame)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pauseGame)
                    .addComponent(playGame)
                    .addComponent(quitGame)
                    .addComponent(restartGame))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pauseGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseGameActionPerformed
        game.getWorld().stop();
        // TODO add your handling code here:
    }//GEN-LAST:event_pauseGameActionPerformed

    private void playGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playGameActionPerformed
        game.getWorld().start();
        // TODO add your handling code here:
    }//GEN-LAST:event_playGameActionPerformed

    private void quitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitGameActionPerformed
        game.frameMenu.setVisible(true);
        game.frameGame.dispose();
    }//GEN-LAST:event_quitGameActionPerformed

    private void restartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartGameActionPerformed
        new Game();
        game.frameGame.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_restartGameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JButton pauseGame;
    private javax.swing.JButton playGame;
    private javax.swing.JButton quitGame;
    private javax.swing.JButton restartGame;
    // End of variables declaration//GEN-END:variables

}