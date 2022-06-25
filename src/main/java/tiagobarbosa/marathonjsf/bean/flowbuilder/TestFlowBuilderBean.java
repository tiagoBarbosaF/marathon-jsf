package tiagobarbosa.marathonjsf.bean.flowbuilder;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@FlowScoped(value = "newregistration")
public class TestFlowBuilderBean implements Serializable {
    private String firstName;
    private String lastName;
    private String address;

    public void save() {
        System.out.println("Saving data in database:");
        System.out.println("First name -> " + firstName);
        System.out.println("Last name -> " + lastName);
        System.out.println("Address -> " + address);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
