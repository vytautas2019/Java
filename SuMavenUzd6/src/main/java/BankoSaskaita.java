import org.apache.commons.lang3.RandomStringUtils;

public class BankoSaskaita {

    private String accountNumber;
    private  int balance;
    private Enum currency;
    private Asmuo valdytojas;




    public BankoSaskaita(Valiutos currency, Asmuo valdytojas) {
        this.accountNumber ="LT" + RandomStringUtils.randomNumeric(18);
        this.balance = balance;
        this.currency = currency;
        this.valdytojas = valdytojas;
    }


    public BankoSaskaita(int balance, Valiutos currency, Asmuo valdytojas) {
        this.accountNumber = "LT" + RandomStringUtils.randomNumeric(18);
        this.balance = balance;
        this.currency = currency;
        this.valdytojas = valdytojas;
    }

    @Override
    public String toString() {
        return "BankoSaskaita{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", currency=" + currency +
                ", valdytojas=" + valdytojas +
                '}';
    }
    public int gautiLikuti(){

        return balance;
    }

    public int ideti(int amuont,Enum currency,Asmuo valdytojas){
        if (currency==this.currency)
        return balance +=amuont;
        else {
            System.out.println("Operacija atmesta,reikia pakeisti valiuta is: "+currency+" -> "+this.currency);
        }
        return balance;
    }
    public int nuskaiciuoti(int amuont,Enum currency,Asmuo valdytojas){
        if (amuont<this.balance)
            return balance -=amuont;
        else {
            System.out.println("Operacija atmesta,per mazas saskaitos likutis,truksta lesu : "+ (this.balance-amuont)+this.currency);
        }
        return balance;
    }

    public Asmuo getValdytojas() {
        return valdytojas;
    }
}
