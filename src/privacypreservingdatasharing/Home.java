
package privacypreservingdatasharing;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.jvnet.substance.SubstanceLookAndFeel;
import javax.swing.ImageIcon;

public class Home extends javax.swing.JFrame {

  
    public Home() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setMinimumSize(new java.awt.Dimension(675, 422));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Privacy-Preserving Ciphertext Multi-Sharing ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 90, 570, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new ImageIcon(Home.class.getResource("/images/images4.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 220, 240, 200);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setText("Control for Big Data Storage");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 170, 330, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        DatasetLoad dsl=new DatasetLoad();
        dsl.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

    	JFrame.setDefaultLookAndFeelDecorated(true);
		SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
		SubstanceLookAndFeel
				.setCurrentButtonShaper("org.jvnet.substance.button.StandardButtonShaper");
		
		SubstanceLookAndFeel
				.setCurrentGradientPainter("SpecularGradientPainter");
		try {
			UIManager.setLookAndFeel(new SubstanceLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {

			e.printStackTrace();
		}
		
    	
    	
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
