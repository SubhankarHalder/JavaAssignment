package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contact {
    Map<String, String> numbers = new HashMap<>();

    public Contact() {
    }

    public void listContacts() {
        if (this.numbers.isEmpty()) {
            System.out.println("Contact List is empty.");
        }
        else {
            for (Map.Entry<String, String> entry : numbers.entrySet())
                System.out.println("Name: " + entry.getKey() + " " + "Phone: " + entry.getValue());
        }
    }

    public void setContacts(String name, String phone) {
        this.numbers.put(name, phone);
        System.out.println("Contact Added");
    }
    public void searchContact(String name) {
        if (this.numbers.containsKey(name)) {
            System.out.println("Phone Number of " + name + " is " + this.numbers.get(name));
        }
        else {
            System.out.println(name + "'s contact does not exist");
        }
    }
    public void deleteContact(String name){
        if (this.numbers.containsKey(name)) {
            this.numbers.remove(name);
            System.out.println("Contact removed");
        }
        else {
            System.out.println(name + "'s contact does not exist");
        }
    }

}
