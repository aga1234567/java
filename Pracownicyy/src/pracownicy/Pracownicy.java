package pracownicy;

import java.util.Scanner;

public class Pracownicy {
    private static Pracownik[] arrPracownicy;

    public static void main(String[] args) {
        powitalneMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile rekordow ma mieć tablica");
        int liczba1 = sc.nextInt();
        arrPracownicy = new Pracownik[liczba1];

        while (true) {
            System.out.println("|============================================================|");
            System.out.println("|Wybierz polecenie                                           |");
            System.out.println("|1-Dodaj pracownika                                          |");
            System.out.println("|2-Usuń pracownika                                           |");
            System.out.println("|3-Wyświetl wszystkich pracownikow                           |");
            System.out.println("|4-wyswietl wszystich pracownikow od najwiekszej wyplaty     |");
            System.out.println("|5-wyswietl pracownika z najwieksza wyplata                  |");
            System.out.println("|============================================================|");
            int polecenie = sc.nextInt();
            switch (polecenie) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    dodajPracownika();
                    break;
                case 2:
                    usunRekord();
                    break;
                case 3:
                    wyswietl();
                    break;
                case 4:
                    sortujDesc();
                    break;
                case 5:
                    wyswietlMaxWyplate();
                    break;
            }

        }

    }

    public static void powitalneMenu() {
        System.out.println("\n" +
                " _____                                   _            \n" +
                "|  __ \\                                 (_)           \n" +
                "| |__) | __ __ _  ___ _____      ___ __  _  ___ _   _ \n" +
                "|  ___/ '__/ _` |/ __/ _ \\ \\ /\\ / / '_ \\| |/ __| | | |\n" +
                "| |   | | | (_| | (_| (_) \\ V  V /| | | | | (__| |_| |\n" +
                "|_|   |_|  \\__,_|\\___\\___/ \\_/\\_/ |_| |_|_|\\___|\\__, |\n" +
                "                                                 __/ |\n" +
                "                                                |___/ \n");
    }

    public static void dodajPracownika() {
        boolean jestWolneMiejsce = czyWolneMiejsce();
        if (!jestWolneMiejsce) {
            System.out.println("Brak wolnych miejsc");
            return;
        }

        Scanner ilu = new Scanner(System.in);
        Scanner ee = new Scanner(System.in);

        System.out.println("Wprowadź imie");
        String imie = ee.nextLine();
        System.out.println("Wprowadź nazwisko");
        String nazwisko = ee.nextLine();
        System.out.println("Wprowadź wiek");
        int wiek = ilu.nextInt();
        System.out.println("Wprowadź wynagrodzenie brutto");
        int wyplata = ilu.nextInt();
        int index = znajdzWolneMiejsce();
        arrPracownicy[index] = new Pracownik(imie, nazwisko, wiek, wyplata);
    }

    private static boolean czyWolneMiejsce() {
        for (Pracownik pracownik : arrPracownicy) {
            if (pracownik == null) {
                return true;
            }
        }
        return false;
    }

    private static int znajdzWolneMiejsce() {
        for (int index = 0; index < arrPracownicy.length; index++) {
            if (arrPracownicy[index] == null) {
                return index;
            }
        }
        throw new RuntimeException("Brak wolnych miejsc");
    }

    public static void usunRekord() {
        Scanner usun = new Scanner(System.in);
        System.out.println("Podaj index praownika, którego chcesz usunąć.");
        int delete = usun.nextInt();
        arrPracownicy[delete] = null;
    }

    public static void wyswietl() {
        for (int index = 0; index < arrPracownicy.length - 1; index++) {
            if (arrPracownicy[index] != null) {
                System.out.println(index + "" + arrPracownicy[index]);
            } else {
                System.out.println(index + ". Brak pracownika");
            }
        }

    }

    public static void sortujDesc() {
        for (int j = 0; j < arrPracownicy.length; j++) {
            for (int index = 0; index < arrPracownicy.length - 1; index++) {
                if (arrPracownicy[index] != null && arrPracownicy[index + 1] != null && (arrPracownicy[index].getWyplata() < arrPracownicy[index + 1].getWyplata())) {
                    Pracownik temp = arrPracownicy[index];
                    arrPracownicy[index] = arrPracownicy[index + 1];
                    arrPracownicy[index + 1] = temp;
                } else if (arrPracownicy[index] == null) {
                    Pracownik temp = arrPracownicy[index];
                    arrPracownicy[index] = arrPracownicy[index + 1];
                    arrPracownicy[index + 1] = temp;
                }
            }
        }
        for (Pracownik pracownik : arrPracownicy) {
            System.out.println(pracownik);
        }
    }

    public static void wyswietlMaxWyplate() {
        Pracownik maxWyplataPracownik = arrPracownicy[0];
        for (Pracownik pracownik : arrPracownicy) {
            if (pracownik != null) {
                if (pracownik.getWyplata() > maxWyplataPracownik.getWyplata()) {
                    maxWyplataPracownik = pracownik;
                }
            }
        }
        System.out.println(maxWyplataPracownik);

    }
}
