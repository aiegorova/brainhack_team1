package com.dreamteam.metro_chat.controllers;

import com.dreamteam.metro_chat.models.ChatMessage;
import com.dreamteam.metro_chat.models.ChatMessageResponse;
import com.dreamteam.metro_chat.models.SubwayLine;
import com.dreamteam.metro_chat.service.ChatMessageService;
import com.dreamteam.metro_chat.service.SubwayLinesService;
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

    @GetMapping("/chat")
    ResponseEntity<ChatMessageResponse> sendMessage(@RequestBody ChatMessage chatMessage) {
        ChatMessage createdMessage = chatMessageService.createChatMessage(chatMessage);
        return new ResponseEntity<>(new ChatMessageResponse(chatMessage), HttpStatus.OK);
    }

    @GetMapping("subwaylines")
    ResponseEntity getSubwayLines() {

        List<SubwayLine> lines = subwayLinesService.getSubwayLines();
        return new ResponseEntity(lines, HttpStatus.OK);

    }

}
