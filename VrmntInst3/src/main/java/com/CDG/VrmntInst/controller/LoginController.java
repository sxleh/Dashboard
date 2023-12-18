package com.CDG.VrmntInst.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CDG.VrmntInst.entity.User;
import com.CDG.VrmntInst.repository.UserRepository;
import com.CDG.VrmntInst.service.UserService;

@RestController
@RequestMapping("/api")
public class LoginController {
  
  @Autowired
  private UserRepository userRepository;
  
  @Autowired
  private UserService userService;

  @PostMapping("/login")
  public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
    Optional<User> user = userService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
    if (user.isPresent()) {
      return ResponseEntity.ok().build();
    } else {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
  }

  public static class LoginRequest {
    private String username;
    private String password;
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    
  }
}
