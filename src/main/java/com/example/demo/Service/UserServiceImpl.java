package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepo;
	

	@Override
	public List<User> getAllUsers() {
		
		List<User> userList = userRepo.findAll();
		
		if(userList !=null && userList.size()>0)
		{
			return userList;
		}
		
		return null;
	}

	@Override
	public User addUser(User user) 
	{
		if(user!=null)
		{
			return userRepo.saveAndFlush(user);
			
		}
		return null;
		
		
		
	}

	@Override
	public boolean validateUser(String username, String password)
	{
		User user = userRepo.validateUser(username, password);
		if(user!=null)
		{
			return true;
		}
		return false;


	}

}









