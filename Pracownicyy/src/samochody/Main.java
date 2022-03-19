package samochody;

import java.util.Scanner;

public class Main {
    private static Samochod[] arrSamochod;

    public static void main(String[] args) {
        menu();


    }
    private static void menu(){
        Scanner ileRekordow = new Scanner(System.in);
        System.out.println("Podaj liczbe rekordów w tablicy");
        int ileRekordowWtablicy = ileRekordow.nextInt();
        arrSamochod = new Samochod[ileRekordowWtablicy];
        while (true) {
            System.out.println("1. Dodaj samochód");
            System.out.println("2. Usuń samochód");
            System.out.println("3. Wyświetl wszystkie rekordy");
            System.out.println("4. Sortuj DESC");
            System.out.println("5. Wyswietl najdroższy samochód");
            System.out.println("0. Wyjście");
            int polecenie = ileRekordow.nextInt();

            switch (polecenie) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    dodaj();
                    break;
                case 2:
                    usun();
                    break;
                case 3:
                    wyswietl();
                    break;
                case 4:
                    sortuj();
                    break;
                case 5:
                    wyswietlNajdroższy();
                    break;
            }
        }
    }

    private static void dodaj() {
        boolean jestMiejsceWolne = czyWolne();
        if (!jestMiejsceWolne) {
            System.out.println("Brak miejsca");
            return;
        }
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        System.out.println("Podaj marke samochodu");
        String marka = sc.nextLine();
        System.out.println("Podaj kolor samochodu");
        String kolor = sc.nextLine();
        System.out.println("Podaj rokProdukcji samochodu");
        int rokProdukcji = sc.nextInt();
        System.out.println("Podaj przebieg samochodu");
        int przebieg = sc.nextInt();
        System.out.println("Podaj cene samochodu");
        int cena = sc.nextInt();
        int index = wolnaPozycja();
        arrSamochod[index] = new Samochod(marka, kolor, rokProdukcji, przebieg, cena);
    }

    private static boolean czyWolne() {
        for (Samochod samochod : arrSamochod) {
            if (samochod == null) {
                return true;
            }
        }
        return false;
    }

    private static int wolnaPozycja() {
        for (int index = 0; index < arrSamochod.length - 1; index++) {
            if (arrSamochod[index] == null) {
                return index;
            }
        }
        throw new RuntimeException("Brak wolnych miejsc");
    }

    private static void usun() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj index, ktory chcesz usunąć");
        int delete = scanner.nextInt();
        arrSamochod[delete] = null;
    }

    private static void wyswietl() {
        for (int index = 0; index < arrSamochod.length - 1; index++) {
            if (arrSamochod[index] != null) {
                System.out.println(index+". "+arrSamochod[index]);
            } else {
                System.out.println(index+". Brak rekordu");
            }
        }
    }

    private static void sortuj() {
        for (int j = 0; j < arrSamochod.length - 1; j++) {
            for (int index = 0; index < arrSamochod.length - 1; index++) {
                if (arrSamochod[index] != null && arrSamochod[index + 1] != null && arrSamochod[index].getCena() < arrSamochod[index + 1].getCena()) {
                    Samochod temp = arrSamochod[index];
                    arrSamochod[index] = arrSamochod[index + 1];
                    arrSamochod[index + 1] = temp;
                } else if (arrSamochod[index] == null) {
                    Samochod temp = arrSamochod[index];
                    arrSamochod[index] = arrSamochod[index + 1];
                    arrSamochod[index + 1] = temp;
                    System.out.println("brak rekordu");
                }
            }
        }
        for (Samochod samochod : arrSamochod) {
            System.out.println(samochod);
        }
    }

    private static void wyswietlNajdroższy() {
        Samochod maxCena = arrSamochod[0];
        for (int index = 0; index < arrSamochod.length - 1; index++) {
            if(arrSamochod[index]!=null) {
                if (arrSamochod[index].getCena() > maxCena.getCena()) {
                    arrSamochod[index] = maxCena;
                }
            }
        }
        System.out.println(maxCena);
    }
}
