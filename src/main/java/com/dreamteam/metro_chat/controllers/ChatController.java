package com.dreamteam.metro_chat.controllers;

import com.dreamteam.metro_chat.models.ChatMessage;
import com.dreamteam.metro_chat.models.SubwayLine;
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

    @PostMapping
    @ResponseStatus
    ResponseEntity sendMessage(@RequestBody ChatMessage chatMessage) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("subwaylines")
    ResponseEntity getSubwayLines() {

        List<SubwayLine> lines = subwayLinesService.getSubwayLines();
        return new ResponseEntity(lines, HttpStatus.OK);

    }

}
