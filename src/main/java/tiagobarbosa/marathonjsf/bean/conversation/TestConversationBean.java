package tiagobarbosa.marathonjsf.bean.conversation;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ConversationScoped
public class TestConversationBean implements Serializable {
    private List<String> characters;
    private List<String> characterSelected = new ArrayList<>();
    @Inject
    private Conversation conversation;

    public void init() {
        System.out.println("Entrou no PostConstruct do ConversationScoped");
        characters = asList("Fred", "Jason", "It", "Alien");
        if (conversation.isTransient()) {
            conversation.begin();
            System.out.println("Begin conversation scoped, ID=" + conversation.getId());
        }
    }

    public String endConversation() {
        if (!conversation.isTransient()) {
            conversation.end();
        }
        return "conversation?faces-redirect=true";
    }

    public String goToIndex() {
        return "conversation?faces-redirect=true";
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

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
}
