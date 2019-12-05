package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Bean
    public Board board() {
        return new Board(toDoList,
                         inProgressList,
                         doneList);
    }

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;


    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        List<String> task = new ArrayList<>();
        task.add("To-do task1");
        return new TaskList(task);
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        List<String> task = new ArrayList<>();
        task.add("In progress task1");
        return new TaskList(task);
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        List<String> task = new ArrayList<>();
        task.add("Done task1");
        return new TaskList(task);
    }
}
