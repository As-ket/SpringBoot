package com.maxkargin.spring.springboot.service;

import com.maxkargin.spring.springboot.models.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
