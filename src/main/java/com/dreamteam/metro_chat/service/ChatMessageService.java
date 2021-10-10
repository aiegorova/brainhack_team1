package com.dreamteam.metro_chat.service;

import com.dreamteam.metro_chat.models.ChatMessage;
import com.dreamteam.metro_chat.models.ChatMessageDto;
import com.dreamteam.metro_chat.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChatMessageService {

    private Integer lastId = 0;

    @Autowired
    private final ChatMessageRepository chatMessageRepository;

    public ChatMessageService(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    public ChatMessage createChatMessage(ChatMessage chatMessage) {
        chatMessage.setCreatedat(LocalDateTime.now());
        return chatMessageRepository.save(chatMessage);
    }

    public List<ChatMessageDto> getChatMessages(Integer line_id) {
        List<ChatMessage> messages = chatMessageRepository.findByLineIdAndIdGreaterThan(line_id, lastId);
        if (messages.size() > 0) {
            lastId = messages.get(messages.size() - 1).getId();
        }

        List<ChatMessageDto> list = new ArrayList<>();
        for (ChatMessage message : messages) {
            list.add(new ChatMessageDto(message));
        }
        return list;
    }
}
