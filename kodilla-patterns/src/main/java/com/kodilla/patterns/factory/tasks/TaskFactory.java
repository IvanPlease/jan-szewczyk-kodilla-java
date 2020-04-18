package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Grocerys", "Bananas", 10);
            case PAINTING:
                return new PaintingTask("Horizon", "Red", "Horizon");
            case DRIVING:
                return new DrivingTask("Grocerys", "Shop", "Car");
            default:
                return null;
        }

    }
}