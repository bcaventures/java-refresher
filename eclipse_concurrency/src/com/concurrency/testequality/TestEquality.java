package com.concurrency.testequality;

public class TestEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User(1, "Beltus Ambe");
		//User user2 = new User(1, "Beltus Ambe");
		User user2 = user1;
		
		if (user1.equals(user2))
		{
			System.out.println("They are equal. user1 = " + user1.hashCode() +  " user2 = " + user2.hashCode());
		}
		else
		{
			System.out.println("They are not equal. user1 = " + user1.hashCode() +  " user2 = " + user2.hashCode());
		}
	}
	
	

}
