package service;

import java.util.List;

import domain.HardCodedUserData;
import domain.User;
import domain.UserData;
import errors.UserDataAccessException;

public class ServiceLayer {
	private UserData userData;
	
	public ServiceLayer() {
		this.userData = new HardCodedUserData();
	}
	
	public boolean insertUser(User user) throws UserDataAccessException {
		return this.userData.insertUser(user);
		
	}
	
	public List<User> getAllUsers(){
		return this.userData.getAllUsers();
	}
	
	public User findUser(int id) {
		return this.userData.findUser(id);
	}
	
	public boolean editUser(User u) {
		return this.userData.editUser(u);
	}
	
	public int countUsers() {
		return this.userData.countUsers();
	}
}
