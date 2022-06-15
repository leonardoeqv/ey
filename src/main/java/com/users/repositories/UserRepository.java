package com.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.users.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    
//    public UserEntity findByname(String nombre);
//    
    public UserEntity findByemail(String email);
    
}
