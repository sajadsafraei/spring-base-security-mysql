package com.sajad.security.service;

import com.sajad.security.domain.User;
import com.sajad.security.domain.security.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);


    User createUser(User user, Set<UserRole> userRoles);

    User saveUser (User user);
//
    List<User> findUserList();

    void enableUser (String username);

    void disableUser (String username);
}
