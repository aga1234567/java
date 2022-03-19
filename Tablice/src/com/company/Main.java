package com.company;

public class Main {

    public static void main(String[] args) {
        String tekst = "Ala ma kota";
        for(int i = tekst.length()-1;i>=0;i--) {
           // System.out.print(tekst.charAt(i));
        }
        String te ="Ala ma kota";
        char[] array = new char [te.length()];
        for(int j= array.length-1; j>=0;j--){
            array[j]=te.charAt(j);

           System.out.print(array[j]);
            char[] arr=new char[te.length()];
            //array[j]=arr[j];
            for(int k=array.length-1;k>=0;k--){
                arr[k]=te.charAt(k);
               // System.out.print(arr[k]);
            }
        }

    }
}
