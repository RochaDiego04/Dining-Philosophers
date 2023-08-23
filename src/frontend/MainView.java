/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author Diego
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
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

        panel_aside = new javax.swing.JPanel();
        btn_start = new javax.swing.JPanel();
        lbl_start = new javax.swing.JLabel();
        btn_return = new javax.swing.JPanel();
        lbl_return = new javax.swing.JLabel();
        pnl_Philosopher1 = new javax.swing.JPanel();
        lbl_philosopher = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar5 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        pnl_Philosopher2 = new javax.swing.JPanel();
        lbl_philosopher2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar6 = new javax.swing.JProgressBar();
        jProgressBar7 = new javax.swing.JProgressBar();
        pnl_Philosopher3 = new javax.swing.JPanel();
        lbl_philosopher3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar8 = new javax.swing.JProgressBar();
        jProgressBar9 = new javax.swing.JProgressBar();
        pnl_Philosopher4 = new javax.swing.JPanel();
        lbl_philosopher4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jProgressBar10 = new javax.swing.JProgressBar();
        jProgressBar11 = new javax.swing.JProgressBar();
        pnl_Philosopher5 = new javax.swing.JPanel();
        lbl_philosopher5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jProgressBar12 = new javax.swing.JProgressBar();
        jProgressBar13 = new javax.swing.JProgressBar();
        img_philosopher1 = new javax.swing.JLabel();
        img_philosopher2 = new javax.swing.JLabel();
        img_philosopher3 = new javax.swing.JLabel();
        img_philosopher4 = new javax.swing.JLabel();
        img_philosopher5 = new javax.swing.JLabel();
        lbl_numPhilosopher1 = new javax.swing.JLabel();
        lbl_numPhilosopher2 = new javax.swing.JLabel();
        lbl_numPhilosopher3 = new javax.swing.JLabel();
        lbl_numPhilosopher4 = new javax.swing.JLabel();
        lbl_numPhilosopher5 = new javax.swing.JLabel();
        img_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(775, 579));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_aside.setBackground(new java.awt.Color(0, 0, 0));
        panel_aside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_start.setBackground(new java.awt.Color(51, 153, 0));
        btn_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_startMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_startMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_startMouseExited(evt);
            }
        });

        lbl_start.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_start.setForeground(new java.awt.Color(255, 255, 255));
        lbl_start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_start.setText("START");

        javax.swing.GroupLayout btn_startLayout = new javax.swing.GroupLayout(btn_start);
        btn_start.setLayout(btn_startLayout);
        btn_startLayout.setHorizontalGroup(
            btn_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_startLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_start, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_startLayout.setVerticalGroup(
            btn_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_startLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_aside.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        btn_return.setBackground(new java.awt.Color(153, 0, 0));
        btn_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_returnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_returnMouseExited(evt);
            }
        });

        lbl_return.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_return.setForeground(new java.awt.Color(255, 255, 255));
        lbl_return.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_return.setText("RETURN");

        javax.swing.GroupLayout btn_returnLayout = new javax.swing.GroupLayout(btn_return);
        btn_return.setLayout(btn_returnLayout);
        btn_returnLayout.setHorizontalGroup(
            btn_returnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_returnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_return, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_returnLayout.setVerticalGroup(
            btn_returnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_returnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_aside.add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 6, 130, -1));

        pnl_Philosopher1.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Philosopher1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), null, new java.awt.Color(204, 204, 204)));
        pnl_Philosopher1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_philosopher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_philosopher.setForeground(new java.awt.Color(255, 255, 255));
        lbl_philosopher.setText("Philosopher1");
        pnl_Philosopher1.add(lbl_philosopher, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Thinking");
        pnl_Philosopher1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eating");
        pnl_Philosopher1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jProgressBar5.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar5.setForeground(new java.awt.Color(153, 255, 204));
        jProgressBar5.setValue(50);
        jProgressBar5.setBorderPainted(false);
        pnl_Philosopher1.add(jProgressBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 44, 80, 10));

        jProgressBar4.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar4.setForeground(new java.awt.Color(255, 153, 255));
        jProgressBar4.setValue(30);
        jProgressBar4.setBorderPainted(false);
        pnl_Philosopher1.add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 64, 80, 10));

        panel_aside.add(pnl_Philosopher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 340, 90));

        pnl_Philosopher2.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Philosopher2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), null, new java.awt.Color(204, 204, 204)));
        pnl_Philosopher2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_philosopher2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_philosopher2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_philosopher2.setText("Philosopher2");
        pnl_Philosopher2.add(lbl_philosopher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Thinking");
        pnl_Philosopher2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eating");
        pnl_Philosopher2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jProgressBar6.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar6.setForeground(new java.awt.Color(153, 255, 204));
        jProgressBar6.setValue(50);
        jProgressBar6.setBorderPainted(false);
        pnl_Philosopher2.add(jProgressBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 44, 80, 10));

        jProgressBar7.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar7.setForeground(new java.awt.Color(255, 153, 255));
        jProgressBar7.setValue(30);
        jProgressBar7.setBorderPainted(false);
        pnl_Philosopher2.add(jProgressBar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 64, 80, 10));

        panel_aside.add(pnl_Philosopher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 340, 90));

        pnl_Philosopher3.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Philosopher3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), null, new java.awt.Color(204, 204, 204)));
        pnl_Philosopher3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_philosopher3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_philosopher3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_philosopher3.setText("Philosopher3");
        pnl_Philosopher3.add(lbl_philosopher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Thinking");
        pnl_Philosopher3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eating");
        pnl_Philosopher3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jProgressBar8.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar8.setForeground(new java.awt.Color(153, 255, 204));
        jProgressBar8.setValue(50);
        jProgressBar8.setBorderPainted(false);
        pnl_Philosopher3.add(jProgressBar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 44, 80, 10));

        jProgressBar9.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar9.setForeground(new java.awt.Color(255, 153, 255));
        jProgressBar9.setValue(30);
        jProgressBar9.setBorderPainted(false);
        pnl_Philosopher3.add(jProgressBar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 64, 80, 10));

        panel_aside.add(pnl_Philosopher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 340, 90));

        pnl_Philosopher4.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Philosopher4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), null, new java.awt.Color(204, 204, 204)));
        pnl_Philosopher4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_philosopher4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_philosopher4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_philosopher4.setText("Philosopher4");
        pnl_Philosopher4.add(lbl_philosopher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Thinking");
        pnl_Philosopher4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Eating");
        pnl_Philosopher4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jProgressBar10.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar10.setForeground(new java.awt.Color(153, 255, 204));
        jProgressBar10.setValue(50);
        jProgressBar10.setBorderPainted(false);
        pnl_Philosopher4.add(jProgressBar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 44, 80, 10));

        jProgressBar11.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar11.setForeground(new java.awt.Color(255, 153, 255));
        jProgressBar11.setValue(30);
        jProgressBar11.setBorderPainted(false);
        pnl_Philosopher4.add(jProgressBar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 64, 80, 10));

        panel_aside.add(pnl_Philosopher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 340, 90));

        pnl_Philosopher5.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Philosopher5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), null, new java.awt.Color(204, 204, 204)));
        pnl_Philosopher5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_philosopher5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_philosopher5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_philosopher5.setText("Philosopher4");
        pnl_Philosopher5.add(lbl_philosopher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Thinking");
        pnl_Philosopher5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Eating");
        pnl_Philosopher5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jProgressBar12.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar12.setForeground(new java.awt.Color(153, 255, 204));
        jProgressBar12.setValue(50);
        jProgressBar12.setBorderPainted(false);
        pnl_Philosopher5.add(jProgressBar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 44, 80, 10));

        jProgressBar13.setBackground(new java.awt.Color(232, 232, 232));
        jProgressBar13.setForeground(new java.awt.Color(255, 153, 255));
        jProgressBar13.setValue(30);
        jProgressBar13.setBorderPainted(false);
        pnl_Philosopher5.add(jProgressBar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 64, 80, 10));

        panel_aside.add(pnl_Philosopher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 340, 90));

        getContentPane().add(panel_aside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 600));

        img_philosopher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eating.png"))); // NOI18N
        getContentPane().add(img_philosopher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        img_philosopher2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thinking.png"))); // NOI18N
        getContentPane().add(img_philosopher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        img_philosopher3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waiting.png"))); // NOI18N
        getContentPane().add(img_philosopher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, -1));

        img_philosopher4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sleeping.png"))); // NOI18N
        getContentPane().add(img_philosopher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        img_philosopher5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thinking.png"))); // NOI18N
        getContentPane().add(img_philosopher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        lbl_numPhilosopher1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher1.setText("1");
        getContentPane().add(lbl_numPhilosopher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        lbl_numPhilosopher2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher2.setText("2");
        getContentPane().add(lbl_numPhilosopher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        lbl_numPhilosopher3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher3.setText("3");
        getContentPane().add(lbl_numPhilosopher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        lbl_numPhilosopher4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher4.setText("4");
        getContentPane().add(lbl_numPhilosopher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, -1));

        lbl_numPhilosopher5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher5.setText("5");
        getContentPane().add(lbl_numPhilosopher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        img_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diningRoom.jpg"))); // NOI18N
        getContentPane().add(img_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 680, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_startMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_startMouseClicked

    private void btn_returnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_returnMouseClicked

    private void btn_startMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_startMouseEntered
        btn_start.setBackground(new Color(83,167,97));
        btn_start.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_startMouseEntered

    private void btn_startMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_startMouseExited
        btn_start.setBackground(new Color(51,153,0));
        btn_start.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btn_startMouseExited

    private void btn_returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnMouseEntered
        btn_return.setBackground(new Color(170,78,78));
        btn_return.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_returnMouseEntered

    private void btn_returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnMouseExited
        btn_return.setBackground(new Color(153,0,0));
        btn_return.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_returnMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_return;
    private javax.swing.JPanel btn_start;
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel img_philosopher1;
    private javax.swing.JLabel img_philosopher2;
    private javax.swing.JLabel img_philosopher3;
    private javax.swing.JLabel img_philosopher4;
    private javax.swing.JLabel img_philosopher5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar10;
    private javax.swing.JProgressBar jProgressBar11;
    private javax.swing.JProgressBar jProgressBar12;
    private javax.swing.JProgressBar jProgressBar13;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JProgressBar jProgressBar9;
    private javax.swing.JLabel lbl_numPhilosopher1;
    private javax.swing.JLabel lbl_numPhilosopher2;
    private javax.swing.JLabel lbl_numPhilosopher3;
    private javax.swing.JLabel lbl_numPhilosopher4;
    private javax.swing.JLabel lbl_numPhilosopher5;
    private javax.swing.JLabel lbl_philosopher;
    private javax.swing.JLabel lbl_philosopher2;
    private javax.swing.JLabel lbl_philosopher3;
    private javax.swing.JLabel lbl_philosopher4;
    private javax.swing.JLabel lbl_philosopher5;
    private javax.swing.JLabel lbl_return;
    private javax.swing.JLabel lbl_start;
    private javax.swing.JPanel panel_aside;
    private javax.swing.JPanel pnl_Philosopher1;
    private javax.swing.JPanel pnl_Philosopher2;
    private javax.swing.JPanel pnl_Philosopher3;
    private javax.swing.JPanel pnl_Philosopher4;
    private javax.swing.JPanel pnl_Philosopher5;
    // End of variables declaration//GEN-END:variables
}
