package main;
import java.util.List;

import domain.HardCodedUserData;
import domain.User;
import domain.UserData;
import errors.UserDataAccessException;
import service.ServiceLayer;

public class Main {
	
	public static void main(String [] args) {
		
		ServiceLayer sl = new ServiceLayer();
		
		User newUser = new User();
		newUser.setId(4);
		newUser.setName("Nicolas");
		newUser.setEmail("nicolas@email.com");
		newUser.setAge(20);
		
		try {
			boolean correct = sl.insertUser(newUser);
			if(correct) {
				System.out.println("the user was successfully inserted");
			}
			
		}
		catch(UserDataAccessException ex) {
			System.out.println("the user was not successfully inserted: " + ex.getMessage());
		}
		
		System.out.println("************Showing all the users**************");
		
		List<User> users = sl.getAllUsers();
		for(User u: users) {
			System.out.println("*******************************");
			u.showUser();
		}
		
	}
	
}
