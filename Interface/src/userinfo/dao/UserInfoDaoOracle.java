package userinfo.dao;

import domain.userinfo.UserInfo;

public class UserInfoDaoOracle implements IUserInfoDao{
	
//	public void insertUserInfoOracle(UserInfo userInfo){
//		System.out.println("insert Userinfo into oracle userId ="+userInfo.getUserId());
//	}
//	
//	public void deleteUserInfoOracle(UserInfo userInfo){
//		System.out.println("delete Userinfo into oracle userId ="+userInfo.getUserId());
//	}
//	
//	public void updateUserInfoOracle(UserInfo userInfo){
//		System.out.println("update Userinfo into oracle userId ="+userInfo.getUserId());
//	}

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert Userinfo into oracle userId ="+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete Userinfo into oracle userId ="+userInfo.getUserId());		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update Userinfo into oracle userId ="+userInfo.getUserId());
		
	}

}
