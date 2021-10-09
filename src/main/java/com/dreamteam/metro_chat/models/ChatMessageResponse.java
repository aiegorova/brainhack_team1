package com.dreamteam.metro_chat.models;

public class ChatMessageResponse {

    private String message_id;

    public ChatMessageResponse(ChatMessage chatMessage) {
        this.message_id = chatMessage.getId().toString();
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }
}
