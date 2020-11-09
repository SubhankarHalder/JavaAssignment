package com.company;

public class Person {
    Contact address = new Contact();
    Message convo = new Message();
    String person_name;

    public Person (String given_name){
        this.person_name = given_name;
    }

}
