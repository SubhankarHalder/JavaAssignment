package com.company;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("Main Menu");
        System.out.println("\t 1. Manage Contacts");
        System.out.println("\t 2. Messages");
        System.out.println("\t 3. Quit");
    }
    public static void contactMenu() {
        System.out.println("\t 1. Show all contacts");
        System.out.println("\t 2. Add a new contact");
        System.out.println("\t 3. Search for a new contact");
        System.out.println("\t 4. Delete a contact");
        System.out.println("\t 5. Go back to the previous menu");
    }

    public static void messageMenu() {
        System.out.println("\t 1. List of all messages");
        System.out.println("\t 2. Send a message");
        System.out.println("\t 3. Go back to previous menu");
    }

    public static void main(String[] args) {
        Person new_person = new Person("Bob");
        System.out.println("Hello " + new_person.person_name);
        Scanner console = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            menu();
            choice = console.nextInt();
            switch (choice) {
                case 1:
                    int contact_choice = 0;
                    while (contact_choice != 5) {
                        contactMenu();
                        contact_choice = console.nextInt();
                        switch (contact_choice) {
                            case 1:
                                new_person.address.listContacts();
                                break;
                            case 2:
                                System.out.println("Enter Name:");
                                String first_name = console.next();
                                System.out.println("Enter Phone No:");
                                String first_number = console.next();
                                new_person.address.setContacts(first_name, first_number);
                                break;
                            case 3:
                                System.out.println("Enter name of the person: ");
                                String second_name = console.next();
                                new_person.address.searchContact(second_name);
                                break;
                            case 4:
                                System.out.println("Enter name of the person");
                                String third_name = console.next();
                                new_person.address.deleteContact(third_name);
                                break;
                            default:
                                break;
                        }
                    }
                        break;
                        case 2:
                            int message_choice = 0;
                            while (message_choice != 3) {
                                messageMenu();
                                message_choice = console.nextInt();
                                switch (message_choice) {
                                    case 1:
                                        new_person.convo.getMessage();
                                        break;
                                    case 2:
                                        System.out.println("Enter message to be sent");
                                        String conversation = console.next();
                                        new_person.convo.setMessage(conversation);
                                        break;
                                    default:
                                        break;
                                }
                                }
                            break;
                        default:
                            break;

                    }


        }
    }
}
