package lt.v;
public class Islaidos extends Biudzetas{

    Islaidos(){
        kategorijos.add("Parduotuves");
        kategorijos.add("Lizingas");
        kategorijos.add("Bustas");
        kategorijos.add("Mokslai");
        kategorijos.add("Pramogos");
        kategorijos.add("Automobilis");
        kategorijos.add("Sodyba");
        kategorijos.add("Sveikata");
        kategorijos.add("Kita");

        sumos.add(0.);
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
        System.out.println("Islaidos: ");
        super.spausdintiDetaliaInformacija();
    }
}
