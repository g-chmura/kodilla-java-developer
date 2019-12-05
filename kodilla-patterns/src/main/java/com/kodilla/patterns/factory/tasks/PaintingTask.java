package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName,
                        String color,
                        String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        isExecuted = false;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

    @Override
    public String toString() {
        return "\nPaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                ", isExecuted=" + isExecuted +
                '}';
    }
}