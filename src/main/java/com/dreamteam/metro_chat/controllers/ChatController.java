package com.dreamteam.metro_chat.controllers;

import com.dreamteam.metro_chat.models.ChatMessage;
import com.dreamteam.metro_chat.models.ChatMessageResponse;
import com.dreamteam.metro_chat.models.SubwayLine;
import com.dreamteam.metro_chat.models.User;
import com.dreamteam.metro_chat.service.ChatMessageService;
import com.dreamteam.metro_chat.service.SubwayLinesService;
import com.dreamteam.metro_chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChatController {

    @Autowired
    private SubwayLinesService subwayLinesService;
    @Autowired
    private ChatMessageService chatMessageService;
    @Autowired
    private UserService userService;


    @PostMapping("/chat")
    @CrossOrigin(origins = "http://localhost:4200")
    ResponseEntity<ChatMessageResponse> sendMessage(@RequestBody ChatMessage chatMessage) {
        ChatMessage createdMessage = chatMessageService.createChatMessage(chatMessage);
        return new ResponseEntity<>(new ChatMessageResponse(chatMessage), HttpStatus.OK);
    }

    @GetMapping("subwaylines")
    @CrossOrigin(origins = "http://localhost:4200")
    ResponseEntity getSubwayLines() {

        List<SubwayLine> lines = subwayLinesService.getSubwayLines();
        return new ResponseEntity<>(lines, HttpStatus.OK);

    }

    @GetMapping("chatmessages")
    @CrossOrigin(origins = "http://localhost:4200")
    ResponseEntity getChatMessages(@RequestParam Integer line_id) {
        List<ChatMessage> history = chatMessageService.getChatMessages(line_id);
        return new ResponseEntity(history, HttpStatus.OK);

    }

    @PostMapping("users")
    @CrossOrigin(origins = "http://localhost:4200")
    ResponseEntity createUser(@RequestBody User user) {
        return new ResponseEntity(userService.getUserRepository(user), HttpStatus.OK);
    }

}
