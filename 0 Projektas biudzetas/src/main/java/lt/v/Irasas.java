package lt.v;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class Irasas extends Biudzetas {
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime time;
    private int id;
    private double suma;
    private String lesuTipas;
    private String kategorija;
    static int idSet = 0;

    public Irasas(){
        kategorijos.add("Detalus balansas");
        kategorijos.add("Iraso redagavimas");
        kategorijos.add("Iraso trynimas");
        kategorijos.add("Irasai pagal datas");
        kategorijos.add("Irasai pagal pajamas");
        kategorijos.add("Irasai pagal islaidas");


        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);


        suma = 0;
    }

    public Irasas(double suma, String lesuTipas, String kategorija) {
        this.time = LocalDateTime.now();
        this.id = ++idSet;
        this.suma = suma;
        this.lesuTipas = lesuTipas;
        this.kategorija = kategorija;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

    public double getSuma() {
        return suma;
    }

    public String getLesuTipas() {
        return lesuTipas;
    }

    public String getKategorija() {
        return kategorija;
    }

    public static int getIdSet() {
        return idSet;
    }

    @Override
    public String toString() {
        return "Irasas{" +
                "time=" + time +
                ", id=" + id +
                ", suma=" + suma +
                ", lesuTipas='" + lesuTipas + '\'' +
                ", kategorija='" + kategorija + '\'' +
                '}';
    }
    @Override
    public void spausdintiDetaliaInformacija() {
        System.out.println("Irasai: ");
        super.spausdintiDetaliaInformacija();
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void setLesuTipas(String lesuTipas) {
        this.lesuTipas = lesuTipas;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public static void setIdSet(int idSet) {
        Irasas.idSet = idSet;
    }

}
