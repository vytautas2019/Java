package com.company;

public class Darbuotojas {
    private int atlyginimas;
    private int darbas;
    private int valandos;
    private String darbuotojoVardas;
    private String pareigos;
    private String p;
    public static int k=0;

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }

    public String getPareigos() {
        return pareigos;
    }

    public Darbuotojas() {
        System.out.println("Sukurtas Darbuotojas: ");

    }

    public void setAtlyginimas(int atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public int getAtlyginimas() {
        return atlyginimas;
    }

    public void setDarbas(int darbas) {
        this.darbas = darbas;
    }

    public int getDarbas() {
        return darbas;
    }
    public void gautiInfo(){
        k++;
        System.out.println("K: "+k+"  Darbuotojas: "+getDarbuotojoVardas()+" Atlyginimas: "+getAtlyginimas()+ " Dirbta valandu: " + getValandos());


    }

    public void setValandos(int valandos) {
        this.valandos = valandos;
    }

    public int getValandos() {
        return valandos;
    }

    public String getDarbuotojoVardas() {
        return darbuotojoVardas;
    }

    public void setDarbuotojoVardas(String darbuotojoVardas) {
        this.darbuotojoVardas = darbuotojoVardas;
    }
    public Darbuotojas(String darbuotojoVardas,int atlyginimas,int valandos){
        this.darbuotojoVardas = darbuotojoVardas;
        this.atlyginimas = atlyginimas;
        this.valandos = valandos;

    }
    public void pridetiAlyginima(){
        atlyginimas+=5;
    }
    public void pridetiDarba(int v){
        atlyginimas+= 77;
        valandos+=v;

    }
    public  void isvalytiK(){
         k=0;
    }
}
