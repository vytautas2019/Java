package lt.v;

public class Pajamos extends Biudzetas{

    public Pajamos(){
        kategorijos.add("Atlyginimas");
        kategorijos.add("NT Nuoma");
        kategorijos.add("Stipendija");
        kategorijos.add("Ismoka");
        kategorijos.add("Investicijos");
        kategorijos.add("Dovana");
        kategorijos.add("Palikimas");
        kategorijos.add("Kita");

        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);
        sumos.add(0.);


        suma = 0;
    }

    @Override
    public void spausdintiDetaliaInformacija() {
        System.out.println("Pajamos: ");
        super.spausdintiDetaliaInformacija();
    }

}
