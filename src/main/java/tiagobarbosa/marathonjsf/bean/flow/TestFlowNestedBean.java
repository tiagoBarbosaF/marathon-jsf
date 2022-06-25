package tiagobarbosa.marathonjsf.bean.flow;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@FlowScoped(value = "pendencies")
public class TestFlowNestedBean implements Serializable {
    private String userName;
    private String userSurname;

    public String validUser() {
        System.out.println("Searching in SERASA");
        System.out.println("Searching in SPC");
        if (true) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "User not valid", "Some details"));
            return null;
        }
        return "proceedToRegistration3";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
