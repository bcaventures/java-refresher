package com.training.collections_sort;

import java.util.ArrayList;
import java.util.Collections;

public class UserSorter {

	public static void main(String [] args)
	{
		ArrayList<User> user = new ArrayList<User>();
		
		user.add(new User(3, "bngwa", "Bridget"));
		user.add(new User(1, "bchengwa", "Beltus"));
		user.add(new User(5, "protusw", "Protus"));
		user.add(new User(4, "brianaa", "Briana"));
		user.add(new User(2, "brinaa", "Brina Ambe"));

		for (User usr : user)
		{
			System.out.println(usr.getUserID() + "." + usr.getUserAlias());
		}
		
		//Collections.sort(user);
		//Collections.sort(user,  new UserComparator());
		Collections.sort(user, (usr1, usr2) -> {int id = usr1.getUserID() - usr2.getUserID();
												int name = usr1.getUserAlias().compareTo(usr2.getUserAlias());
												return (id == name)? id : name;
												});
		
		for (User usr : user)
		{
			System.out.println(usr.getUserID() + "." + usr.getUserAlias());
		}
		
	}
}
