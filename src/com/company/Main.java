package com.company;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("Main Menu");
        System.out.println("\t 1. Manage Contacts");
        System.out.println("\t 2. Messages");
        System.out.println("\t 3. Quit");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            menu();
            choice = console.nextInt();
        }
    }
}
