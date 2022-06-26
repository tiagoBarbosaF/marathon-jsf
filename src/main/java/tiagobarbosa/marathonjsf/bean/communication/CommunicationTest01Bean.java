package tiagobarbosa.marathonjsf.bean.communication;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest01Bean implements Serializable {
    private String name;
    private String surname;

    public void printAttributes() {
        String initParameter = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("images.location");
        System.out.println(initParameter);
    }

    public String save() {
        System.out.println(name);
        System.out.println(surname);
        return "communication2?faces-redirect=true&name=" + name + "&surname=" + surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
