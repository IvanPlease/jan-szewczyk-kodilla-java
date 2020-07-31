package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentAssignments implements Observable {
    private final List<Observer> observers;
    private final List<Assignment> assignmentList;
    private final String studentName;
    private int assignmentCount;

    public StudentAssignments(String studentName) {
        observers = new ArrayList<>();
        assignmentList = new ArrayList<>();
        this.studentName = studentName;
    }

    public List<Assignment> getAssignmentsList() {
        return assignmentList;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addAssignment(Assignment assignment){
        assignmentList.add(assignment);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
