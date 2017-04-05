package privacypreservingdatasharing;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DatasetLoad extends javax.swing.JFrame {

    public static String fname, dname, finame;

    public DatasetLoad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Load Dataset");
        setMinimumSize(new java.awt.Dimension(770, 557));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Browse Dataset and Load Dataset");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 0, 410, 90);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Browse", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("Collect Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 40, 150, 30);

        jButton3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton3.setText("View Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(210, 40, 110, 30);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 40, 63, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(150, 80, 470, 100);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MedicalDataset", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 70, 630, 210);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setText("Dataset Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(150, 20, 130, 30);

        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(290, 20, 250, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 200, 700, 310);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4642100149_4d42485f59_m.jpg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(-20, 0, 260, 220);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 770, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            FileDialog fd = new FileDialog(this, "Open...", FileDialog.LOAD);
            fd.setFile("*.*");
            fd.show();
            fname = fd.getFile();
            dname = fd.getDirectory();
            jTextField1.setText(dname + fname);
            finame = jTextField1.getText();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            FileReader fr = new FileReader(finame);
            BufferedReader br = new BufferedReader(fr);
            String read = null;
            while ((read = br.readLine()) != null) {
                String aa = read;
                jTextArea1.append(aa + "\n");
            }
            String cont = jTextArea1.getText();
            FileWriter fw = new FileWriter("./dataset.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(cont);

            bw.close();
            FileWriter fw1 = new FileWriter("./dataset.txt");
            BufferedWriter bw1 = new BufferedWriter(fw1);
            bw1.write(cont);
            bw1.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoadintoHDFS ld = new LoadintoHDFS();
        ld.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DatasetLoad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatasetLoad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatasetLoad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatasetLoad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatasetLoad().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
