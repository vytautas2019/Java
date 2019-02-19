package lt.v;

public class Asmuo {
    private String name;
    private String surname;

    public Asmuo(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Asmuo() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Asmuo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
