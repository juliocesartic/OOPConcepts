package domain;

import java.util.List;
import errors.UserDataAccessException;

public interface UserData {
	
	public boolean insertUser(User user) throws UserDataAccessException;
	public List<User> getAllUsers();
	public User findUser(int id);
	public boolean editUser(User u);
	public int countUsers();

}
