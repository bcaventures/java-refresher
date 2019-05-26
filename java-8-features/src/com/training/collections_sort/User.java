package com.training.collections_sort;

public class User implements Comparable<User>{
	private Integer userID;
	private String userAlias;
	private String userName;
	
	public User(Integer userID, String userAlias, String userName)
	{
		this.userID = userID;
		this.userAlias = userAlias;
		this.userName = userName;
	}

	@Override
	public int compareTo(User user2)
	{
		return (this.userID.compareTo(user2.userID));
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserAlias() {
		return userAlias;
	}

	public void setUserAlias(String userAlias) {
		this.userAlias = userAlias;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
