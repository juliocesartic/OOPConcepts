package main;
import java.util.List;

import domain.HardCodedUserData;
import domain.User;
import domain.UserData;
import errors.UserDataAccessException;

public class Main {
	
	public static void main(String [] args) {
		
		UserData ud = new HardCodedUserData();
		int userCount = ud.countUsers();
		
		System.out.println("The number of users is:" + userCount);
		System.out.println("************Showing all the users**************");
		
		List<User> users = ud.getAllUsers();
		for(User u: users) {
			System.out.println("*******************************");
			u.showUser();
		}
		
		
		System.out.println("************The User with id = 2 is.. **************");
		User u = ud.findUser(2);
		u.showUser();
		
		System.out.println("************ We modify the user with id = 2 **************");
		User modifiedUser = new User();
		modifiedUser.setId(2);
		modifiedUser.setName("Raul");
		modifiedUser.setEmail("raul@email.com");
		modifiedUser.setAge(24);
		
		if(ud.editUser(modifiedUser)) {
			System.out.println("************Showing all the users**************");
			users = ud.getAllUsers();
			for(User us: users ) {
				System.out.println("*******************************");
				us.showUser();
			}
		}
		
		// the user 2 exist
		
		User newUser = new User();
		newUser.setId(4);
		newUser.setName("Nicolas");
		newUser.setEmail("nicolas@email.com");
		newUser.setAge(20);
		
		try {
			boolean correct = ud.insertUser(newUser);
			if(correct) {
				System.out.println("the user was successfully inserted");
			}
			
		}
		catch(UserDataAccessException ex) {
			System.out.println("the user was not successfully inserted: " + ex.getMessage());
		}
	}
	
}
