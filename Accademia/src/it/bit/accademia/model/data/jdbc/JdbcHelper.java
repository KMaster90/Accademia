package it.bit.accademia.model.data.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcHelper {
	public static Connection createConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/scuola", "root",
				"1qaz2wsx");
	}
}
