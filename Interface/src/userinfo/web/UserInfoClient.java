package userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import userinfo.dao.IUserInfoDao;
import userinfo.dao.UserInfoDaoMySql;
import userinfo.dao.UserInfoDaoOracle;
import domain.userinfo.UserInfo;

public class UserInfoClient {
	
	public static final int ORACLE_DB = 101;
	public static final int MYSQL_DB = 102;
	
	
	
	public static void main(String[] args) throws IOException {
		//int DBType = 101;
		UserInfo userInfo = new UserInfo(12345,"James","New York");
		//UserInfoDaoOracle oracleDao = new UserInfoDaoOracle();
		//oracleDao.
		FileInputStream fis = new FileInputStream("db.properties");
		IUserInfoDao dao = new UserInfoDaoOracle(); 
		Properties prop = new Properties(); 
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		if(dbType.equals("ORACLE"))
			dao = new UserInfoDaoOracle();
		else if(dbType.equals("MySQL"))
			dao = new UserInfoDaoMySql();
		
		//db가 추가 되면 db class만 추가해주면 된다.
		//동일한 API를 호출하고 -> 다른 
		dao.insertUserInfo(userInfo);
		dao.deleteUserInfo(userInfo);
		dao.updateUserInfo(userInfo);
		
		
	}	
	
}
