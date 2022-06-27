package tiagobarbosa.marathonjsf.bean.communication;

import tiagobarbosa.marathonjsf.model.Student;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest05Bean implements Serializable {
    private String name;
    private String surname;
    private Student student = new Student();
    private Student student2;

    public void execute() {
        System.out.println("Inside execute method -> " + name);
        System.out.println("Inside execute method -> " + surname);
        System.out.println("Inside execute method (student) -> " + student2.getFirstName());
        System.out.println("Inside execute method (student) -> " + student2.getLastName());
        System.out.println("Inside execute method (student) -> " + student2.getGrade1());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Came from setPropertyActionListener -> " + name);
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Came from setPropertyActionListener -> " + surname);
        this.surname = surname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }
}
