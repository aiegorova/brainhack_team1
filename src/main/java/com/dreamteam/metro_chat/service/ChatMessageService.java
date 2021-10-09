package com.dreamteam.metro_chat.service;

import com.dreamteam.metro_chat.models.ChatMessage;
import com.dreamteam.metro_chat.models.SubwayLine;
import com.dreamteam.metro_chat.repository.ChatMessageRepository;
import com.dreamteam.metro_chat.repository.SubwayLinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatMessageService {

    @Autowired
    private final ChatMessageRepository chatMessageRepository;

    public ChatMessageService(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    public ChatMessage createChatMessage(ChatMessage chatMessage) {
        chatMessage.setCreatedat(LocalDateTime.now());
        return chatMessageRepository.save(chatMessage);
    }

    public List<ChatMessage> getChatMessage() {
        return chatMessageRepository.findAll();
    }
}
