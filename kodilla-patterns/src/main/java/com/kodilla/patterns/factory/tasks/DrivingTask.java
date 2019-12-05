package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean isExecuted;

    public DrivingTask(String taskName,
                       String where,
                       String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
        return "\nDrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                ", isExecuted=" + isExecuted +
                '}';
    }
}
