package tiagobarbosa.marathonjsf.bean.communication;

import tiagobarbosa.marathonjsf.model.Student;
import tiagobarbosa.marathonjsf.util.ApplicationMapUtil;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CommunicationTest12Bean implements Serializable {
    private Student student;

    public void init() {
        System.out.println("In communication 12");
        student = (Student) ApplicationMapUtil.getValueFromApplicationMap("student");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
