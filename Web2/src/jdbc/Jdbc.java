package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Jdbc {
	private Connection conn = null;
	public Jdbc(){
		try {
			String name="com.mysql.cj.jdbc.Driver";
			Class.forName(name);
			System.out.println("���������ɹ���");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public boolean DBconnect() throws SQLException{
		String url = "jdbc:mysql:" // ���ݿ�����
				+ "//localhost:3306/user?" // �˿ں�+���ݿ�
				+ "useUnicode=true&characterEncoding=utf-8" 
				+ "&serverTimezone=GMT%2B8&useSSL=false"; // ������ʱ��
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "123456");
		try {
			conn = DriverManager.getConnection(url,info);
			if (conn != null) {
				System.out.println("�������ݿ�ɹ���");
				return true;
			}
			else {
				System.out.println("�������ݿ�ʧ�ܣ�");
				}
			} 
		catch (SQLException e) {
				e.printStackTrace();
		}
		return false;
	}	
	public boolean add(String phone,String name,String password) throws SQLException{
		if (conn != null) {
			String sql="insert into user(Phone,Name,password) values(?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, name);
			pstmt.setString(3, password);
			int n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("��ӳɹ�");
			}
		}
		return false;
	}
}

