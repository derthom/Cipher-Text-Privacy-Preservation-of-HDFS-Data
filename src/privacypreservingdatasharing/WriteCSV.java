/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package privacypreservingdatasharing;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import au.com.bytecode.opencsv.CSVWriter;

public class WriteCSV {

    public static void main(String[] args) {

        try {
            Connection con;
            Statement stat, st1, st, st2,stmt;
            ResultSet rs, rs1, rs2, rs3;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multisharing", "root", "root");
            stat = con.createStatement();
             stmt = con.createStatement();
            rs = stat.executeQuery("select * from dataset");
            String csv = "E:\\dummyFolder\\output2.csv";
            CSVWriter writer = new CSVWriter(new FileWriter(csv));
            List<String[]> data = new ArrayList<String[]>();
            while (rs.next()) {
                data.add(new String[]{rs.getString(1), rs.getString(2)});
            }
            writer.writeAll(data);
            System.out.println("CSV written successfully.");
            writer.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}