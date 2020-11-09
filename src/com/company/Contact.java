package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contact {
    Map<String, Integer> numbers = new HashMap<>();

    public Contact() {
    }

    public void listContacts() {
        if (this.numbers.isEmpty()) {
            System.out.println("Contact List is empty.");
        }
        else {
            for (Map.Entry<String, Integer> entry : numbers.entrySet())
                System.out.println("Name: " + entry.getKey() + " " + "Phone: " + entry.getValue());
        }
    }

    public void setContacts(String name, int phone) {
        this.numbers.put(name, phone);
        System.out.println("Contact Added");
    }
}
