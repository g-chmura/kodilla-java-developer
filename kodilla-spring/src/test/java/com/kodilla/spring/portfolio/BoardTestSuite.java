package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {

    @Test
    public void testBoard() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        board.boardContent();
    }

    @Test
    public void testContext() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    public void testTaskAdd() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        TaskList taskList = (TaskList) context.getBean("toDoList");
        taskList.getTasks().add("To-do task1");

        int result = taskList.getTasks().size();

        Assert.assertEquals(2, result);
    }
}