package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        TaskFactory taskFactory = new TaskFactory();

        Task shopping = taskFactory.makeTask(TypeOfTask.SHOPPING,
                "Shopping task",
                "bread",
                "1.5");
        boolean notExecuted = shopping.isTaskExecuted();
        shopping.executeTask();
        System.out.println(shopping);

        Assert.assertEquals("Shopping task", shopping.getTaskName());
        Assert.assertFalse(notExecuted);
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        TaskFactory taskFactory = new TaskFactory();

        Task painting = taskFactory.makeTask(TypeOfTask.PAINTING,
                "Painting Task",
                "white",
                "living room");
        boolean notExecuted = painting.isTaskExecuted();
        painting.executeTask();
        System.out.println(painting);

        Assert.assertEquals("Painting Task", painting.getTaskName());
        Assert.assertFalse(notExecuted);
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        TaskFactory taskFactory = new TaskFactory();

        Task driving = taskFactory.makeTask(TypeOfTask.DRIVING,
                "Driving Task",
                "home",
                "train");
        boolean notExecuted = driving.isTaskExecuted();
        driving.executeTask();
        System.out.println(driving);

        Assert.assertEquals("Driving Task", driving.getTaskName());
        Assert.assertFalse(notExecuted);
        Assert.assertTrue(driving.isTaskExecuted());
    }
}