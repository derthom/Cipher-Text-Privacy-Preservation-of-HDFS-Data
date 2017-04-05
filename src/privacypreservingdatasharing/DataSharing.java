package privacypreservingdatasharing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class DataSharing extends javax.swing.JFrame {

    public static String cat, rd, cat1, cat2, rd1, rd2;

    public DataSharing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DataSharing");
        setMinimumSize(new java.awt.Dimension(879, 670));
        setPreferredSize(new java.awt.Dimension(879, 670));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Share Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("ConditionalSharingforReceiver1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 50, 250, 30);

        jButton4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton4.setText("Conditional Sharing for Receiver 2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 100, 249, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 230, 290, 180);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 40, 40, 23);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel4.setText("Id");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 80, 40, 23);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel5.setText("Category");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 130, 60, 30);

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel6.setText("Receiver Needed Data");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 190, 150, 30);

        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(200, 40, 170, 30);

        jTextField2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField2);
        jTextField2.setBounds(200, 90, 170, 30);

        jTextField3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField3);
        jTextField3.setBounds(200, 140, 170, 30);

        jTextField4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField4);
        jTextField4.setBounds(200, 190, 170, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 430, 140);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton2.setText("Receive ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(170, 390, 160, 30);

        jTabbedPane1.addTab("Receiver1 Details", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel7.setText("Name");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 40, 40, 23);

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel8.setText("Id");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(50, 80, 40, 23);

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel9.setText("Category");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 130, 60, 30);

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel10.setText("Receiver Needed Data");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 190, 150, 30);

        jTextField5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel3.add(jTextField5);
        jTextField5.setBounds(200, 40, 170, 30);

        jTextField6.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel3.add(jTextField6);
        jTextField6.setBounds(200, 90, 170, 30);

        jTextField7.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel3.add(jTextField7);
        jTextField7.setBounds(200, 140, 170, 30);

        jTextField8.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel3.add(jTextField8);
        jTextField8.setBounds(200, 190, 170, 30);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 230, 430, 140);

        jButton3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton3.setText("Receive ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(170, 390, 160, 30);

        jTabbedPane1.addTab("Receiver2 Details", jPanel3);

        jPanel4.add(jTabbedPane1);
        jTabbedPane1.setBounds(360, 120, 480, 480);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Data Sharing");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(370, 10, 190, 40);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setText("Mutilple Receiver Updates");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(330, 60, 230, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 880, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (cat.equalsIgnoreCase(rd)) {
                JOptionPane.showMessageDialog(null, "You are Authenticated");
                GetCiphetext gc = new GetCiphetext();
                gc.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "You are not a person to receive the data");
                System.exit(1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            ServerSocket receive = new ServerSocket(700);
            Socket rec = receive.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(rec.getInputStream()));
            String aa = br.readLine();
            String bb = br.readLine();
            String cc = br.readLine();
            String dd = br.readLine();
            jTextField1.setText(aa);
            jTextField2.setText(bb);
            jTextField3.setText(cc);
            cat = jTextField3.getText();
            jTextField4.setText(dd);
            rd = jTextField4.getText();
            jTextArea1.append("Name" + "\t" + aa + "\n" + "Id" + "\t" + bb + "\n" + "Category" + "\t" + cc + "\n" + "ReceiverNeededData" + "\t" + dd + "\n");
            JOptionPane.showMessageDialog(null, "Receiver1 Details are received");
            receive.close();
        } catch (IOException exception) {
            System.out.println("Error: " + exception);

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            ServerSocket receive1 = new ServerSocket(2000);
            Socket rec1 = receive1.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(rec1.getInputStream()));
            String aa = br.readLine();
            String bb = br.readLine();
            String cc = br.readLine();
            String dd = br.readLine();
            jTextField5.setText(aa);
            jTextField6.setText(bb);
            jTextField7.setText(cc);
            cat1 = jTextField7.getText();
            jTextField8.setText(dd);
            rd1 = jTextField8.getText();
            jTextArea2.append("Name" + "\t" + aa + "\n" + "Id" + "\t" + bb + "\n" + "Category" + "\t" + cc + "\n" + "ReceiverNeededData" + "\t" + dd + "\n");
            JOptionPane.showMessageDialog(null, "Receiver2 Details are received");
            rec1.close();
            receive1.close();
        } catch (IOException exception) {
            System.out.println("Error: " + exception);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (cat1.equalsIgnoreCase(rd1)) {
            JOptionPane.showMessageDialog(null, "You are Authenticated");
            GetCiphetext1 gc = new GetCiphetext1();
            gc.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "You are not a person to receive the data");
            System.exit(1);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(DataSharing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSharing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSharing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSharing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSharing().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
