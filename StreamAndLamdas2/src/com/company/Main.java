package com.company;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Main {


    public static void main(String[] args) {
        ArrayList<MessageProcessor> processors = new ArrayList<>();
        processors.add(new ENCRYPTEDMessageProcessorImpl());
        processors.add(new WarrningMessageProcessorImpl());

        MessageHandler messageHandler =new MessageHandler(processors);
       for (int i=0;i<1;i++){
           List<Message> messages=messages(5);
           messageHandler.handleMessages(messages);
       }

       print(messageHandler.getFailedMessages());


    }
    private static void print(Iterable iterable){
        iterable.forEach(System.out::println);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }


    private static List<Message> messages(int n) {
        List<Message> messages = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            messages
                    .add(new Message(i, i + " " + i * 10,
                            LocalDateTime.now(), MessageType.getRandom(i),
                            emptyList()));
        }
        return messages;
    }

}
