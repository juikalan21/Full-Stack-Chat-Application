package com.chat.app.model;

public class ChatMessage {
    private String id;
    private String sender;
    private String content;

    public ChatMessage() {}

    public ChatMessage(String id, String sender, String content) {
        this.id = id;
        this.sender = sender;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
