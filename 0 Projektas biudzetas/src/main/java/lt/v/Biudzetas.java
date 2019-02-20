package lt.v;

import java.util.ArrayList;
import java.util.List;

public class Biudzetas {

    protected double suma;
    protected ArrayList<String> kategorijos = new ArrayList<>();
    protected ArrayList<Double> sumos = new ArrayList<>();
    public static List<Irasas> irasai =new ArrayList<>();

    public ArrayList<String> getKategorijos() {
        return kategorijos;
    }

    public ArrayList getSumos() {
        return sumos;
    }

    public static List<Irasas> getIrasai() {
        return irasai;
    }




    public double getSuma() {
        return suma;
    }

    public void spausdintiKategorijas(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        for(int i = 0; i < this.kategorijos.size(); i++){
            System.out.println((i+1)+". "+kategorijos.get(i));

        }
        System.out.println(this.kategorijos.size()+1+". Grizti");
        System.out.println("Iveskite skaiciu is meniu...");
        System.out.println();
    }
    public void setKategorijosSuma(int index, double value){
        this.sumos.set(index, value);
        suma += value;
    }
    public void spausdintiDetaliaInformacija(){
        for(int i =0; i< kategorijos.size(); i++){
            System.out.println(kategorijos.get(i)+" : "+sumos.get(i)+Valiuta.EUR);
        }
    }
    public String getKategorijosreiksme(int index){
        return  this.kategorijos.get(index);
    }
}