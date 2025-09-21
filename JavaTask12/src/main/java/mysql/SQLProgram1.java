package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLProgram1 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guvi","root","Pass@123");
		
		Statement stmt = con.createStatement();
		
		String s = "insert into Employees (empcode, empname, empage, esalary) VALUES (101,'Jenny',25,10000),(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000),(105,'Shameer',25,90000)";

		stmt.execute(s);
		con.close();
		System.out.println("Query Executed");
	}

}
