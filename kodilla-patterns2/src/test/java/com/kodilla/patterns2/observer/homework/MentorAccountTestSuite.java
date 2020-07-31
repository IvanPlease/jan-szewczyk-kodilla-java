package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MentorAccountTestSuite {
    @Test
    public void testAssignmentQueue(){
        //Given
        MentorAccount mentorAccount = new MentorAccount("Mateusz Ryndak");
        StudentAssignments studentOne = new StudentAssignments("Jan Szewczyk #1");
        StudentAssignments studentTwo = new StudentAssignments("Jan Szewczyk #2");
        StudentAssignments studentThree = new StudentAssignments("Jan Szewczyk #3");
        Assignment assignmentOne = new Assignment("Zadanie #1", "Zapoznanie");
        Assignment assignmentTwo = new Assignment("Zadanie #2", "Zadanie");
        Assignment assignmentThree = new Assignment("Zadanie #3", "Zadanie");
        Assignment assignmentFour = new Assignment("Zadanie #4", "Zapoznanie");
        studentOne.registerObserver(mentorAccount);
        studentTwo.registerObserver(mentorAccount);
        studentThree.registerObserver(mentorAccount);
        //When
        studentOne.addAssignment(assignmentOne);
        studentOne.addAssignment(assignmentTwo);
        studentOne.addAssignment(assignmentThree);
        studentTwo.addAssignment(assignmentTwo);
        studentTwo.addAssignment(assignmentThree);
        studentThree.addAssignment(assignmentOne);
        studentThree.addAssignment(assignmentTwo);
        studentThree.addAssignment(assignmentThree);
        studentThree.addAssignment(assignmentFour);
        //Then
        assertEquals(3, mentorAccount.getStudentsAssignmentList().get(studentOne.getStudentName()));
        assertEquals(2, mentorAccount.getStudentsAssignmentList().get(studentTwo.getStudentName()));
        assertEquals(4, mentorAccount.getStudentsAssignmentList().get(studentThree.getStudentName()));
    }


}