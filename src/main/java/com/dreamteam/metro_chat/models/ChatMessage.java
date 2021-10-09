package com.dreamteam.metro_chat.models;

public class ChatMessage {

    private String chat_id;
    private String user_id;
    private String message;

    public String getChat_id() {
        return chat_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getMessage() {
        return message;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
