package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.User;

public interface UserService 
{
	public List<User> getAllUsers();
	
	public User addUser(User user);
	public boolean validateUser(String username, String password);

}
