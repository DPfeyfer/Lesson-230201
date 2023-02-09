package HW_230201;

public class AuthorName {
    private String firstName;
    private String secondName;

    public AuthorName(String name, String surName) {
        this.firstName = name;
        this.secondName = surName;
    }

    public AuthorName() {

    }

    public String getName() {
        return this.firstName;
    }

    public String getSurName() {
        return this.secondName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public void setSurName(String surName) {
        this.secondName = surName;
    }

    public String toString() {
        return " name: " + firstName + " sur name: " + secondName;
    }
}
