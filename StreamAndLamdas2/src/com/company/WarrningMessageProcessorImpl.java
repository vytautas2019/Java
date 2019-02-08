package com.company;

import java.util.function.Predicate;

public class WarrningMessageProcessorImpl extends MessageProcessor {
    public WarrningMessageProcessorImpl() {
        super(message -> MessageType.WARNING_MESSAGE.equals(message.getType()));
    }

    @Override
    void handle(Message message) {
        if (canHandle(message)){
            messages.add(message);
        }

    }

    @Override
    boolean canHandle(Message message) {
        return acceptableMessage.test(message);
    }

    @Override
    void sendMessages() {
        System.out.println("Sending warrning messages!");
        messages.forEach(System.out::println);
        System.out.println("Sending finished");

    }

    public WarrningMessageProcessorImpl(Predicate<Message> acceptableMessage) {
        super(message -> MessageType.WARNING_MESSAGE.equals(message.getType()));
    }
}


