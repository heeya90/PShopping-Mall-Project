package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
public class DriverLoading extends HttpServlet {

	/*public DriverLoading(){
		
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε��Ϸ�");
			
		} catch (Exception e) {
			System.out.println("DriverLoading ������ ���� " +
					"Class.forName ���� ");
		}
	}*/
	
	public Connection getConnection(){
		String url = "jdbc:Oracle:thin:@58.233.27.123:1521/orcl";
		String userid = "smp";
		String userpw = "test";
		Connection con=null;
		try {
			con = DriverManager.getConnection(url, userid, userpw);
			System.out.println("���ؼ� ���� �Ϸ�");
		} catch (Exception e) {
			System.out.println("DriverLoading getConnection() error");
		}
		return con;
		
	}

}
