package owoce;

public class Owoce{
    private final String rodzaj;
    private final String kolor;
    private final String krajPochodzenia;
    private final int wagaZamówienia;
    private final int czasTranstortu;


    public Owoce(String rodzaj, String kolor, String krajPochodzenia, int wagaZamówienia, int czasTranstortu) {
        this.rodzaj = rodzaj;
        this.kolor = kolor;
        this.krajPochodzenia = krajPochodzenia;
        this.wagaZamówienia = wagaZamówienia;
        this.czasTranstortu = czasTranstortu;
    }

    public int getCzasTranstortu() {
        return czasTranstortu;
    }

    @Override
    public String toString() {
        return "Owoce: {" +
                "rodzaj='" + rodzaj + '\'' +
                ", kolor='" + kolor + '\'' +
                ", krajPochodzenia='" + krajPochodzenia + '\'' +
                ", wagaZamówienia=" + wagaZamówienia +
                ", czasTranstortu=" + czasTranstortu +
                '}';
    }
}
