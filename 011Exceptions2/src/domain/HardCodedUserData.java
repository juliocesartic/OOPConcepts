package domain;

import java.util.ArrayList;
import java.util.List;

import errors.UserDataAccessException;

public class HardCodedUserData implements UserData {
	
	private List<User> users;
	
	
	public HardCodedUserData() {
		this.users = new ArrayList<User>();
		
		User u = new User();
		u.setId(1);
		u.setName("Julio");
		u.setEmail("juliodev@email.com");
		u.setAge(26);
		this.users.add(u);
		
		u = new User();
		u.setId(2);
		u.setName("Antonio");
		u.setEmail("anthony@email.com");
		u.setAge(30);
		this.users.add(u);
		
		u = new User();
		u.setId(3);
		u.setName("Luis");
		u.setEmail("luigi@email.com");
		u.setAge(22);
		this.users.add(u);
		
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return this.users;
	}

	@Override
	public User findUser(int id) {
		for(User us: this.users) {
			if(id == us.getId()) {
				return us;
			}
		}
		return null;
	}

	@Override
	public boolean editUser(User u) {
		for(User us: this.users) {
			if(u.getId()== us.getId()) {
				us.setName(u.getName());
				us.setEmail(u.getEmail());
				us.setAge(u.getAge());
				return true;
			}
		}
		return false;
	}

	@Override
	public int countUsers() {
		return this.users.size();
	}

	@Override
	public boolean insertUser(User user) throws UserDataAccessException {
		
		int id = user.getId();
		boolean found = false;
		for(User u: this.users) {
			if(u.getId() == id) {
				found = true;
				break;
			}
		}
		if(found) {
			throw new UserDataAccessException("The ID is found in the database");
		}
		else {
			User newUser = new User();
			newUser.setId(user.getId());
			newUser.setName(user.getName());
			newUser.setEmail(user.getEmail());
			newUser.setAge(user.getAge());
			this.users.add(newUser);
		}
		return true;
	}

}
