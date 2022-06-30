package tiagobarbosa.marathonjsf.bean.communication;

import tiagobarbosa.marathonjsf.model.Student;
import tiagobarbosa.marathonjsf.util.ApplicationMapUtil;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CommunicationTest11Bean implements Serializable {
    private List<Student> studentList = Student.studentList();

    public String edit(Student student) {
        ApplicationMapUtil.setValueApplicationMap("student", student);
        return "communication12?faces-redirect=true";
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
