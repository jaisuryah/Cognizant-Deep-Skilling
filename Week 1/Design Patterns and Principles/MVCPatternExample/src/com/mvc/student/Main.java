package com.mvc.student;

public class Main {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("101", "John Doe", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        System.out.println("\n--- Updating Student Info ---");

        // Update model using controller
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
