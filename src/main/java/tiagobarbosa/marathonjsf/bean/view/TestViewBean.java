package tiagobarbosa.marathonjsf.bean.view;

import tiagobarbosa.marathonjsf.bean.dependent.TestDependentBean;
import tiagobarbosa.marathonjsf.bean.session.TestSessionBean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TestViewBean implements Serializable {
    private List<String> characters = asList("Peter", "Iron Man", "Strange", "John");
    private List<String> characterSelected = new ArrayList<>();
    private final TestDependentBean dependentBean;
    private final TestSessionBean sessionBean;

    @Inject
    public TestViewBean(TestDependentBean dependentBean, TestSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ViewScoped");
        characters = asList("Marie", "Hughie", "Female", "MM");
    }

    public void selectCharacter() {
        int index = ThreadLocalRandom.current().nextInt(characters.size());
        String character = characters.get(index);
        characterSelected.add(character);
        dependentBean.getCharacterSelected().add(character);
    }

    public List<String> getCharacterSelected() {
        return characterSelected;
    }

    public void setCharacterSelected(List<String> characterSelected) {
        this.characterSelected = characterSelected;
    }

    public TestDependentBean getDependentBean() {
        return dependentBean;
    }

    public TestSessionBean getSessionBean() {
        return sessionBean;
    }
}
