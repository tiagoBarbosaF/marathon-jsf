package tiagobarbosa.marathonjsf.bean.communication;

import org.omnifaces.util.Faces;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;

@Named
@ViewScoped
public class CommunicationTest08Bean implements Serializable {
    private String key;
    private String value;

    public void init() {
        Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
        System.out.println(Faces.getRequestCookie("Computer"));
        System.out.println(requestCookieMap);
    }

    public String saveCookie() {
        Faces.addResponseCookie(key, value, -1);
        return "communication9?faces-redirect=true";
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
