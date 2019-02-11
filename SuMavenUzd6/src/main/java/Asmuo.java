public class Asmuo {
    private int id;
    private String name;
    private String surname;
    private static int redId=1;

    public  Asmuo(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id=redId++;
    }

    @Override
    public String toString() {
        return "Asmuo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
}
