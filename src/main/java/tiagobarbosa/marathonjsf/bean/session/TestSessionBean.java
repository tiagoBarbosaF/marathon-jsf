package tiagobarbosa.marathonjsf.bean.session;

import tiagobarbosa.marathonjsf.model.Student;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@SessionScoped
public class TestSessionBean implements Serializable {
    private List<String> characters = asList("Peter", "Iron Man", "Strange", "John");
    private List<String> characterSelected = new ArrayList<>();
    private Student student;

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do SessionScoped");
        characters = asList("Peter", "Iron Man", "Strange", "John");
        login();
    }
    public void login(){
        student = new Student();
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public void selectCharacter() {
        int index = ThreadLocalRandom.current().nextInt(characters.size());
        String character = characters.get(index);
        characterSelected.add(character);
    }

    public List<String> getCharacterSelected() {
        return characterSelected;
    }

    public void setCharacterSelected(List<String> characterSelected) {
        this.characterSelected = characterSelected;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
