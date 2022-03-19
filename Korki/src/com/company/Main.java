package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        Integer a = null;
       // print(a, i);
        zero(1,3,-4);
       // liczba();

        // write your code here
    }

    public static void print(Integer a, int i) {
        System.out.println("" + i);
        System.out.println("" + a);
    }

    public static void zero(int a, int b, int c) {
        int delta = b * b - 4 * a * c;
        System.out.println("delta="+delta);
        if (delta>0){
            double x1=(-b+ Math.sqrt(delta))/(2*a);
            double x2 = (-b- Math.sqrt(delta))/(2*a);
            System.out.println("Pierwszy pkt zerowy: "+x1);
            System.out.println("Drugi pkt zerowy"+x2);
        }
        else if (delta==0){

            double x3 = -b/2*a;
            System.out.println(x3);
        }
        else if (delta<0){
            System.out.println("To równanie nie ma rozwiązania");
        }

    }
    public static void liczba(){
       int firstLiczba=0;
        Scanner scat =  new Scanner(System.in);
        Random rand =new Random();
        int los= rand.nextInt(10);
        int licznik=0;
        do {
            licznik++;
            System.out.println("Podaj Liczbe:");
             firstLiczba = scat.nextInt();
            if(firstLiczba>los){
                System.out.println("za duzo");
            }
            else if(firstLiczba<los){
                System.out.println("Za mało ");
            }
            else if(firstLiczba==los){
                System.out.println("Zgadlas");
            }

        }
        while(firstLiczba!=los);

        System.out.println("Zgadłas za "+licznik);

        }


    }

