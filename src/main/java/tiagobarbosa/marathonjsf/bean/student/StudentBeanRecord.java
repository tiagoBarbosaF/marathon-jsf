package tiagobarbosa.marathonjsf.bean.student;

import tiagobarbosa.marathonjsf.model.Student;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
public class StudentBeanRecord implements Serializable {
    private Student student = new Student();
    private String[] namesArray = {"One", "Two", "Three"};
//    private List<String> namesList = List.of("Four", "Five", "Six");
    private List<String> namesList = asList("Four", "Five", "Six");
    private Set<String> namesSet = new HashSet<>(asList("Seven", "Eight", "Nine"));
    private Map<String,String> namesMap = new HashMap<>();

    {
        namesMap.put("One Piece", "1000");
        namesMap.put("Berserk", "45");
        namesMap.put("Hellsing", "60");
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
}
