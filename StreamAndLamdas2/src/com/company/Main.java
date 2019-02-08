package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("hi");

    }


    private static List<Message> messages(int n) {
        List<Message> messages = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            messages
                    .add(new Message(i, i + " " + i * 10,
                            LocalDateTime.now(), MessageType.TEXT_MESSAGE,
                            emptyList()));
        }
        return messages;
    }

}
