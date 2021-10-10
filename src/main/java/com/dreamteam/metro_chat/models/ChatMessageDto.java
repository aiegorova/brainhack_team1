package com.dreamteam.metro_chat.models;

import java.time.LocalDateTime;

public class ChatMessageDto {

    private Integer id;
    private Integer lineId;
    private Integer sender_id;
    private String message;
    private LocalDateTime createdat;
    private String userName;

    public ChatMessageDto(ChatMessage chatMessage) {
        this.id = chatMessage.getId();
        this.lineId = chatMessage.getLineId();
        this.sender_id = chatMessage.getSender_id();
        this.message = chatMessage.getMessage();
        this.createdat = chatMessage.getCreatedat();

        if (sender_id == 1) {
            userName = "Violeta";
        } else {
            userName = "Arkady";
        }
    }

    public Integer getId() {
        return id;
    }

    public Integer getLineId() {
        return lineId;
    }

    public Integer getSender_id() {
        return sender_id;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public void setSender_id(Integer sender_id) {
        this.sender_id = sender_id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
