package com.xworkz.manju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// static block
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dimpi", "root",
					"Xworkzodc@123");

			String insertQuery = "insert into pastries_table values(0,'Vanilla','Cream','Chocolate','Puff',180);";

			Statement statement = connection.createStatement();
			int rowAffected = statement.executeUpdate(insertQuery);
			System.out.println("rowAffected" + rowAffected);
			connection.close();

		} catch (ClassNotFoundException cnfe) {
			System.out.println("ClassNotFoundException problem loading driver,class name is wrong" + cnfe);
		} catch (SQLException e) {
			System.out.println("SQLException connecting to DB,either URL.or password is wrong" + e);
		}
	}

}
