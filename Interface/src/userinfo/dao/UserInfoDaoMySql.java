package userinfo.dao;

import domain.userinfo.UserInfo;

public class UserInfoDaoMySql implements IUserInfoDao{
	
//	public void insertUserMysql(UserInfo userInfo){
//		System.out.println("insert Userinfo into mysql userId ="+userInfo.getUserId());
//	}
//	
//	public void deleteUserMysql(UserInfo userInfo){
//		System.out.println("delete Userinfo into mysql userId ="+userInfo.getUserId());
//	}
//	
//	public void updateUserMysql(UserInfo userInfo){
//		System.out.println("update Userinfo into mysql userId ="+userInfo.getUserId());
//	}

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("insert Userinfo into mysql userId ="+userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("delete Userinfo into mysql userId ="+userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("update Userinfo into mysql userId ="+userInfo.getUserId());
		
	}

}
