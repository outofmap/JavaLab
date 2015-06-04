package domain.userinfo;

public class UserInfo {
	//property를 정해주는 역할만 하는 class!
	//
	private int userId;
	private String userName;
	private String address;
	
	public UserInfo(int userId,String userName,String address){
		this.userId = userId;
		this.userName = userName;
		this.address = address;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
