package tiagobarbosa.marathonjsf.bean.communication;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationResultTestBean implements Serializable {
    private String name;
    private String surname;

    public void init() {
        System.out.println("Create communication result");
        System.out.println(name);
        System.out.println(surname);
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
