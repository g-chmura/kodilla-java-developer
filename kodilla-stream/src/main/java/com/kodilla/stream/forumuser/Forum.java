package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser(00001, "Max", Sex.M,
                1997,01,01,01 ));

        theUsersList.add(new ForumUser(00002, "John", Sex.M,
                1981,12,11,10 ));

        theUsersList.add(new ForumUser(00003, "Mark", Sex.M,
                2005,01,01,0 ));

        theUsersList.add(new ForumUser(00004, "Sarah", Sex.F,
                1997,01,01,5 ));

        theUsersList.add(new ForumUser(00005, "Karen", Sex.F,
                2002,01,01,2 ));
    }
    public List<ForumUser> getTheUsersList () {
        return new ArrayList<>(theUsersList);
    }
}