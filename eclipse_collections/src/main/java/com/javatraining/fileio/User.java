package com.javatraining.fileio;

public class User implements Comparable<User>{
	private Integer userID;
	private Integer userAge;
	private String userName;
	
	public User(int userID, int userAge, String userName)
	{
		this.userID = userID;
		this.userAge = userAge;
		this.userName = userName;
	}
	
	public int compareTo(User user)
	{
		return this.userAge - user.userAge;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
