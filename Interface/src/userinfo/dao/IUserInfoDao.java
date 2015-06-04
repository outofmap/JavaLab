package userinfo.dao;

import domain.userinfo.UserInfo;
//interface는 class가 해야하는 일을 정의한다.
public interface IUserInfoDao {
	
	public void insertUserInfo(UserInfo userInfo);
	public void deleteUserInfo(UserInfo userInfo);
	public void updateUserInfo(UserInfo userInfo);
	

}
