package model.service;

import java.sql.Connection;

import model.beans.HelperBean;
import model.beansdao.HelperDao;
import model.database.DriverLoading;

public class HelperService {

	public HelperBean login(){
		Connection conn = new DriverLoading().getConnection();
		
		HelperDao helperDao = new HelperDao();
		HelperBean helperBean = helperDao.selectHelper(conn);
		
		return helperBean;
	}
}
