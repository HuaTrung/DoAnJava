package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
	public static Connection conn;

	public static void connect() {
		conn = null;
		try {
			// db parameters
			String url = "jdbc:sqlite:src/database/exercise.db";
			// create a connection to the database
			conn = DriverManager.getConnection(url);
			// de t demo cjo
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}