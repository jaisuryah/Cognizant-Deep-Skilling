package com.mvc.student;

public class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    // Controller methods to update model
    public void setStudentName(String name) {
        student.setName(name);
    }

    public void setStudentGrade(String grade) {
        student.setGrade(grade);
    }

    public void setStudentId(String id) {
        student.setId(id);
    }

    // Controller method to update the view
    public void updateView() {
        view.displayStudentDetails(student.getId(), student.getName(), student.getGrade());
    }
}
