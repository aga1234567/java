package owoce;

import java.util.*;

public class OwoceMain {
    public static List<Owoce> arrOwoce;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        arrOwoce = new ArrayList<Owoce>();
        while (true) {
            System.out.println("1 - Dodaj owoc");
            System.out.println("2 - Usuń owoc");
            System.out.println("3 - Wyświetl wszystkie");
            System.out.println("4 - Sortuj");
            System.out.println("5 - Wyświetl max dni transportu");
            int polecenie = sc.nextInt();
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
                    wyświetlMaxDniTransportu();
                    break;
            }
        }
    }

    private static void dodaj() {
        Scanner si = new Scanner(System.in);
        Scanner so = new Scanner(System.in);
        System.out.println("Podaj rodzaj owocu");
        String rodzaj = si.nextLine();
        System.out.println("Podaj kolor");
        String kolor = si.nextLine();
        System.out.println("Podaj kraj pochodzenia");
        String krajPochodzenia = si.nextLine();
        System.out.println("Podaj wage");
        int wagaZamowienia = so.nextInt();
        System.out.println("Podaj czas transportu");
        int czasTransportu = so.nextInt();
        arrOwoce.add(new Owoce(rodzaj, kolor, krajPochodzenia, wagaZamowienia, czasTransportu));
    }

    private static void usun() {
        Scanner oc = new Scanner(System.in);
        System.out.println("Podaj ktory index do usuniecia");
        int delete = oc.nextInt();
        arrOwoce.remove(delete);
    }

    private static void wyswietl() {
        Iterator<Owoce> i = arrOwoce.iterator();
        while (i.hasNext()) {
            Owoce owoce = i.next();
            System.out.println(owoce);
        }
    }

    static void sortuj() {
        Collections.sort(arrOwoce, new Comparator<Owoce>() {
            @Override
            public int compare(Owoce o1, Owoce o2) {
                return Integer.valueOf(o2.getCzasTranstortu()).compareTo(o1.getCzasTranstortu());
            }
        });
        for (Owoce owoce : arrOwoce) {
            System.out.println(owoce);
        }
    }

    private static void wyświetlMaxDniTransportu() {
        Owoce max = arrOwoce.get(0);
        for (int i = 0; i < arrOwoce.size() - 1; i++) {
            if (arrOwoce.get(i).getCzasTranstortu() > max.getCzasTranstortu()) {
                max = arrOwoce.get(i);
            }
        }
        System.out.println(max);
    }
}
