package tiagobarbosa.marathonjsf.bean.communication;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import tiagobarbosa.marathonjsf.model.Student;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CommunicationTest06Bean implements Serializable {
    private List<Student> studentList = Student.studentList();

    public String edit(int index) {
        Student student = studentList.get(index);
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("student", student);
        return "communication7?faces-redirect=true";
    }

    public void onRowEdit(RowEditEvent<Student> event) {
        FacesMessage msg = new FacesMessage("Student edited", String.valueOf(event.getObject().getFirstName()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent<Student> event) {
        FacesMessage msg = new FacesMessage("Edit cancelled", String.valueOf(event.getObject().getFirstName()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();

        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell changed", "Old: " + oldValue + ", New: " + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
