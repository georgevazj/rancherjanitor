package com.bbva.repository;

import com.bbva.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by jorge on 22/05/17.
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable> {

    public abstract User findByUsername(String username);

}
