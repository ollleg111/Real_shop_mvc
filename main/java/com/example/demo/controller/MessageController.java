package com.example.demo.controller;

import com.example.demo.service.message.MessageService;
import com.example.demo.service.user.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping(value = "/messages")
public class MessageController {
    private final MessageService messageService;

}
