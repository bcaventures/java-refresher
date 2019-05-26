/*
	Name		: Beltus Ambe
	Date		: 04/26/2019
	Description :	 This program is a Maven project that reads data from a delimited file and creates a JSON output of the data.
					The data is read into an object representing the file, then loaded into an ArrayList. The list is then passed
					into an ObjectMapper in order to get the JSON value.
 */


package com.javatraining.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<User> user = new ArrayList<User>();

		try(Scanner fileScanner = new Scanner(new BufferedReader(new FileReader("C:/Software/Java/FileData/UserFile.txt"))))
		{
			fileScanner.useDelimiter("\\|");
			while (fileScanner.hasNextLine())
			{
				int id = fileScanner.nextInt();
				fileScanner.skip(fileScanner.delimiter());
				int age = fileScanner.nextInt();
				fileScanner.skip(fileScanner.delimiter());
				String name = fileScanner.nextLine();
				
				user.add(new User(id, age, name));
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		Collections.sort(user);		// This will use the compareTo method that was overridden in User class which is implementing Comparable interface
		try {
			ObjectMapper userMapper = new ObjectMapper();

			/*This method requires getters to be set other wise an exception will occur
			(com.fasterxml.jackson.databind.exc.InvalidDefinitionException: No serializer found for class)*/
			String jsonValue = userMapper.writeValueAsString(user);	
			System.out.println("jsonValue is " + jsonValue);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
