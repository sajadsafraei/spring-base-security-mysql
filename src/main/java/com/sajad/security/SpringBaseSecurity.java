package com.sajad.security;

import com.sajad.security.domain.User;
import com.sajad.security.domain.security.Role;
import com.sajad.security.domain.security.UserRole;
import com.sajad.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringBaseSecurity implements CommandLineRunner {


    @Autowired
    private UserService userService;


    public static void main(String[] args) {
        SpringApplication.run(SpringBaseSecurity.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {


        User user1 = new User();
        user1.setFirstName("sajad");
        user1.setLastName("sa");
        user1.setUsername("sajad");
        user1.setPassword("p");
        user1.setEmail("s@gmail.com");
        Set<UserRole> userRoles = new HashSet<>();
        Role role1 = new Role();
        role1.setRoleId(1);
        role1.setName("ROLE_USER");
        userRoles.add(new UserRole(user1, role1));

        userService.createUser(user1, userRoles);

        userRoles.clear();

        User user2 = new User();
        user2.setFirstName("Admin");
        user2.setLastName("Admin");
        user2.setUsername("admin");
        user2.setPassword(("p"));
        user2.setEmail("Admin@gmail.com");
        Role role2 = new Role();
        role2.setRoleId(0);
        role2.setName("ROLE_ADMIN");
        userRoles.add(new UserRole(user2, role2));


    }
}
