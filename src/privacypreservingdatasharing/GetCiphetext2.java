package privacypreservingdatasharing;

import Receiver1.Receiver1;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class GetCiphetext2 extends javax.swing.JFrame {

    public static String cat = DataSharing.cat2, rd = DataSharing.rd2;
    java.sql.Connection con;
    java.sql.Statement stat, st1, st;
    ResultSet rs, rs1, rs2, rs3;

    public GetCiphetext2() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MultiSharing", "root", "root");
            stat = con.createStatement();
            st = con.createStatement();
            st1 = con.createStatement();
            st.executeUpdate("truncate table metadata2");
            st.executeUpdate("truncate table ciphertext2");

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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(647, 553));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Get Ciphertext Based on Given Category");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 480, 50);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GetCiphertext", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("Retrieve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 50, 110, 30);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton2.setText("Send to Receiver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 50, 160, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(150, 80, 370, 110);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciphertext", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 510, 270);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 200, 560, 330);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 650, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            rs = st.executeQuery("select metadata2 from cipher1 where diseasec='" + cat + "'");
            while (rs.next()) {
                int md = rs.getInt(1);
                System.out.println("metadata" + md);
                st.executeUpdate("insert into metadata2 values('" + md + "') ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            rs = st.executeQuery("select * from cipher1 where diseasec='" + cat + "'");
            while (rs.next()) {
                int md = rs.getInt(1);
                String name = rs.getString(2);
                String age = rs.getString(3);
                String gen = rs.getString(4);
                String month = rs.getString(5);
                String place = rs.getString(6);
                String dise = rs.getString(7);
                st1.executeUpdate("insert into  ciphertext2 values('" + md + "','" + name + "','" + age + "','" + gen + "','" + month + "','" + place + "','" + dise + "')");
                jTextArea1.append(md + "\t" + name + "\t" + age + "\t" + gen + "\t" + month + "\t" + place + "\t" + dise + "\n");
                String cont = jTextArea1.getText();
                BufferedWriter bw = new BufferedWriter(new FileWriter("./cipher2.txt"));
                bw.write(cont);
                bw.close();

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            ServerSocket servsock = new ServerSocket(1235);
            File myFile = new File("./cipher2.txt");
            while (true) {
                Socket sock = servsock.accept();
                byte[] mybytearray = new byte[(int) myFile.length()];
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myFile));
                bis.read(mybytearray, 0, mybytearray.length);
                OutputStream os = sock.getOutputStream();
                os.write(mybytearray, 0, mybytearray.length);
                os.flush();
                sock.close();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

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
            java.util.logging.Logger.getLogger(GetCiphetext2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetCiphetext2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetCiphetext2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetCiphetext2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetCiphetext2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
