package com.kodilla.spring.portfolio;


public final class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void boardContent() {
        System.out.println("The board contains: " + toDoList.getTasks() + inProgressList.getTasks() + doneList.getTasks());
    }
}