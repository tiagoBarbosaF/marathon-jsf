package tiagobarbosa.marathonjsf.bean.student;

import tiagobarbosa.marathonjsf.model.Student;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class StudentBeanRecord implements Serializable {
    private Student student = new Student();
    private String[] namesArray = {"One", "Two", "Three"};
    //    private List<String> namesList = List.of("Four", "Five", "Six");
    private List<String> namesList = asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
    private Set<String> namesSet = new HashSet<>(asList("Seven", "Eight", "Nine"));
    private Map<String, String> namesMap = new HashMap<>();
    private boolean showGrades;
    private boolean showLinks;

    {
        namesMap.put("One Piece", "1000");
        namesMap.put("Berserk", "45");
        namesMap.put("Hellsing", "60");
    }

    public void execute() {
        System.out.println("Making a search in database");
        System.out.println("Processing datas");
        System.out.println("Displaying datas");
    }

    public void execute(String param) {
        System.out.println("Making a search in database with name -> " + param);
        System.out.println("Processing datas");
        System.out.println("Displaying datas");
    }

    public String goToIndex2() {
        return "index2?faces-redirect=true";
    }

    public String goToIndex() {
        return "index?faces-redirect=true";
    }

    public void showGrades() {
        this.showGrades = true;
    }

    public void hideGrades() {
        this.showGrades = false;
    }

    public void showLinks() {
        this.showLinks = true;
    }

    public void hideLinks() {
        this.showLinks = false;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getNamesArray() {
        return namesArray;
    }

    public void setNamesArray(String[] namesArray) {
        this.namesArray = namesArray;
    }

    public List<String> getNamesList() {
        return namesList;
    }

    public void setNamesList(List<String> namesList) {
        this.namesList = namesList;
    }

    public Set<String> getNamesSet() {
        return namesSet;
    }

    public void setNamesSet(Set<String> namesSet) {
        this.namesSet = namesSet;
    }

    public Map<String, String> getNamesMap() {
        return namesMap;
    }

    public void setNamesMap(Map<String, String> namesMap) {
        this.namesMap = namesMap;
    }

    public boolean isShowGrades() {
        return showGrades;
    }

    public void setShowGrades(boolean showGrades) {
        this.showGrades = showGrades;
    }

    public boolean isShowLinks() {
        return showLinks;
    }

    public void setShowLinks(boolean showLinks) {
        this.showLinks = showLinks;
    }
}