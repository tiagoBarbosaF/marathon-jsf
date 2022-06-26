package tiagobarbosa.marathonjsf.bean.login;

import tiagobarbosa.marathonjsf.model.Student;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class LoginBean implements Serializable {
    private String login;
    private String password;
    private Student student;

    public String login() {
        if (login.equals("t") && password.equals("1")) {
            student = new Student();
            return "/restricted/beginsystem.xhtml?faces-redirect=true";
        }
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login and/or password invalid", ""));
        return null;
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        student = null;
        return "/login?faces-redirect=true";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
