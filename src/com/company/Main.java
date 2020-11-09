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

    public static void main(String[] args) {
        Person new_person = new Person("Bob");
        System.out.println("Hello " + new_person.person_name);
        Scanner console = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            menu();
            choice = console.nextInt();
            switch (choice){
                case 1:
                    contactMenu();
                    int contact_choice = console.nextInt();
                        switch (contact_choice) {
                            case 1:
                                new_person.getContactList();
                                break;
                            case 2:
                                System.out.println("Case 2");
                                break;
                            case 3:
                                System.out.println("Case 3");
                                break;
                            case 4:
                                System.out.println("Case 4");
                                break;
                            default:
                                break;
                        }
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    break;

            }

        }
    }
}
