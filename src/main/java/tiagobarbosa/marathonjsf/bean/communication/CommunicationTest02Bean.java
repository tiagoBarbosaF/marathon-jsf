package tiagobarbosa.marathonjsf.bean.communication;

import org.omnifaces.cdi.Param;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;

@Named
@ViewScoped
public class CommunicationTest02Bean implements Serializable {
    @Inject @Param(name = "name")
    private String name;
    @Inject @Param(name = "surname")
    private String surname;

    @PostConstruct
    public void init() {
        System.out.println("Create communication 02");
//        Map<String, String> parameterMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
//        name = parameterMap.get("name");
//        surname = parameterMap.get("surname");
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
