package main;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private Person mother = new Person();
    private Person father = new Person();
    private List<Person> siblings = new ArrayList<Person>();
    private List<Person> children = new ArrayList<Person>();
    private List<Pet> Pets = new ArrayList<Pet>();

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        Pets = pets;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return Pets;
    }
    public List<Person> getGrandChildren(){
        List<Person> grandChildren = new ArrayList<Person>();
        for(int i =0; i<children.size();i++)
        {
            for(int j = 0; j<children.get(i).children.size();j++){
                getGrandChildren().add(children.get(i).children.get(j));
            }
        }
        return grandChildren;
    }
}
