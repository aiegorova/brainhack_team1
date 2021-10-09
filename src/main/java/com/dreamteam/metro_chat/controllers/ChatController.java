package com.dreamteam.metro_chat.controllers;

import com.dreamteam.metro_chat.models.ChatMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @PostMapping
    @ResponseStatus
    ResponseEntity sendMessage(@RequestBody ChatMessage chatMessage) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
