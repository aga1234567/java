package pracownicy;

class Pracownik {
    private final String imie;
    private final String nazwisko;
    private final int wiek;
    private final int wyplata;

    public Pracownik(String imie, String nazwisko, int wiek, int wyplata) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wyplata = wyplata;
    }

    public int getWyplata() {
        return wyplata;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", wyplata=" + wyplata +
                '}';
    }
}

