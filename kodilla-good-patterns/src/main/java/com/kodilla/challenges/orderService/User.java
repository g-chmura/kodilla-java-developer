package com.kodilla.challenges.orderService;

public class User {
    private String name;
    private String Surname;

    User(final String name,
         final String surname) {
        this.name = name;
        Surname = surname;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return Surname;
    }

}