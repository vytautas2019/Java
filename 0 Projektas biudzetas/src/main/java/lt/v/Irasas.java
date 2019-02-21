package lt.v;

import java.io.Serializable;
import java.time.LocalDate;

public class Irasas extends Biudzetas {
    private LocalDate time;
    private int id;
    private double suma;
    private String lesuTipas;
    private String kategorija;
    static int idSet = 0;

    public Irasas(){
        kategorijos.add("Visi irasai");
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
        this.time = LocalDate.now();
        this.id = ++idSet;
        this.suma = suma;
        this.lesuTipas = lesuTipas;
        this.kategorija = kategorija;
    }

    public LocalDate getTime() {
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



}
