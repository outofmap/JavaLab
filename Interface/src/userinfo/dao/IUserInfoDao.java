package userinfo.dao;

import domain.userinfo.UserInfo;
//interface�� class�� �ؾ��ϴ� ���� �����Ѵ�.
public interface IUserInfoDao {
	
	public void insertUserInfo(UserInfo userInfo);
	public void deleteUserInfo(UserInfo userInfo);
	public void updateUserInfo(UserInfo userInfo);
	

}
