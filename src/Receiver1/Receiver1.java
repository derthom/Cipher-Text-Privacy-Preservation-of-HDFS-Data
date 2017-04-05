package Receiver1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.jvnet.substance.SubstanceLookAndFeel;

public class Receiver1 extends javax.swing.JFrame {

    public static String name, mid, pwd, cat, dat, anna;
    Random rand = new Random();
    public static String id;
    java.sql.Connection con;
    java.sql.Statement stat, st1, st;
    ResultSet rs, rs1, rs2, rs3;

    public Receiver1() {
        initComponents();
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://192.168.1.1:3306/MultiSharing", "root", "root");
                stat = con.createStatement();
                st = con.createStatement();
                st1 = con.createStatement();
//                st.executeUpdate("truncate table receiverdet");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receiver1");
        setMinimumSize(new java.awt.Dimension(704, 580));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Receiver 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 10, 150, 40);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setText("Profile Generation and Authentication of Receivers and Anonymity ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 50, 560, 60);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UpdateProfiles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel3.setText("Name ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 50, 50, 30);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel4.setText("Mail Id");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 110, 50, 20);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel5.setText("Password ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 180, 70, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(130, 50, 160, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(130, 110, 160, 30);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(130, 170, 160, 30);

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel8.setText("Your Unique id");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 240, 100, 20);

        jTextField3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(130, 230, 160, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 120, 330, 320);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Send to Owner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(40, 110, 150, 30);

        jButton3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton3.setText("Get");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(40, 40, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(370, 200, 230, 190);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 710, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Category ca = new Category();
            ca.setVisible(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            name = jTextField1.getText();
            anna = "******";
            mid = jTextField2.getText();
            pwd = jPasswordField1.getText();
            JOptionPane.showMessageDialog(null, "Receiver Details obtained ");
            MyStringRandomGen msr=new MyStringRandomGen();
            msr.generateRandomString();
            int num1 = (rand.nextInt(8) + 1 * 1000) + (rand.nextInt(8) + 1) * 100 + (rand.nextInt(10) * 10) + rand.nextInt(10);
            jTextField3.setText( msr.generateRandomString());
            id = jTextField3.getText();
            st.executeUpdate("insert into receiverdet values('" + anna + "','" + mid + "','" + pwd + "','" + id + "') ");
            System.out.println("updated");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Receiver1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receiver1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receiver1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receiver1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Receiver1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
