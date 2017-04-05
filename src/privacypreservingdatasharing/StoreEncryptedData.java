package privacypreservingdatasharing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import sun.misc.BASE64Decoder;

public class StoreEncryptedData extends javax.swing.JFrame {

    File input = new File("D:/RED.csv");
    Statement st;
    ResultSet rs;

    public StoreEncryptedData() {
        initComponents();
        try {
            Connection con = null;
            String url = "jdbc:mysql://localhost:3306/";
            String db = "multisharing";
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            con = DriverManager.getConnection(url + db, "root", "root");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StoreEncryptedData");
        setMinimumSize(new java.awt.Dimension(717, 570));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "StoreinHDFS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("Store in HDFS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 40, 140, 30);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 40, 120, 30);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(160, 80, 350, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Data From HDFS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 40, 470, 280);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(80, 190, 530, 350);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/d-man-cloud-security-concept-white-background-front-angle-view-46326231.jpg"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(490, 60, 220, 140);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Store Encrypted Data in HDFS and View Encrypted data");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 10, 620, 60);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 720, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Configuration conf = new Configuration();
        try {
            FileSystem fs = FileSystem.get(conf);

            File f = input;
            FileInputStream inFile = new FileInputStream(f);
            Path outFile = new Path("/hadoop/mapred/system/ReEncryptedData.csv");
            System.out.println("file : " + f.getName() + "\t" + "filepath : " + f.getAbsolutePath());
            if (fs.exists(outFile)) {
                printAndExit("Output already exists");
                fs.delete(outFile, true);
                //JOptionPane.showMessageDialog(null, "Output already exists!");
            }

            FSDataOutputStream out = fs.create(outFile);
            System.out.println("out name : " + outFile.getName() + " \t "
                    + outFile.getFileSystem(conf));
            byte buffer[] = new byte[256];
            try {
                int bytesRead = 0;
                while ((bytesRead = inFile.read(buffer)) > 0) {
                    out.write(buffer, 0, bytesRead);
                    System.out.println("file written");
                }
                JOptionPane.showMessageDialog(null, "File Uploaded Successfully!");
            } catch (IOException e) {
                System.out.println("Error while copying file");
            } finally {
                inFile.close();
                out.close();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        try {
            Configuration conf1 = new Configuration();
            FileSystem fs = FileSystem.get(conf1);
            Path inFile = new Path("/hadoop/mapred/system/ReEncryptedData.csv");
            if (!fs.exists(inFile)) {
                printAndExit("Input file not found");
            }
            if (!fs.isFile(inFile)) {
                printAndExit("Input should be a file");
            }
            FSDataInputStream in = fs.open(inFile);
            try {
                int bytesRead = 0, i = 0;
                while ((bytesRead = in.read()) != -1) {
                    i++;
                    if (i == 100) {
                        i = 0;
                        System.out.print((char) bytesRead);
                        jTextArea1.append((char) bytesRead + "");
//                        jTextArea1.append("\n");
                        System.out.println();
                    } else {
                        jTextArea1.append((char) bytesRead + "");
//                        jTextArea1.append("\n");
                        System.out.print((char) bytesRead);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error while copying file");
            } finally {
                in.close();
            }

        } catch (Exception ex) {
            System.out.println("Exception : " + ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DataSharing ds = new DataSharing();
        ds.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    static void printAndExit(String str) {
        System.err.println(str);
        //System.exit(1);
    }

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
            java.util.logging.Logger.getLogger(StoreEncryptedData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreEncryptedData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreEncryptedData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreEncryptedData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreEncryptedData().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
