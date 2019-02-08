package com.company;

import java.util.function.Predicate;

public class ENCRYPTEDMessageProcessorImpl extends MessageProcessor {
    public ENCRYPTEDMessageProcessorImpl(Predicate<Message> acceptableMessage) {
        super(message -> MessageType.ENCRYPTED_TEXT_MESSAGE.equals(message.getType()));
    }

    public ENCRYPTEDMessageProcessorImpl() {
        super(message -> MessageType.ENCRYPTED_TEXT_MESSAGE.equals(message.getType()));
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
        System.out.println("Sending Encrypted messages!");
        messages.forEach(System.out::println);
        System.out.println("Sending finished");
    }


}
