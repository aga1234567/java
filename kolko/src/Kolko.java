import java.util.Arrays;
import java.util.Scanner;

public class Kolko {
    public static void main(String[] args) {
        int wymiar = 3;
        char[][] plansza = new char[wymiar][wymiar];
        char obecnySymbol = 'X';
        boolean czyKontynuowac = true;
        while (czyKontynuowac) {
            Kolko.drukujPlansze(plansza, wymiar);
            boolean ruchPoprawny = ruchGracz1(plansza, obecnySymbol);
            if (ruchPoprawny) {
                boolean wygranaWiersze = sprawdzWiersze(plansza, obecnySymbol);
                boolean wygranaKolumny = sprawdzKolumna(plansza, obecnySymbol);
                boolean wygranaSkos1 = sprawdzSkos1(plansza, obecnySymbol);
                //boolean wygranaSkos2=sprawdzSkos2(plansza,obecnySymbol);
                if (wygranaWiersze || wygranaKolumny || wygranaSkos1) {
                    System.out.println("Gratuluje" + obecnySymbol);

                    czyKontynuowac = false;

                }
                obecnySymbol = obecnySymbol == 'X' ? 'O' : 'X';
            }

        }
    }

    public static boolean sprawdzWiersze(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            boolean wygrana = true;

            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana) {
                return true;
            }
        }
        return false;
    }

    public static boolean sprawdzKolumna(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            boolean wygrana = true;
            for (int wiersz = 0; wiersz < wymiar; wiersz++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana)
                return true;
        }
        return false;
    }

    public static boolean sprawdzSkos1(char[][] plansza, char obecnySymbol) {
        int wymiar = plansza.length;
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            if (plansza[kolumna][kolumna] != obecnySymbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean ruchGracz1(char[][] plansza, char symbol) {
        System.out.println("Twoj ruch" + symbol);
        System.out.println("Podaj pozycje kolumna");
        int kolumna = new Scanner(System.in).nextInt();
        System.out.println("podaj wiersz");
        int wiersz = new Scanner(System.in).nextInt();
        boolean ruchPoprawny = plansza[wiersz][kolumna] == 0;
        if (!ruchPoprawny) {
            System.out.println("ruch niepoprawny");
            return false;
        }
        plansza[wiersz][kolumna] = symbol;
        return true;
    }

    public static void drukujPlansze(char[][] plansza, int wymiar) {
        System.out.print("\t");
        for (int k = 0; k < plansza.length; k++) {
            System.out.print(k + ":\t");
        }
        System.out.println();

        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            System.out.print(kolumna + ":\t ");
            for (int wiersz = 0; wiersz < wymiar; wiersz++) {

                //  String czyyKolko = (i % 2 == 0) ? "_ " : "_ ";
                System.out.print(plansza[kolumna][wiersz] + "\t");
            }
            System.out.println();
        }
    }

}

