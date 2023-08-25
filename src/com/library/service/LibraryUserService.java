package com.library.service;

import com.library.model.User;

public interface LibraryUserService {

    void addUser(User user);

    boolean authenticateUser(String email, String password);

    void deleteUser(int userId);
}
