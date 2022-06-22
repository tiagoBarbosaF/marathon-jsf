package tiagobarbosa.marathonjsf.bean.request;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class TestRequestBean implements Serializable {
    private List<String> characters;
    private List<String> characterSelected = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do RequestScoped");
        characters = asList("Alucard", "Guts", "Trevor");
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
}
