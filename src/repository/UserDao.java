package repository;

import java.util.ArrayList;
import java.util.List;

import model.User;
//this is th class which connects or communicates with the database.
public class UserDao implements Repository<User>{
	private List<User> database= new ArrayList<>();
	
	public UserDao() {
		init();
	}
	private void init() {
		database.add(new User("admin","admin"));
		database.add(new User("surya","surya"));
		database.add(new User("stuti","123"));
		database.add(new User("rubal","rubal"));
		
	}
	@Override
	public void save(User user) {
		database.add(user);
		
	}

	@Override
	public void delete(User user) {
		database.remove(user);
	}

	@Override
	public void update(User t) {
		
	}

	@Override
	public List<User> getAll() {
		return database;
	}

}
