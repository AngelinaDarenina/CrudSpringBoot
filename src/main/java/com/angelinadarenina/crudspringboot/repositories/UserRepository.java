package com.angelinadarenina.crudspringboot.repositories;

import com.angelinadarenina.crudspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
