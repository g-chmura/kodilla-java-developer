package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final Task makeTask(final TypeOfTask typeOfTask,
                               String taskName,
                               String descriptionOfTheTask,
                               String quantityOrWhatToPaintOrVehicle) {
        switch (typeOfTask) {
            case SHOPPING:
                return new ShoppingTask(taskName,
                        descriptionOfTheTask,
                        Double.parseDouble(quantityOrWhatToPaintOrVehicle));
            case PAINTING:
                return new PaintingTask(taskName,
                        descriptionOfTheTask,
                        quantityOrWhatToPaintOrVehicle);
            case DRIVING:
                return new DrivingTask(taskName,
                        descriptionOfTheTask,
                        quantityOrWhatToPaintOrVehicle);
            default:
                return null;
        }
    }
}
