package com.dreamteam.metro_chat.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "chatmessages")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="line_id")
    private Integer lineId;
    @Column
    private Integer sender_id;
    @Column
    private String message;
    @Column
    private LocalDateTime createdat;

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
}
