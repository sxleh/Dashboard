package com.CDG.VrmntInst.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CDG.VrmntInst.entity.User;
import com.CDG.VrmntInst.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public Optional<User> authenticate(String username, String password) {
    Optional<User> user = userRepository.findByUsername(username);
    if (user.isPresent() && user.get().getPassword().equals(password)) {
      return user;
    } else {
      return Optional.empty();
    }
  }
}
