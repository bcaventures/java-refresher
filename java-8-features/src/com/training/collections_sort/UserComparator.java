package com.training.collections_sort;

import java.util.Comparator;

public class UserComparator implements Comparator<User>{
	
	@Override
	public int compare(User user1, User user2)
	{
		int iDComp = user1.getUserID() - (user2.getUserID());
		int nameComp = user1.getUserName().compareTo(user2.getUserName());
		
		return ((iDComp == 0)? iDComp : nameComp);
	}

}
