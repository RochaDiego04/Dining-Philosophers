/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

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

        panel_footer = new javax.swing.JPanel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_footer.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel_footerLayout = new javax.swing.GroupLayout(panel_footer);
        panel_footer.setLayout(panel_footerLayout);
        panel_footerLayout.setHorizontalGroup(
            panel_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        panel_footerLayout.setVerticalGroup(
            panel_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(panel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        img_philosopher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eating.png"))); // NOI18N
        getContentPane().add(img_philosopher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        img_philosopher2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thinking.png"))); // NOI18N
        getContentPane().add(img_philosopher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        img_philosopher3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waiting.png"))); // NOI18N
        getContentPane().add(img_philosopher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        img_philosopher4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sleeping.png"))); // NOI18N
        getContentPane().add(img_philosopher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        img_philosopher5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thinking.png"))); // NOI18N
        getContentPane().add(img_philosopher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        lbl_numPhilosopher1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher1.setText("1");
        getContentPane().add(lbl_numPhilosopher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        lbl_numPhilosopher2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher2.setText("2");
        getContentPane().add(lbl_numPhilosopher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        lbl_numPhilosopher3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher3.setText("3");
        getContentPane().add(lbl_numPhilosopher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        lbl_numPhilosopher4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher4.setText("4");
        getContentPane().add(lbl_numPhilosopher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        lbl_numPhilosopher5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        lbl_numPhilosopher5.setText("5");
        getContentPane().add(lbl_numPhilosopher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        img_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagen de WhatsApp 2023-08-20 a las 19.32.28 (1).jpg"))); // NOI18N
        img_background.setText("jLabel1");
        getContentPane().add(img_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 620, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel img_philosopher1;
    private javax.swing.JLabel img_philosopher2;
    private javax.swing.JLabel img_philosopher3;
    private javax.swing.JLabel img_philosopher4;
    private javax.swing.JLabel img_philosopher5;
    private javax.swing.JLabel lbl_numPhilosopher1;
    private javax.swing.JLabel lbl_numPhilosopher2;
    private javax.swing.JLabel lbl_numPhilosopher3;
    private javax.swing.JLabel lbl_numPhilosopher4;
    private javax.swing.JLabel lbl_numPhilosopher5;
    private javax.swing.JPanel panel_footer;
    // End of variables declaration//GEN-END:variables
}
