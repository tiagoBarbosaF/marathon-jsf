package tiagobarbosa.marathonjsf.bean.application;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TestApplicationBean implements Serializable {
    private List<String> categoryList;

    @PostConstruct
    public void init(){
        System.out.println("Inside the PostConstruct of ApplicationScoped");
        categoryList = asList("Anime", "SCI-FI", "Terror", "Drama");
    }

    public void changeList(){
        categoryList = asList("Anime", "SCI-FI", "Terror", "Drama", "Novel");
    }

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }
}
