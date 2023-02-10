package HW_230201;

import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String name, String surName) {
        this.firstName = name;
        this.secondName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(secondName, author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    public Author() {

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
