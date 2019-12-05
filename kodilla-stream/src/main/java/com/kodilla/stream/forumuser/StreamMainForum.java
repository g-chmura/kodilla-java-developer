package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMainForum {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMap = forum.getTheUsersList().stream()
                .filter(user -> user.getSex() == Sex.M)
                .filter(user -> Period.between(user.getBirthdate(), LocalDate.now()).getYears()>20)
                .filter(user -> user.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdetifier, user->user));

        resultMap.entrySet().stream()
                .map(entry -> entry.getKey()+ ": "+ entry.getValue())
                .forEach(System.out::println);
    }
}