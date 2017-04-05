package Receiver2;

import Receiver1.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class Evaluation extends javax.swing.JFrame {

      public static long time = Decrypt.stime, etime, dtime, extime;
      public static float tit;

    public Evaluation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Efficiency Calculation");
        setMinimumSize(new java.awt.Dimension(531, 527));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TImeEfficiency", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("Predict");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 40, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(340, 180, 170, 100);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estimate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel2.setText("Encryption Time");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 60, 120, 23);

        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(140, 60, 110, 30);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel3.setText("Decryption Time");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 120, 109, 20);

        jTextField2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField2);
        jTextField2.setBounds(140, 110, 110, 30);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel4.setText("Total Time Taken");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 180, 120, 23);

        jTextField3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField3);
        jTextField3.setBounds(140, 170, 110, 30);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel5.setText("Time Efficiency");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 220, 100, 30);

        jTextField4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField4);
        jTextField4.setBounds(140, 220, 110, 30);

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel6.setText("(ms)");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(250, 230, 40, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 100, 310, 290);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Algorithm Efficiency Calculation");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(110, 30, 400, 60);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 530, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
           try {
            BufferedReader br = new BufferedReader(new FileReader("./enc.txt"));
            String ti = null;
            while ((ti = br.readLine()) != null) {
                String aa = ti;
                jTextField1.setText(aa);
            }
            etime = Long.parseLong(jTextField1.getText());
            jTextField2.setText(Long.toString(time));
            dtime = Long.parseLong(jTextField2.getText());
            extime = dtime - etime;
             jTextField3.setText(Long.toString(extime));
             System.out.println("total time taken is"+extime);
              long tim=Long.parseLong(jTextField3.getText());
                    System.out.println("total time taken is" + extime);
                    float tt = (float) tim / 100;
                    jTextField4.setText(Float.toString(tt));
                    tit=Float.parseFloat(jTextField4.getText());
                    System.out.println("time efff is" + tt);
                    

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
                          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        Chart1 ch=new Chart1();
        ch.main(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evaluation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
