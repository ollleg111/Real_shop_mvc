package com.example.demo.service.message;

import com.example.demo.entities.Message;
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
public class MessageServiceImpl implements GeneralCRUDService<Message>, MessageService {

    @Override
    public Message create(Message message) {
        return null;
    }

    @Override
    public Optional<Message> getTicketById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Message update(Message message) {
        return null;
    }

    @Override
    public Message findByUser(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<Message> getAllMessages() {
        return null;
    }

    @Override
    public String getDateByMessageId(Long id) {
        return null;
    }

    @Override
    public Long findMessageByUserId(Long id) {
        return null;
    }

    @Override
    public User findMessageByDate() {
        return null;
    }

    @Override
    public void deleteByPerson(String firstName, String lastName) {

    }
}
