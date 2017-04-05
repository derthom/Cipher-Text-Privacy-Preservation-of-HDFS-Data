package privacypreservingdatasharing;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class LoadintoHDFS extends javax.swing.JFrame {

    File input = new File("./dataset.txt");
    java.sql.Connection con;
    java.sql.Statement stat, st1, st;
    ResultSet rs, rs1, rs2, rs3;

    public LoadintoHDFS() {
        initComponents();
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MultiSharing", "root", "root");
                stat = con.createStatement();
                st = con.createStatement();
                st1 = con.createStatement();
                st.executeUpdate("truncate table dataset");
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoadintoHDFS");
        setMinimumSize(new java.awt.Dimension(807, 573));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Load into HDFS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14), java.awt.Color.black)); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("Load into HDFS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 40, 140, 31);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 40, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 80, 360, 110);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Data Stored in HDFS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 30, 260, 38);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 580, 260);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 210, 670, 320);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/index_1.jpg"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(-20, -20, 200, 210);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 810, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Configuration conf = new Configuration();
        try {
            FileSystem fs = FileSystem.get(conf);

            File f = input;
            FileInputStream inFile = new FileInputStream(f);
            Path outFile = new Path("/hadoop/mapred/system/dataset.txt");
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
            FileInputStream fstream = new FileInputStream("./dataset.csv");
            DataInputStream dstream = new DataInputStream(fstream);
            BufferedReader bf = new BufferedReader(new InputStreamReader(dstream));
            String data = null;
            String comma = ",";
            int count = 0;
            while ((data = bf.readLine()) != null) {
                StringTokenizer stoken = new StringTokenizer(data, comma);
                String name = stoken.nextToken();
                String age = stoken.nextToken();
                String gen = stoken.nextToken();
                String month = stoken.nextToken();
                String pla = stoken.nextToken();
                String dis = stoken.nextToken();
                st.executeUpdate("INSERT into dataset VALUES('" + name + "' , '" + age + "' , '" + gen + "' ,'" + month + "','" + pla + "','" + dis + "')");
            }
            System.out.println("inserted");


            bf.close();
//            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        try {
            Vector col = new Vector();
            Vector data = new Vector();
            System.out.println("Connected to the database");
            rs = st.executeQuery("select * from dataset");
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                col.addElement(md.getColumnName(i));
            }
            while (rs.next()) {
                Vector row = new Vector(columns);
                for (int i = 1; i <= columns; i++) {
                    row.addElement(rs.getObject(i));
                }
                data.addElement(row);
            }
            DefaultTableModel model = new DefaultTableModel(data, col);
            jTable1.setModel(model);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DataEncryption d = new DataEncryption();
        d.setVisible(true);
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
            java.util.logging.Logger.getLogger(LoadintoHDFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadintoHDFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadintoHDFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadintoHDFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadintoHDFS().setVisible(true);
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
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
