package com.csit321g4.gumagay.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.csit321g4.gumagay.Entity.UserEntity;
import com.csit321g4.gumagay.Service.UserService;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = ("http://localhost:3000"))
public class UserController {
	
	@Autowired
	UserService userv;
	
	@GetMapping("/print")
	public String itWorks() {
		return "It works";
	}
	
	//Create
	@PostMapping("/insertUser")
	public UserEntity insertUser(@RequestBody UserEntity user) {
		return userv.insertUser(user);
	}

	
	//Read
	@GetMapping("/getAllUsers")
	public List<UserEntity> getAllUsers() {
		return userv.getAllUsers();
	}
	
	//U - Update a user record
	@PutMapping("/updateUser")
	public UserEntity updateUser(@RequestParam int sid, @RequestBody UserEntity newUserDetails) {
		return userv.updateUser(sid, newUserDetails);
	}
				
	//D - Delete a user record
	@DeleteMapping("/deleteUser/{sid}")
	public String deleteUser(@PathVariable int sid) {
		return userv.deleteUser(sid);
	
	}

	// Get user by username
    @GetMapping("/getByUsername")
    public UserEntity getUserByUsername(@RequestParam String username) {
        return userv.getUserByUsername(username);
    }
}
