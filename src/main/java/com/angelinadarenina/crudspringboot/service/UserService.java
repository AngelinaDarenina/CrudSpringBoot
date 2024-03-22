package com.angelinadarenina.crudspringboot.service;

import com.angelinadarenina.crudspringboot.model.User;


import java.util.List;

public interface UserService {
    List<User> listUsers();

    User getUserByID(long id);

    void save(User user);

    void update(long id, User updatedUser);

    void delete(long id);
}
