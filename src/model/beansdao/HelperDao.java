package model.beansdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.beans.HelperBean;

public class HelperDao {
	//insert, delete, update, selecte 메소드
	
	public HelperBean selectHelper(Connection conn){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		HelperBean helper = new HelperBean();
		try{
			pstmt=conn.prepareStatement("SELECT id, pw FROM t_helper");
			rs = pstmt.executeQuery();
			while(rs.next()){
				helper.setId(rs.getString("id"));
				helper.setPw(rs.getString("pw"));
			}
			return helper;
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("selectHelper() 에러");
		}finally{
			try {
				if(null!=rs) rs.close();
				if(null!=pstmt) pstmt.close();
				if(null!=conn) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	public void insertAdmin(){

	}
	public void deleteAdmin(){

	}
	public void updateAdmin(){

	}
}
