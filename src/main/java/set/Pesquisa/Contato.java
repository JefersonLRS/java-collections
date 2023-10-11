package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {

    private String name;
    private int contactNumber;

    public Contato(String name, int contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "name='" + name + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getName(), contato.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
