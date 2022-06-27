package tiagobarbosa.marathonjsf.bean.communication;

import tiagobarbosa.marathonjsf.model.Student;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest04Bean implements Serializable {
    private String buttonName = "Name of button bean";
    private Student student = new Student();

    public void execute(ActionEvent event) {
        String name = (String) event.getComponent().getAttributes().get("name");
        String surname = (String) event.getComponent().getAttributes().get("surname");
        Student student = (Student) event.getComponent().getAttributes().get("student");
        String test = (String) event.getComponent().getAttributes().get("test");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(test);
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
