package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idetifier;
    private final String username;
    private final Sex sex;
    private final LocalDate birthdate;
    private final int numberOfPosts;

    ForumUser(final int idetifier, final String username, final Sex sex, final int yearOfBirth,
              final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.idetifier = idetifier;
        this.username = username;
        this.sex = sex;
        this.birthdate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    int getIdetifier() {
        return idetifier;
    }

    public String getUsername() {
        return username;
    }

    Sex getSex() {
        return sex;
    }

    int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idetifier=" + idetifier +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
