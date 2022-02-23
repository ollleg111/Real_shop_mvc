package com.example.demo.dao;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {

    User findUserById(@Param("id") Long id);

    @Query(value = "SELECT t FROM USERS t")
    List<User> getAllTickets();

    @Query(value = "SELECT t.date FROM USERS t WHERE t.id=:id")
    Object getDateUserId(@Param("id") Long id);

    @Query(
            value = "SELECT * FROM USERS u WHERE u.date(SELECT CURRENT_DATE)",
            nativeQuery = true)
    User findUserByDate();

    User findUserByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);

}

