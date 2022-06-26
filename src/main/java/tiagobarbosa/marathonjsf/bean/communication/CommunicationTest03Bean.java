package tiagobarbosa.marathonjsf.bean.communication;

import org.omnifaces.cdi.Param;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest03Bean implements Serializable {
    private String name;
    private String surname;

    public void init() {
        System.out.println("Create communication 03");
        System.out.println(name);
        System.out.println(surname);
    }

    public String save(){
        System.out.println("Saving...");
        return "result?faces-redirect=true&amp;includeViewParams=true";
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
