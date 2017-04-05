package Receiver2;

import java.security.Key;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;

public class Decrypt extends javax.swing.JFrame {

    java.sql.Connection con;
    java.sql.Statement stat, st1, st,stmt,stmt1,stmt2;
    ResultSet rs, rs1, rs2, rs3,rst,rst1,rst2;
    public static long stime;
    public String searchdis;

    public Decrypt() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://192.168.1.1:3306/MultiSharing", "root", "root");
            stat = con.createStatement();
            st = con.createStatement();
            st1 = con.createStatement();
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            stmt2 = con.createStatement();
            
            //searched disease
            rs = st.executeQuery("select distinct(diseasec) from diseaseen");
            while (rs.next()) {
                searchdis = rs.getString(1);
            }
            
            st.executeUpdate("truncate table nameen");
            st.executeUpdate("truncate table ageen");
            st.executeUpdate("truncate table genen");
            st.executeUpdate("truncate table monthen");
            st.executeUpdate("truncate table placeen");
            st.executeUpdate("truncate table diseaseen");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(596, 656));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("View Decrypted Results");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 0, 270, 60);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Decrypt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("Decrypt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 40, 90, 30);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton2.setText("Performance Evaluation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 40, 190, 30);

        jButton3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton3.setText("ReDecryption");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(120, 40, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 60, 480, 110);

        jTabbedPane1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 380, 140);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 200, 380, 130);

        jTabbedPane1.addTab("Name and Age", jPanel3);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(20, 30, 360, 140);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(20, 190, 370, 140);

        jTabbedPane1.addTab("Gender and Month", jPanel4);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jPanel5.add(jScrollPane5);
        jScrollPane5.setBounds(20, 30, 380, 150);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jPanel5.add(jScrollPane6);
        jScrollPane6.setBounds(20, 200, 380, 130);

        jTabbedPane1.addTab("Place and Disease", jPanel5);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(90, 190, 440, 400);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 600, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            rs = st.executeQuery("select Name,metadata from ciphertext ");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
                byte[] keyValue = v.getBytes();
                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
                Cipher c = Cipher.getInstance("AES");
                c.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = c.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                System.out.println("dv" + decryptedValue);
                
                String metadatanum = rs.getString(2);
                System.out.println("Metadatanum = " + metadatanum);
                rst = stmt.executeQuery("select name from cipher where metadata = "+metadatanum+"");
                while(rst.next()){
                	decryptedValue = rst.getString(1);
                	System.out.println("DECRYPTED VALUE @@@ : " + decryptedValue);
                }
                
                jTextArea1.append(decryptedValue + "\n");
                st1.executeUpdate("insert into nameen values('" + decryptedValue + "')");

//                 String name = rs.getString(1);
//                String v = "TheBestSecretKey";
////                byte[] keyValue = v.getBytes();
////                Key key = new SecretKeySpec(keyValue, "AES");
//                String strPassword = name;
////                Cipher c = Cipher.getInstance("AES");
////                c.init(Cipher.DECRYPT_MODE, key);
//                DESKeySpec dks = new DESKeySpec(v.getBytes());
//                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
//                SecretKey desKey = skf.generateSecret(dks);
//                Cipher cipher = Cipher.getInstance("DES");
//                cipher.init(Cipher.DECRYPT_MODE, desKey);
//
//
//                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
//                byte[] decValue = cipher.doFinal(decordedValue);
//                String decryptedValue = new String(decValue);
//                System.out.println("dv" + decryptedValue);
//                jTextArea1.append(decryptedValue + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            rs = st.executeQuery("select Age,metadata from ciphertext ");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
                byte[] keyValue = v.getBytes();
                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
                Cipher c = Cipher.getInstance("AES");
                c.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = c.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                System.out.println("dv" + decryptedValue);
                
                String metadatanum = rs.getString(2);
                System.out.println("Metadatanum = " + metadatanum);
                rst = stmt.executeQuery("select agec from cipher where metadata = "+metadatanum+"");
                while(rst.next()){
                	decryptedValue = rst.getString(1);
                	System.out.println("DECRYPTED VALUE @@@ : " + decryptedValue);
                }
                
                jTextArea2.append(decryptedValue + "\n");
                st1.executeUpdate("insert into ageen values('" + decryptedValue + "')");
//                 String name = rs.getString(1);
//                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
//                String strPassword = name;
//                Cipher c = Cipher.getInstance("AES");
//                c.init(Cipher.DECRYPT_MODE, key);
//                DESKeySpec dks = new DESKeySpec(v.getBytes());
//                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
//                SecretKey desKey = skf.generateSecret(dks);
//                Cipher cipher = Cipher.getInstance("DES");
//                cipher.init(Cipher.DECRYPT_MODE, desKey);
//
//
//                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
//                byte[] decValue = cipher.doFinal(decordedValue);
//                String decryptedValue = new String(decValue);
//                System.out.println("dv" + decryptedValue);
//                jTextArea2.append(decryptedValue + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            rs = st.executeQuery("select gen,metadata from ciphertext ");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
                byte[] keyValue = v.getBytes();
                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
                Cipher c = Cipher.getInstance("AES");
                c.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = c.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                System.out.println("dv" + decryptedValue);
                
                String metadatanum = rs.getString(2);
                System.out.println("Metadatanum = " + metadatanum);
                rst = stmt.executeQuery("select genc from cipher where metadata = "+metadatanum+"");
                while(rst.next()){
                	decryptedValue = rst.getString(1);
                	System.out.println("DECRYPTED VALUE @@@ : " + decryptedValue);
                }
                
                jTextArea3.append(decryptedValue + "\n");
                st1.executeUpdate("insert into genen values('" + decryptedValue + "')");
//                 String name = rs.getString(1);
//                String v = "TheBestSecretKey";
////                byte[] keyValue = v.getBytes();
////                Key key = new SecretKeySpec(keyValue, "AES");
//                String strPassword = name;
////                Cipher c = Cipher.getInstance("AES");
////                c.init(Cipher.DECRYPT_MODE, key);
//                DESKeySpec dks = new DESKeySpec(v.getBytes());
//                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
//                SecretKey desKey = skf.generateSecret(dks);
//                Cipher cipher = Cipher.getInstance("DES");
//                cipher.init(Cipher.DECRYPT_MODE, desKey);
//
//
//                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
//                byte[] decValue = cipher.doFinal(decordedValue);
//                String decryptedValue = new String(decValue);
//                System.out.println("dv" + decryptedValue);
//                jTextArea3.append(decryptedValue + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            rs = st.executeQuery("select Month,metadata from ciphertext ");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
                byte[] keyValue = v.getBytes();
                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
                Cipher c = Cipher.getInstance("AES");
                c.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = c.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                System.out.println("dv" + decryptedValue);
                
                String metadatanum = rs.getString(2);
                System.out.println("Metadatanum = " + metadatanum);
                rst = stmt.executeQuery("select monthc from cipher where metadata = "+metadatanum+"");
                while(rst.next()){
                	decryptedValue = rst.getString(1);
                	System.out.println("DECRYPTED VALUE @@@ : " + decryptedValue);
                }
                
                jTextArea4.append(decryptedValue + "\n");
                st1.executeUpdate("insert into monthen values('" + decryptedValue + "')");
//                 String name = rs.getString(1);
//                String v = "TheBestSecretKey";
////                byte[] keyValue = v.getBytes();
////                Key key = new SecretKeySpec(keyValue, "AES");
//                String strPassword = name;
////                Cipher c = Cipher.getInstance("AES");
////                c.init(Cipher.DECRYPT_MODE, key);
//                DESKeySpec dks = new DESKeySpec(v.getBytes());
//                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
//                SecretKey desKey = skf.generateSecret(dks);
//                Cipher cipher = Cipher.getInstance("DES");
//                cipher.init(Cipher.DECRYPT_MODE, desKey);
//
//
//                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
//                byte[] decValue = cipher.doFinal(decordedValue);
//                String decryptedValue = new String(decValue);
//                System.out.println("dv" + decryptedValue);
//                jTextArea4.append(decryptedValue + "\n");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            rs = st.executeQuery("select place,metadata from ciphertext ");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
                byte[] keyValue = v.getBytes();
                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
                Cipher c = Cipher.getInstance("AES");
                c.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = c.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                System.out.println("dv" + decryptedValue);
                
                String metadatanum = rs.getString(2);
                System.out.println("Metadatanum = " + metadatanum);
                rst = stmt.executeQuery("select placec from cipher where metadata = "+metadatanum+"");
                while(rst.next()){
                	decryptedValue = rst.getString(1);
                	System.out.println("DECRYPTED VALUE @@@ : " + decryptedValue);
                }
                
                jTextArea5.append(decryptedValue + "\n");
                st1.executeUpdate("insert into placeen values('" + decryptedValue + "')");

//                 String name = rs.getString(1);
//                String v = "TheBestSecretKey";
////                byte[] keyValue = v.getBytes();
////                Key key = new SecretKeySpec(keyValue, "AES");
//                String strPassword = name;
////                Cipher c = Cipher.getInstance("AES");
////                c.init(Cipher.DECRYPT_MODE, key);
//                DESKeySpec dks = new DESKeySpec(v.getBytes());
//                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
//                SecretKey desKey = skf.generateSecret(dks);
//                Cipher cipher = Cipher.getInstance("DES");
//                cipher.init(Cipher.DECRYPT_MODE, desKey);
//
//
//                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
//                byte[] decValue = cipher.doFinal(decordedValue);
//                String decryptedValue = new String(decValue);
//                System.out.println("dv" + decryptedValue);
//                jTextArea5.append(decryptedValue + "\n");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            rs = st.executeQuery("select disease,metadata from ciphertext ");
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println("DISEASE to be decrypted is " + name);
                String v = "TheBestSecretKey";
                byte[] keyValue = v.getBytes();
                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
                Cipher c = Cipher.getInstance("AES");
                c.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = c.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                System.out.println("dv" + decryptedValue);

                String metadatanum = rs.getString(2);
                System.out.println("Metadatanum = " + metadatanum);
                rst = stmt.executeQuery("select diseasec from cipher where metadata = "+metadatanum+"");
                while(rst.next()){
                	decryptedValue = rst.getString(1);
                	System.out.println("DECRYPTED VALUE @@@ : " + decryptedValue);
                }
                jTextArea6.append(decryptedValue + "\n");
                st1.executeUpdate("insert into diseaseen values('" + decryptedValue + "')");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        stime = System.currentTimeMillis();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Evaluation eva = new Evaluation();
        eva.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            jTextArea1.setText("");
            rs = st.executeQuery("select * from nameen");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
//                Cipher c = Cipher.getInstance("AES");
//                c.init(Cipher.DECRYPT_MODE, key);
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(Cipher.DECRYPT_MODE, desKey);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = cipher.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                
                rst1 = stmt1.executeQuery("select metadata from cipher where diseasec = '" + searchdis + "' and name = '"+ name + "'");
                System.out.println("select metadata from cipher where diseasec = '" + searchdis + "' and name = '"+ name + "'");
                	int metadatanum = 0;
					while(rst1.next()){
                		metadatanum = rst1.getInt(1);
                		System.out.println("cipher metadatanum now is " + metadatanum);
                			rst2 = stmt2.executeQuery("Select @a:=@a+1 serial_number,name "
                		+ "FROM dataset,(SELECT @a:= 0) AS a");
                while(rst2.next()){
                	int slno = rst2.getInt(1);
                	if(slno==metadatanum){
                		decryptedValue = rst2.getString(2);
                		System.out.println("dv" + decryptedValue);
                        jTextArea1.append(decryptedValue + "\n");
                        break;
                	}
                }
                }
                
                /*System.out.println("dv" + decryptedValue);
                jTextArea6.append(decryptedValue + "\n");*/
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            jTextArea2.setText("");
            rs = st.executeQuery("select distinct(age) from ageen");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
//                Cipher c = Cipher.getInstance("AES");
//                c.init(Cipher.DECRYPT_MODE, key);
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(Cipher.DECRYPT_MODE, desKey);


                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = cipher.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                rst1 = stmt1.executeQuery("select metadata from cipher where diseasec = '" + searchdis + "' and agec = '"+ name + "'");
                System.out.println("select metadata from cipher where diseasec = '" + searchdis + "' and agec = '"+ name + "'");
                	int metadatanum = 0;
					while(rst1.next()){
                		metadatanum = rst1.getInt(1);
                		System.out.println("cipher metadatanum now is " + metadatanum);
                			rst2 = stmt2.executeQuery("Select @a:=@a+1 serial_number,age "
                		+ "FROM dataset,(SELECT @a:= 0) AS a");
                while(rst2.next()){
                	int slno = rst2.getInt(1);
                	if(slno==metadatanum){
                		decryptedValue = rst2.getString(2);
                		System.out.println("dv" + decryptedValue);
                        jTextArea2.append(decryptedValue + "\n");
                        break;
                	}
                }
                }
                
                /*System.out.println("dv" + decryptedValue);
                jTextArea6.append(decryptedValue + "\n");*/
            }



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            jTextArea3.setText("");
            rs = st.executeQuery("select distinct(gender) from genen");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
//                Cipher c = Cipher.getInstance("AES");
//                c.init(Cipher.DECRYPT_MODE, key);
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(Cipher.DECRYPT_MODE, desKey);


                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = cipher.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                rst1 = stmt1.executeQuery("select metadata from cipher where diseasec = '" + searchdis + "' and genc = '"+ name + "'");
                System.out.println("select metadata from cipher where diseasec = '" + searchdis + "' and genc = '"+ name + "'");
                	int metadatanum = 0;
					while(rst1.next()){
                		metadatanum = rst1.getInt(1);
                		System.out.println("cipher metadatanum now is " + metadatanum);
                			rst2 = stmt2.executeQuery("Select @a:=@a+1 serial_number,gender "
                		+ "FROM dataset,(SELECT @a:= 0) AS a");
                while(rst2.next()){
                	int slno = rst2.getInt(1);
                	if(slno==metadatanum){
                		decryptedValue = rst2.getString(2);
                		System.out.println("dv" + decryptedValue);
                        jTextArea3.append(decryptedValue + "\n");
                        break;
                	}
                }
                }
                
                /*System.out.println("dv" + decryptedValue);
                jTextArea6.append(decryptedValue + "\n");*/
            }



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            jTextArea4.setText("");
            rs = st.executeQuery("select distinct(month) from monthen");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
//                Cipher c = Cipher.getInstance("AES");
//                c.init(Cipher.DECRYPT_MODE, key);
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(Cipher.DECRYPT_MODE, desKey);


                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = cipher.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                rst1 = stmt1.executeQuery("select metadata from cipher where diseasec = '" + searchdis + "' and monthc = '"+ name + "'");
                System.out.println("select metadata from cipher where diseasec = '" + searchdis + "' and monthc = '"+ name + "'");
                	int metadatanum = 0;
					while(rst1.next()){
                		metadatanum = rst1.getInt(1);
                		System.out.println("cipher metadatanum now is " + metadatanum);
                			rst2 = stmt2.executeQuery("Select @a:=@a+1 serial_number,month "
                		+ "FROM dataset,(SELECT @a:= 0) AS a");
                while(rst2.next()){
                	int slno = rst2.getInt(1);
                	if(slno==metadatanum){
                		decryptedValue = rst2.getString(2);
                		System.out.println("dv" + decryptedValue);
                        jTextArea4.append(decryptedValue + "\n");
                        break;
                	}
                }
                }
                
                /*System.out.println("dv" + decryptedValue);
                jTextArea6.append(decryptedValue + "\n");*/
            }



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            jTextArea5.setText("");
            rs = st.executeQuery("select distinct(place) from placeen");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
//                Cipher c = Cipher.getInstance("AES");
//                c.init(Cipher.DECRYPT_MODE, key);
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(Cipher.DECRYPT_MODE, desKey);


                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = cipher.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                
                rst1 = stmt1.executeQuery("select metadata from cipher where diseasec = '" + searchdis + "' and placec = '"+ name + "'");
                System.out.println("select metadata from cipher where diseasec = '" + searchdis + "' and placec = '"+ name + "'");
                	int metadatanum = 0;
					while(rst1.next()){
                		metadatanum = rst1.getInt(1);
                		System.out.println("cipher metadatanum now is " + metadatanum);
                			rst2 = stmt2.executeQuery("Select @a:=@a+1 serial_number,place "
                		+ "FROM dataset,(SELECT @a:= 0) AS a");
                while(rst2.next()){
                	int slno = rst2.getInt(1);
                	if(slno==metadatanum){
                		decryptedValue = rst2.getString(2);
                		System.out.println("dv" + decryptedValue);
                        jTextArea5.append(decryptedValue + "\n");
                        break;
                	}
                }
                }
                
                /*System.out.println("dv" + decryptedValue);
                jTextArea6.append(decryptedValue + "\n");*/
            }



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            jTextArea6.setText("");
            rs = st.executeQuery("select distinct(diseasec) from diseaseen");
            while (rs.next()) {
                String name = rs.getString(1);
                String v = "TheBestSecretKey";
//                byte[] keyValue = v.getBytes();
//                Key key = new SecretKeySpec(keyValue, "AES");
                String strPassword = name;
//                Cipher c = Cipher.getInstance("AES");
//                c.init(Cipher.DECRYPT_MODE, key);
                DESKeySpec dks = new DESKeySpec(v.getBytes());
                SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                SecretKey desKey = skf.generateSecret(dks);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(Cipher.DECRYPT_MODE, desKey);


                byte[] decordedValue = new BASE64Decoder().decodeBuffer(strPassword);
                byte[] decValue = cipher.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                
                rst1 = stmt1.executeQuery("select metadata from cipher where diseasec = '"+ name + "'");
                System.out.println("select metadata from cipher where diseasec = '"+ name + "'");
                	int metadatanum = 0;
					while(rst1.next()){
                		metadatanum = rst1.getInt(1);
                		System.out.println("cipher metadatanum now is " + metadatanum);
                			rst2 = stmt2.executeQuery("Select @a:=@a+1 serial_number,disease "
                		+ "FROM dataset,(SELECT @a:= 0) AS a");
                while(rst2.next()){
                	int slno = rst2.getInt(1);
                	if(slno==metadatanum){
                		decryptedValue = rst2.getString(2);
                		System.out.println("dv" + decryptedValue);
                        jTextArea6.append(decryptedValue + "\n");
                        break;
                	}
                }
                }
                
                /*System.out.println("dv" + decryptedValue);
                jTextArea6.append(decryptedValue + "\n");*/
            }

} catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        // display all
        /*jTextArea1.setText("");
		jTextArea2.setText("");
		jTextArea3.setText("");
		jTextArea4.setText("");
		jTextArea5.setText("");
		jTextArea6.setText("");
        try{
        	System.out.println("INSIDE Display all");	
        rst1 = stmt1.executeQuery("select metadata from cipher where diseasec = '"+ searchdis + "'");
        System.out.println("select metadata from cipher where diseasec = '"+ searchdis + "'");
        	int metadatanum = 0;
			while(rst1.next()){
        		metadatanum = rst1.getInt(1);
        		System.out.println("cipher metadatanum now is " + metadatanum);
        			rst2 = stmt2.executeQuery("Select @a:=@a+1 serial_number,name,age,gender,month,place,disease "
        		+ "FROM dataset,(SELECT @a:= 0) AS a");
        while(rst2.next()){
        	int slno = rst2.getInt(1);
        	if(metadatanum == slno){
        		jTextArea1.append(rst2.getString(2)+ "\n");
        		jTextArea2.append(rst2.getString(3) + "\n");
        		jTextArea3.append(rst2.getString(4) + "\n");
        		jTextArea4.append(rst2.getString(5)+ "\n");
        		jTextArea5.append(rst2.getString(6)+ "\n");
        		jTextArea6.append(rst2.getString(7)+ "\n");
        	}
        }
			}
        }catch (Exception e) {
e.printStackTrace();
}*/
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Decrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Decrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Decrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Decrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Decrypt().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables
}
