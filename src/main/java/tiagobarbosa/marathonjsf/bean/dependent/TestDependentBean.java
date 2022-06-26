package tiagobarbosa.marathonjsf.bean.dependent;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@Dependent
public class TestDependentBean implements Serializable {
    private List<String> characters;
    private List<String> characterSelected = new ArrayList<>();
    private List<String> categoriesList = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do Dependent scoped");
        characters = asList("Marie", "Hughie", "Female", "MM");
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

    public List<String> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<String> categoriesList) {
        this.categoriesList = categoriesList;
    }
}
