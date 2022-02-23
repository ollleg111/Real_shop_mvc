package com.example.demo.service.message;

import com.example.demo.entities.Message;
import com.example.demo.entities.User;

import java.util.List;

public interface MessageService {
    Message findByUser(String firstName, String lastName);
    List<Message> getAllMessages();
    String getDateByMessageId(Long id);
    Long findMessageByUserId(Long id);
    User findMessageByDate();
    void deleteByPerson(String firstName, String lastName);
}

