package samochody;

public class Samochod {
    private final String marka;
    private final String kolor;
    private final int rokProdukcji;
    private final int przebieg;
    private final int cena;

    public Samochod(String marka, String kolor, int rokProdukcji, int przebieg, int cena) {
        this.marka = marka;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Samochod: {" +
                "marka='" + marka + '\'' +
                ",  kolor='" + kolor + '\'' +
                ",  rokProdukcji=" + rokProdukcji +
                ",  przebieg=" + przebieg +
                ",  cena=" + cena +
                '}';
    }
}
