import java.io.Serializable;

public class People implements Serializable {
    private int females;
    private String country;
    private int age;
    private int males;
    private int year;
    private int total;

    public People(int females, String country, int age, int males, int year, int total) {
        this.females = females;
        this.country = country;
        this.age = age;
        this.males = males;
        this.year = year;
        this.total = total;
    }

    public People() {
    }

    public int getFemales() {
        return females;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public int getMales() {
        return males;
    }

    public int getYear() {
        return year;
    }

    public int getTotal() {
        return total;
    }

    public void setFemales(int females) {
        this.females = females;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMales(int males) {
        this.males = males;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "People{" +
                "females=" + females +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", males=" + males +
                ", year=" + year +
                ", total=" + total +
                '}';
    }
}
