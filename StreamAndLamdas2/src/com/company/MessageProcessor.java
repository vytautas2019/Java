package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class MessageProcessor {

    protected Predicate<Message> acceptableMessage;
    protected List<Message> messages = new ArrayList<>();

    public MessageProcessor(Predicate<Message> acceptableMessage) {
        this.acceptableMessage = acceptableMessage;
    }

    public boolean anyMessagesToSend() {
        return !messages.isEmpty();
    }

    abstract void handle(Message message);
    abstract boolean canHandle(Message message);
    abstract void sendMessages();

}
