package com.amine.microsservice.service;

import com.amine.microsservice.entities.Role;
import com.amine.microsservice.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.persistence.ForeignKey;

import java.util.List;
public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(long id, Role r);
    List<User> findAllUsers();
    User findUserById(Long id);
    List<Role> findAllRoles();
    Role findRoleById(Long id);
    void deleteUser(long id);
    User removeRoleFromUser(long id, Role r);
    List<Role> findUserRolesById(Long id);

    User activateUser(String username, String code);
}

