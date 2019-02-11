//+Sukurti naują Maven projektą. Pavadinkite pvz. Bankas.
//       + Sukurti klasę Asmuo, kuri turi id (ir statinį skaitliuką, kurio reikšmė priskiriama id klasės kintamajam). Klasės kintamajam id reikšmė priskiriama tik vieną kartą. Klasė Asmuo taip pat turi vardą ir pavardę.
//
//        +Sukurti klasę BankoSaskaita, kuri turi sugeneruotą sąskaitos numerį (apie generavimą bus kitame punkte), likutį, valiutą (gali būti Enum reikšmė) ir sąskaitos valdytoją - klasės Asmuo objektą. Banko sąskaitos numeris taip pat turi būti priskiriamas tik vieną kartą.
//
//       + Klasė BankoSaskaita turi turėti konstruktorių, kuriam galima paduoti pradinį likutį, valiutą ir asmenį, kurio tai sąskaita.
//
//        Klasė BankoSaskaita turi turėti metodus gautiLikuti(), kuris grąžina sąskaitos likutį, ideti(...), kuriam paduosime norimą įdėti į sąskaitą pinigų sumą, nuskaiciuoti(...), kuriam paduosime pinigų sumą norimą nuskaičiuoti nuo sąskaitos (būtina patikrinti ar pakanka pinigų).
//
//        BankoSaskaita klasės kintamojo "saskaitos numeris" reikšmė turi būti generuojama. Tam galime panaudoti papildomą biblioteką, kurios groupId yra org.apache.commons, o artifactId yra commons-lang3. Tada generavimui galėsite naudoti pvz. "LT" + RandomStringUtils.randomNumeric(18);. Plačiau apie Commons Lang čia.
//
//        Sukurkite klasę Bankas, kuri turės klasės kintamąjį - sąrašą banko sąskaitų.
//
//        Klasėje Bankas sukurti metodą sukurtiBankoSaskaita(...). Metodas priima per parametrus asmens objektą ir valiutą. Sukuria naują banko sąskaitą ir įdeda ją į banko sąskaitų sąrašą.
//
//        Klasėje Bankas sukurti metodą gautiAsmensSaskaitosLikuti(...), kuriam padavus asmens objektą grąžins jo turimos sąskaitos likutį.
//
//        Klasėje Bankas sukurti metodą pervestiPinigus(...), kuriam padavus asmens siuntėjo ir asmens gavėjo objektus, taip pat pervedamą sumą ir valiutą, bus įvykdytas pinigų pervedimas.
//
//        Klasėje Bankas sukurti metodą inestiPiniguISaskaita(...), kur padavus asmens, į kurio sąskaitą įdedami pinigai ir sumą, ją įdės į banko sąskaitą.
//
//        Klasėje Bankas sukurti metodą spausdintiSaskaituDuomenis(), kuris atspausdins informaciją apie visas banko sąskaitas - numeriai, savininkai, likučiai ir t.t.
public class Main {
    public static void main(String[] args) {
        Asmuo asmuo=new Asmuo("vytas","Vardis");
        Asmuo asmuo1=new Asmuo("vyta","Vard");
        System.out.println(asmuo);
        System.out.println(asmuo1);
        BankoSaskaita bankoSaskaita = new BankoSaskaita(100,Valiutos.EUR,asmuo);
        System.out.println(bankoSaskaita);
        BankoSaskaita bankoSaskaita1 = new BankoSaskaita(88,Valiutos.USD,asmuo1);
        System.out.println(bankoSaskaita1);
        bankoSaskaita.ideti(555,Valiutos.EUR,asmuo);
        System.out.println(bankoSaskaita);
        //bankoSaskaita.gautiLikuti(asmuo);
        bankoSaskaita.ideti(555,Valiutos.USD,asmuo);
        System.out.println(bankoSaskaita);
        bankoSaskaita.ideti(555,Valiutos.EUR,asmuo);
        System.out.println(bankoSaskaita);
        bankoSaskaita.nuskaiciuoti(1330,Valiutos.EUR,asmuo);
        System.out.println(bankoSaskaita);
        bankoSaskaita.nuskaiciuoti(1200,Valiutos.EUR,asmuo);
        System.out.println(bankoSaskaita);
        Bankas bankas =new Bankas();
        bankas.sukurtiBankoSaskaita(asmuo,Valiutos.USD);
        System.out.println(bankas.getSaskaitos());
        System.out.println(bankas.gautiSaskaitoslikuti(asmuo));
    }

}
