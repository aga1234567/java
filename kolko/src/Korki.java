import java.util.Arrays;
import java.util.Scanner;

public class Korki {
    public static void main(String[] args) {


//        int[] tab = new int[10];
//        tab[0] = 5;
//        tab[1] = 7;
//        tab[2] = 9;
//        tab[3] = 8;
//        tab[4] = 3;
//        tab[5] = -60;
//        tab[6] = 25;
//        tab[7] = -8;
//        tab[8] = -3;
//        tab[9] = 1;
//        int suma = 0;
//        for (int index = 0; index < tab.length; index++) {
//            suma = suma + tab[index];
//            System.out.println(tab[index]);
//
//        }
//
//        System.out.println("suma" + suma);
//        int max = tab[0];
//        for (int index = 0; index < tab.length; index++) {
//            if (tab[index] > max) {
//                max = tab[index];
//            }
//        }
//        System.out.println(max);
//
//        int min = tab[0];
//        for (int index = 0; index < tab.length; index++) {
//            if (tab[index] < min) {
//                min = tab[index];
//            }
//        }
//        System.out.println("min =" + min);
//        System.out.println(Arrays.toString(tab));
////        for(int index=0;index<tab.length;index++){
////            for(int j = 0;j<tab.length-1;j++) {
////                if (tab[j] > tab[j + 1]) {
////                    int temp = tab[j + 1];
////                    tab[j + 1] = tab[j];
////                    tab[j] = temp;
////                }
////            }
////
////        }
////        System.out.println(Arrays.toString(tab));
//
//
//        for (int index = tab.length - 1; index > 0; index--) {
//            // System.out.println((tab[index]));
//
//
//        }
//        //int temp=0;
//        for (int index = 0; index < tab.length / 2; index++) {
//            int temp = tab[tab.length - index - 1];
//            tab[tab.length - index - 1] = tab[index];
//            tab[index] = temp;
//        }
//        System.out.println(Arrays.toString(tab));
        //  czyPalindrom();
        //System.out.println(czyKobieta());
        //czyKobieta();
        ticTacToe();


    }

    //  String wyraz="kajak";
    public static boolean czyPalindrom() {
        System.out.println("Podaj wyraz.");

        String wyraz = new Scanner(System.in).nextLine();
        System.out.println("sprawdzam czy palindrom");
        // System.out.println(czyPalindrom(wyraz));
        for (int index = 0; index < wyraz.length() / 2; index++) {
            if (wyraz.charAt(index) != wyraz.charAt(wyraz.length() - index - 1)) {
                System.out.println("Odpowiedz to nie palindrom ");
                return false;
            }

        }
        System.out.println("Palindrom");
        return true;
    }

    public static boolean czyKobieta() {
        System.out.println("Podaj imię:");
        String imie = new Scanner(System.in).nextLine();

        if (imie.charAt(imie.length() - 1) != 'a') {
            System.out.println("jestes facetem");
            return false;

        }

        System.out.println("jestes kobieta");
        return true;
    }

    public static void ticTacToe() {
        int n = 5;
        int m = 7;
        int[][] arr = new int[n][m];
        String print;
        for (m = 0; m < arr.length; m++) {
            for (n = 0; n < arr[m].length; n++) {
                print = (n %2== 0) ? "X " : "O ";
                System.out.print(print);
            }
            System.out.println();
        }


    }


}
