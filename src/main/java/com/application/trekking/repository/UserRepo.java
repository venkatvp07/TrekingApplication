package com.application.trekking.repository;

import com.application.trekking.model.SignUp;
import com.application.trekking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u WHERE u.userId = :id")
    Optional<User> getByUserId(@Param("id") Long id);
}
