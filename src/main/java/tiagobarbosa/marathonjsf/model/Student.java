package tiagobarbosa.marathonjsf.model;

import tiagobarbosa.marathonjsf.model.enums.Shift;

import java.util.List;

import static java.util.Arrays.asList;

public class Student {
    private String firstName = "Tiago";
    private String lastName = "Barbosa";
    private double grade1 = 20;
    private double grade2 = 40;
    private double grade3 = 10;
    private Shift shift = Shift.MORNING;

    public Student() {
    }

    public Student(String firstName, String lastName, double grade1) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade1 = grade1;
    }

    public static List<Student> studentList() {
        return asList(new Student("John", "Snow", 80), new Student("Peter", "Park", 100), new Student("Tony", "Stark", 90));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
}
