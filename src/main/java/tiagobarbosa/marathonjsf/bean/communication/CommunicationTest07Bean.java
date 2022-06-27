package tiagobarbosa.marathonjsf.bean.communication;

import tiagobarbosa.marathonjsf.model.Student;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest07Bean implements Serializable {
    private Student student;

    public void init() {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        student = (Student) flash.get("student");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
