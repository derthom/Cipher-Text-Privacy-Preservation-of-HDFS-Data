package Receiver1;

import java.io.PrintStream;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Category extends javax.swing.JFrame {

    java.sql.Connection con;
    java.sql.Statement stat, st1, st;
    ResultSet rs, rs1, rs2, rs3;
    public static String name, cate, ru;
    public static String id;

    public Category() {
        initComponents();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://192.168.1.1:3306/MultiSharing", "root", "root");
            stat = con.createStatement();
            st = con.createStatement();
            st1 = con.createStatement();
            jTextField1.setText(Receiver1.anna);
            jTextField2.setText(Receiver1.id);
            st.executeUpdate("truncate table catdata");
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
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receiver ");
        setMinimumSize(new java.awt.Dimension(676, 537));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Receiver Updations");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 250, 70);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setText("Get");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 50, 120, 30);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 110, 120, 30);

        jButton4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 160, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(440, 140, 180, 230);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 70, 40, 20);

        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(140, 60, 210, 30);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel3.setText("Id");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 140, 30, 20);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel4.setText("Category");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 190, 70, 30);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel5.setText("Category to receive");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 279, 130, 20);

        jTextField2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField2);
        jTextField2.setBounds(140, 130, 210, 30);

        jTextField3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jPanel2.add(jTextField3);
        jTextField3.setBounds(140, 233, 210, 30);

        jTextField4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jTextField4.setToolTipText("");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(140, 309, 210, 30);

        jComboBox1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(140, 190, 210, 30);

        jComboBox2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox2FocusGained(evt);
            }
        });
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(140, 274, 210, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 80, 390, 350);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 680, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        	String cat = "",rcat = "";
        	int slno;
            name = jTextField1.getText();
            id = jTextField2.getText();
            
            try {
            	rs = st.executeQuery("SELECT @a:=@a+1 serial_number,diseasec "
                		+ "FROM cipher1,(SELECT @a:= 0) AS a GROUP BY diseasec "
                		+ "ORDER BY serial_number");
                while (rs.next()) {
                	slno = rs.getInt(1);
                	cat = rs.getString(2);
                	if(slno == (jComboBox1.getSelectedIndex()+1)){
                		System.out.println("Index of category selected is " + jComboBox1.getSelectedIndex());
                		System.out.println("pcat matched with cat");
                		break;
                	}
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            jTextField3.setText(jComboBox1.getSelectedItem().toString());
            //cate = jTextField3.getText();
            cate = cat;
            try {
                rs = st.executeQuery("SELECT @a:=@a+1 serial_number,diseasec "
                		+ "FROM cipher1,(SELECT @a:= 0) AS a GROUP BY diseasec "
                		+ "ORDER BY serial_number");
                while (rs.next()) {
                	slno = rs.getInt(1);
                	rcat = rs.getString(2);
                	if(slno == (jComboBox2.getSelectedIndex()+1)){
                		System.out.println("Index of category selected is " + jComboBox1.getSelectedIndex());
                		System.out.println("pcat matched with cat");
                		break;
                	}
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            jTextField4.setText(jComboBox2.getSelectedItem().toString());
           // ru = jTextField4.getText();
            ru = rcat;
            st.executeUpdate("insert into catdata values('" + name + "','" + id + "','" + cate + "','" + rcat + "')");
            System.out.println("updated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            try {
                Socket rec1 = new Socket("192.168.1.1", 700);
                PrintStream ps = new PrintStream(rec1.getOutputStream());
                ps.println(name);
                ps.println(id);
                ps.println(cate);
                ps.println(ru);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
        try {
            //rs = st.executeQuery("select distinct(diseasec) from cipher1");
            rs = st.executeQuery("select distinct(disease) from dataset");
            while (rs.next()) {
                String disc = rs.getString(1);
                jComboBox1.addItem(disc);
//                jComboBox2.addItem(disc);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_jComboBox1FocusGained

    private void jComboBox2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusGained
        try {
        	 //rs = st.executeQuery("select distinct(diseasec) from cipher1");
        	rs = st.executeQuery("select distinct(disease) from dataset");
            while (rs.next()) {
                String disc = rs.getString(1);
//                jComboBox1.addItem(disc);
                jComboBox2.addItem(disc);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_jComboBox2FocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ReceiveDetails rd = new ReceiveDetails();
        rd.setVisible(true);
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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
