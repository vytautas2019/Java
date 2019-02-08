package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Message {

    private long id;
    private String body;
    private LocalDateTime time;
    private MessageType type;
    private List<Recipient> recipients;

    public Message(long id, String body, LocalDateTime time, MessageType tipe, List<Recipient> recipients) {
        this.id = id;
        this.body = body;
        this.time = time;
        this.type = tipe;
        this.recipients = recipients;
    }

    public long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public MessageType getType() {
        return type;
    }

    public List<Recipient> getRecipients() {
        return recipients;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", time=" + time +
                ", tipe=" + type +
                '}';
    }
}