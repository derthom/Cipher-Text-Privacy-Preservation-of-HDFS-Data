package privacypreservingdatasharing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.security.Key;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import sun.misc.BASE64Encoder;
import java.sql.*;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DataEncryption extends javax.swing.JFrame {

    Connection con;
    Statement stat, st1, st, st2;
    ResultSet rs, rs1, rs2, rs3;
    int i = 0, na, j = 0;
    public static long stime;

    public DataEncryption() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multisharing", "root", "root");
            stat = con.createStatement();
            st = con.createStatement();
            st1 = con.createStatement();
            st2 = con.createStatement();
            st.executeUpdate("truncate table cipher");
            st2.executeUpdate("truncate table secret_key");

            rs1 = st.executeQuery("select count(*) from dataset");
            na = 0;
            while (rs1.next()) {
                na = rs1.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DataEncryption");
        setMinimumSize(new java.awt.Dimension(754, 534));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encrypt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("Disease");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 280, 170, 30);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton2.setText("Name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 30, 170, 30);

        jButton3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton3.setText("Age");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 80, 170, 30);

        jButton4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton4.setText("Gender");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 130, 170, 30);

        jButton5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton5.setText("Month");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(30, 180, 170, 30);

        jButton6.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton6.setText("Place");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(30, 230, 170, 30);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Patient Data Encryption ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 20, 310, 50);

        jButton7.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton7.setText("Next");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(30, 340, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 90, 250, 400);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 90, 360, 400);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setText("Patient Data Encryption");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(290, 20, 310, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/canstock5326194.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(620, 0, 140, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4642100149_4d42485f59_m.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-20, -30, 250, 170);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 760, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            String name[] = new String[81035];
            String cipherText[] = new String[81035];
            jTextArea1.setText("");
            for (i = 0; i <= na; i++) {
                rs = st.executeQuery("select Name from dataset");
                while (rs.next()) {
                    name[i] = rs.getString(1);
                    i++;
                }
            }
            i = 0;
            j = 0;

            for (j = 1; j < na; j++) {
                String plainData = name[j];
                String v = "TheBestSecretKey";
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                st1.executeUpdate("INSERT INTO secret_key VALUES ('" + j + "','" + desKey + "',null,null,null,null,null)");
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(Cipher.ENCRYPT_MODE, desKey);
                byte[] byteDataToEncrypt = plainData.getBytes();
                byte[] byteCipherText = cipher.doFinal(byteDataToEncrypt);
                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
                jTextArea1.append("\n" + cipherText[j] + "\n");
                st2.executeUpdate("INSERT INTO cipher VALUES ('" + j + "','" + cipherText[j] + "',null,null,null,null,null)");
            }
            JOptionPane.showMessageDialog(null, "Secret key and ciphertext generated successfully for Name");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            st = con.createStatement();
            String nodes[] = new String[81035];
            String cipherText[] = new String[81035];
            jTextArea1.setText("");
            for (i = 0; i <= na; i++) {
                rs = st.executeQuery("select Age from dataset");
                while (rs.next()) {
                    nodes[i] = rs.getString(1);
                    i++;
                }
            }
            i = 0;
            j = 0;
            for (j = 1; j < na; j++) {
                String plainData = nodes[j];
                String v = "TheBestSecretKey";
                //DES
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                st1.executeUpdate("update secret_key set Agek= '" + desKey + "' where metadata='" + j + "'");
                cipher.init(Cipher.ENCRYPT_MODE, desKey);
                byte[] byteDataToEncrypt = plainData.getBytes();
                byte[] byteCipherText = cipher.doFinal(byteDataToEncrypt);
                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
                jTextArea1.append("\n" + cipherText[j] + "\n");
                st2.executeUpdate("update cipher set Agec= '" + cipherText[j] + "' where metadata='" + j + "'");

            }
            JOptionPane.showMessageDialog(null, "Secret key and ciphertext generated successfully for Age");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            st = con.createStatement();
            String nodes[] = new String[81035];
            String cipherText[] = new String[81035];
            jTextArea1.setText("");
            for (i = 0; i <= na; i++) {
                rs = st.executeQuery("select gender from dataset");
                while (rs.next()) {
                    nodes[i] = rs.getString(1);
                    i++;
                }
            }
            i = 0;
            j = 0;

            for (j = 1; j < na; j++) {
//                String plainData = nodes[j];
//                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
//                st1.executeUpdate("update secret_key set Genk= '" + key + "' where metadata='" + j + "'");
//                Cipher aesCipher = Cipher.getInstance("AES");
//                aesCipher.init(Cipher.ENCRYPT_MODE, key);
//                byte[] byteDataToEncrypt = plainData.getBytes();
//                byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
//                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
//                jTextArea1.append("\n" + cipherText[j] + "\n");
//                st2.executeUpdate("update cipher set genc= '" + cipherText[j] + "' where metadata='" + j + "'");

                String plainData = nodes[j];
                String v = "TheBestSecretKey";
                //DES
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                st1.executeUpdate("update secret_key set Genk= '" + desKey + "' where metadata='" + j + "'");
                cipher.init(Cipher.ENCRYPT_MODE, desKey);
                byte[] byteDataToEncrypt = plainData.getBytes();
                byte[] byteCipherText = cipher.doFinal(byteDataToEncrypt);
                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
                jTextArea1.append("\n" + cipherText[j] + "\n");
                st2.executeUpdate("update cipher set genc= '" + cipherText[j] + "' where metadata='" + j + "'");

            }
            JOptionPane.showMessageDialog(null, "Secret key and ciphertext generated successfully for Gender");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            st = con.createStatement();
            String nodes[] = new String[81035];
            String cipherText[] = new String[81035];
            jTextArea1.setText("");
            for (i = 0; i <= na; i++) {
                rs = st.executeQuery("select Month from dataset");
                while (rs.next()) {
                    nodes[i] = rs.getString(1);
                    i++;
                }
            }
            i = 0;
            j = 0;

            for (j = 1; j < na; j++) {

//                String plainData = nodes[j];
//
//                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
//                st1.executeUpdate("update secret_key set Monthk= '" + key + "' where metadata='" + j + "'");
//                Cipher aesCipher = Cipher.getInstance("AES");
//                aesCipher.init(Cipher.ENCRYPT_MODE, key);
//                byte[] byteDataToEncrypt = plainData.getBytes();
//                byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
//                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
//                jTextArea1.append("\n" + cipherText[j] + "\n");
//                st2.executeUpdate("update cipher set monthc= '" + cipherText[j] + "' where metadata='" + j + "'");

                String plainData = nodes[j];
                String v = "TheBestSecretKey";
                //DES
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                st1.executeUpdate("update secret_key set  Monthk= '" + desKey + "' where metadata='" + j + "'");
                cipher.init(Cipher.ENCRYPT_MODE, desKey);
                byte[] byteDataToEncrypt = plainData.getBytes();
                byte[] byteCipherText = cipher.doFinal(byteDataToEncrypt);
                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
                jTextArea1.append("\n" + cipherText[j] + "\n");
                st2.executeUpdate("update cipher set monthc= '" + cipherText[j] + "' where metadata='" + j + "'");

            }
            JOptionPane.showMessageDialog(null, "Secret key and ciphertext generated successfully for Month");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            st = con.createStatement();
            String nodes[] = new String[81035];
            String cipherText[] = new String[81035];
            jTextArea1.setText("");
            for (i = 0; i <= na; i++) {
                rs = st.executeQuery("select place from dataset");
                while (rs.next()) {
                    nodes[i] = rs.getString(1);
                    i++;
                }
            }
            i = 0;
            j = 0;

            for (j = 1; j < na; j++) {

//                String plainData = nodes[j];
//
//                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
//                st1.executeUpdate("update secret_key set Placek= '" + key + "' where metadata='" + j + "'");
//                Cipher aesCipher = Cipher.getInstance("AES");
//                aesCipher.init(Cipher.ENCRYPT_MODE, key);
//                byte[] byteDataToEncrypt = plainData.getBytes();
//                byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
//                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
//                jTextArea1.append("\n" + cipherText[j] + "\n");
//                st2.executeUpdate("update cipher set placec= '" + cipherText[j] + "' where metadata='" + j + "'");

                String plainData = nodes[j];
                String v = "TheBestSecretKey";
                //DES
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                st1.executeUpdate("update secret_key set  Placek= '" + desKey + "' where metadata='" + j + "'");
                cipher.init(Cipher.ENCRYPT_MODE, desKey);
                byte[] byteDataToEncrypt = plainData.getBytes();
                byte[] byteCipherText = cipher.doFinal(byteDataToEncrypt);
                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
                jTextArea1.append("\n" + cipherText[j] + "\n");
                st2.executeUpdate("update cipher set placec= '" + cipherText[j] + "' where metadata='" + j + "'");

            }
            JOptionPane.showMessageDialog(null, "Secret key and ciphertext generated successfully for place");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            st = con.createStatement();
            String nodes[] = new String[81035];
            String cipherText[] = new String[81035];
            jTextArea1.setText("");

            for (i = 0; i <= na; i++) {
                rs = st.executeQuery("select disease from dataset");
                while (rs.next()) {
                    nodes[i] = rs.getString(1);
                    i++;
                }
            }
            i = 0;
            j = 0;

            for (j = 1; j < na; j++) {

//                String plainData = nodes[j];
//
//                String v = "TheBestSecretKey";
//                //                    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
//                //                    keyGen.init(128);
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
//                //                    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
//                //                    keyGen.init(128);
//                //                    Key secretKey = keyGen.generateKey();
//                //                    SecretKey secretKey = keyGen.generateKey();
////                jTextArea1.append("\n"+key+"\n");
//                st1.executeUpdate("update secret_key set diseasek= '" + key + "' where metadata='" + j + "'");
//                Cipher aesCipher = Cipher.getInstance("AES");
//                aesCipher.init(Cipher.ENCRYPT_MODE, key);
//                byte[] byteDataToEncrypt = plainData.getBytes();
//                byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
//                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
//                jTextArea1.append("\n" + cipherText[j] + "\n");
//                st2.executeUpdate("update cipher set diseasec= '" + cipherText[j] + "' where metadata='" + j + "'");
                String plainData = nodes[j];
                String v = "TheBestSecretKey";
                //DES
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                st1.executeUpdate("update secret_key set  diseasek= '" + desKey + "' where metadata='" + j + "'");
                cipher.init(Cipher.ENCRYPT_MODE, desKey);
                byte[] byteDataToEncrypt = plainData.getBytes();
                byte[] byteCipherText = cipher.doFinal(byteDataToEncrypt);
                cipherText[j] = new BASE64Encoder().encode(byteCipherText);
                jTextArea1.append("\n" + cipherText[j] + "\n");
                st2.executeUpdate("update cipher set diseasec= '" + cipherText[j] + "' where metadata='" + j + "'");


            }
            JOptionPane.showMessageDialog(null, "Secret key and ciphertext generated successfully for Disease");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            File file = new File("D:/ED.csv"); //filepath is being passes through //ioc         //and filename through a method 
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                file.delete();

            } else {
                file.createNewFile();
            }
            String query;
//            query = "SELECT metadata,name,agec,genc,monthc,placec,diseasec into OUTFILE  '" + file + "' FIELDS TERMINATED BY ','  FROM  cipher";
//            st.executeQuery(query);
            query = "SELECT 'metadata','name','agec','genc','monthc','placec','diseasec' UNION ALL SELECT metadata,name,agec,genc,monthc,placec,diseasec INTO OUTFILE '" + file + "' FIELDS TERMINATED BY ',' FROM cipher";
            st.executeQuery(query);
            stime = System.currentTimeMillis();
            BufferedWriter bw = new BufferedWriter(new FileWriter("./enc.txt", false));
            bw.write(Long.toString(stime));
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Reencryption re = new Reencryption();
        re.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(DataEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataEncryption().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
