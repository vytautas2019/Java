package com.company;

public enum MessageType {

    TEXT_MESSAGE,
    ENCRYPTED_TEXT_MESSAGE,
    WARNING_MESSAGE,
    ALARM_MESSAGE;

    public static MessageType getRandom(int n){
        int index =n%MessageType.values().length;
        return  MessageType.values()[index];
    }

}
