import java.util.ArrayList;
import java.util.List;

public class Bankas {
    private List<BankoSaskaita> saskaitos;

    public Bankas() {
        this.saskaitos = new ArrayList<BankoSaskaita>();
    }
    public void sukurtiBankoSaskaita(Asmuo asmuo,Valiutos valiutos){
        BankoSaskaita saskaita =new BankoSaskaita(0,valiutos,asmuo);
        saskaitos.add(saskaita);
    }

    public List<BankoSaskaita> getSaskaitos() {
        return saskaitos;
    }
    public  int gautiSaskaitoslikuti(Asmuo asmuo){
        for (BankoSaskaita bankoSaskaita:saskaitos) {
           if (bankoSaskaita.getValdytojas().getId()==asmuo.getId()){
               return bankoSaskaita.gautiLikuti();
           }
        }return 0;
    }

}
