package com.GADJET.Sprint_3_4.repositories;

import com.GADJET.Sprint_3_4.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
