package tiagobarbosa.marathonjsf.bean.application;

import tiagobarbosa.marathonjsf.bean.dependent.TestDependentBean;
import tiagobarbosa.marathonjsf.bean.session.TestSessionBean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TestApplicationBean implements Serializable {
    private List<String> categoryList;
    private final TestDependentBean dependentBean;
    private final TestSessionBean sessionBean;

    @Inject
    public TestApplicationBean(TestDependentBean dependentBean, TestSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Inside the PostConstruct of ApplicationScoped");
        categoryList = asList("Anime", "SCI-FI", "Terror", "Drama");
        dependentBean.getCategoriesList().addAll(asList("Comedy", "Novel", "Documentary"));
        sessionBean.selectCharacter();
    }

    public void changeList() {
        categoryList = asList("Anime", "SCI-FI", "Terror", "Drama", "Novel");
    }

    public List<String> getCategoryList() {
        return categoryList;
    }

    public TestDependentBean getDependentBean() {
        return dependentBean;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }

    public TestSessionBean getSessionBean() {
        return sessionBean;
    }
}
