package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
public class DriverLoading extends HttpServlet {

	/*public DriverLoading(){
		
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩완료");
			
		} catch (Exception e) {
			System.out.println("DriverLoading 생성자 에러 " +
					"Class.forName 에러 ");
		}
	}*/
	
	public Connection getConnection(){
		String url = "jdbc:Oracle:thin:@58.233.27.123:1521/orcl";
		String userid = "smp";
		String userpw = "test";
		Connection con=null;
		try {
			con = DriverManager.getConnection(url, userid, userpw);
			System.out.println("컨넥션 생성 완료");
		} catch (Exception e) {
			System.out.println("DriverLoading getConnection() error");
		}
		return con;
		
	}

}
