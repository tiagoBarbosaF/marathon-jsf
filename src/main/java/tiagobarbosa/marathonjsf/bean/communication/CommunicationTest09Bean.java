package tiagobarbosa.marathonjsf.bean.communication;

import org.omnifaces.util.Faces;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CommunicationTest09Bean implements Serializable {
    private String value;

    public void init() {
        value = Faces.getRequestCookie("Computer");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
