package service;

import java.util.List;

import model.User;
import repository.Repository;
import repository.UserDao;

public class UserService {
	private Repository<User> repository;
	
	public UserService() {
		repository =new UserDao();	
	}
	
	public void addNewUser(User user) {
		repository.save(user);
	}
	
	public void removeUser(User user) {
		repository.delete(user);
	}
	
	public List<User> getAllUser(){
		return repository.getAll();
	}
	
	public boolean isUserExist(User user)
	{
		return repository.getAll().contains(user);
	}
}
