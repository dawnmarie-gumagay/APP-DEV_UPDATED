	package com.csit321g4.gumagay.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g4.gumagay.Entity.UserEntity;
import com.csit321g4.gumagay.Repository.UserRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {

	@Autowired
	UserRepository urepo;
	
	//Create or insert user record in tblUsers
	public UserEntity insertUser(UserEntity user) {
		return urepo.save(user);
	}
	
	//Read all records in tblUsers
	public List<UserEntity> getAllUsers() {
		return urepo.findAll();
	}
	
	//U - update a user
	@SuppressWarnings("finally")
	public UserEntity updateUser(int sid, UserEntity newUserDetails) {
		UserEntity user = new UserEntity();
		try {
			//search the id number of the handset that will be updated
			user = urepo.findById(sid).get();
					
			//update the record
			user.setUsername(newUserDetails.getUsername());
			user.setEmail(newUserDetails.getEmail());
			user.setPassword(newUserDetails.getPassword());						
					
		} catch(NoSuchElementException ex) {
			throw new NoSuchElementException("User " + sid + " does not exist!");
			
		} finally {
			return urepo.save(user);
			
		}
	}
	
	//D - delete a user
	public String deleteUser(int sid) {
		UserEntity user = urepo.findById(sid)
			.orElseThrow(() -> new NoSuchElementException("User " + sid + "does not exist"));

		if(user.getisDeleted()) {
			return "User #" + sid + " is already deleted!";
			
		}else {
			user.setisDeleted(true);
			urepo.save(user);
			return "User #" + sid + "has been deleted";	
			
		}
	}
}