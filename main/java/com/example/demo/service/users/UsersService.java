package com.example.demo.service.users;

import com.example.demo.entities.User;

import java.util.List;

public interface UsersService {
	User findByPerson(String firstName, String lastName);
	List<User> getAllUsers();
	String getDateByUserId(Long id);
	Long findUserByUserId(Long id);
	User findUserByTodayDate();
	void deleteByPerson(String firstName, String lastName);
}
