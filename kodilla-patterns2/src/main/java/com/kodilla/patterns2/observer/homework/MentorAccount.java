package com.kodilla.patterns2.observer.homework;

import java.util.HashMap;
import java.util.Map;

public class MentorAccount implements Observer {
    private final String username;
    private Map<String, Integer> studentsAssignmentList;

    public MentorAccount(String username) {
        this.username = username;
        studentsAssignmentList = new HashMap<>();
    }

    @Override
    public void update(StudentAssignments studentAssignments) {
        System.out.println(username + ": New Assignment from " + studentAssignments.getStudentName() + "\n" +
                " (total : " + studentAssignments.getAssignmentsList().size() + " assignments)");
        studentsAssignmentList.putIfAbsent(studentAssignments.getStudentName(), 0);
        Integer count = studentsAssignmentList.get(studentAssignments.getStudentName()) + 1;
        studentsAssignmentList.replace(studentAssignments.getStudentName(), count);
    }

    public String getUsername() {
        return username;
    }

    public Map<String, Integer> getStudentsAssignmentList() {
        return studentsAssignmentList;
    }
}
