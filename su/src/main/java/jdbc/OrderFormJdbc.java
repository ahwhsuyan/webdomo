package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OrderFormJdbc {
	private static Connection conn = null;
	public OrderFormJdbc(){
		try {
			String name="com.mysql.cj.jdbc.Driver";
			Class.forName(name);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public boolean DBconnect() throws SQLException{
		String url = "jdbc:mysql:" 
				+ "//47.117.68.39:3306/zxz_su?" 
				+ "useUnicode=true&characterEncoding=utf-8" 
				+ "&serverTimezone=GMT%2B8&useSSL=false"; 
		Properties info = new Properties();
		info.setProperty("user", "host");
		info.setProperty("password", "zxz20041107");
		try {
			conn = DriverManager.getConnection(url,info);
			if (conn != null) {
				return true;
			}
			} 
		catch (SQLException e) {
				e.printStackTrace();
		}
		return false;
	}	
}
