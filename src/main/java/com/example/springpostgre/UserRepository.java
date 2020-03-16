package com.example.springpostgre;

import com.example.springpostgre.models.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
// creates user repository
public interface UserRepository extends JpaRepository<User, Integer> {


  // method which finds by user name
  Optional<User> findByUserName(String userName);

}