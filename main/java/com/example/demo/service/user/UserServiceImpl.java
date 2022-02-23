package com.example.demo.service.user;

import com.example.demo.dao.UserDAO;
import com.example.demo.entities.User;
import com.example.demo.service.GeneralCRUDService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class UserServiceImpl implements GeneralCRUDService<User>, UserService {
    private final UserDAO userDAO;

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public Optional<User> getTicketById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User findByPerson(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public String getDateByUserId(Long id) {
        return null;
    }

    @Override
    public Long findUserByUserId(Long id) {
        return null;
    }

    @Override
    public User findUserByTodayDate() {
        return null;
    }

    @Override
    public void deleteByPerson(String firstName, String lastName) {

    }
}

