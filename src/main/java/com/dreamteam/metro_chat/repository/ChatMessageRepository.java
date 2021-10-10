package com.dreamteam.metro_chat.repository;

import com.dreamteam.metro_chat.models.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Integer> {

    List<ChatMessage> findByLineIdAndIdGreaterThan(Integer lineId, Integer id);

}
