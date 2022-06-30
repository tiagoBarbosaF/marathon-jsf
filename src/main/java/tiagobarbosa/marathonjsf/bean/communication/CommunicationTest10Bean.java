package tiagobarbosa.marathonjsf.bean.communication;

import tiagobarbosa.marathonjsf.model.Student;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CommunicationTest10Bean implements Serializable {
    private String password;
    private List<Student> studentList = Student.studentList();

    public void remove(Student student) {
        studentList.remove(student);
    }

    public void save() {
        System.out.println(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
