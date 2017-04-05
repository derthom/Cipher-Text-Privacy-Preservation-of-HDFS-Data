import java.sql.*;
import java.util.*;
public class MeQ {
public static void main(String[] args)
{
	String url="jdbc:oracle:thin:@//192.168.1.2:1521/XE";
	String user="system";
	String pass="ilovelamborgini";
	Connection con=null;
	Statement pstmt=null;
	ResultSet res=null;
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded successfulyy");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("Driver not loaded");
	}
	try
	{
		con=DriverManager.getConnection(url,user,pass);
		System.out.println("Conection established successfully");
	}
	catch(SQLException e)
	{
		System.out.println("COnnec not estab");
	}
	try
	{
		String s="select * from hello";
		pstmt=con.createStatement();
		res=pstmt.executeQuery(s);
	}
	catch(SQLException e)
	{
		System.out.println("Query not executed");
	}
}

}
