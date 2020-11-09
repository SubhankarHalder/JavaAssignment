package com.company;

import java.util.ArrayList;

public class Message {
    ArrayList<String > cell_message = new ArrayList<>();

    public void getMessage() {
        if (cell_message.isEmpty()){
            System.out.println("No messages sent");
        }
        else {
            for (String msg: cellmessage){
                System.out.println(msg);
            }
        }
    }

    public void setMessage(String quote) {
        cell_message.add(quote);
        System.out.println("Message sent");
    }
}
