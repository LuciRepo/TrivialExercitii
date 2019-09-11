package ro.operatii;

import java.util.Scanner;

public class ReadLimit {
    public static void main(String[] args) {
        System.out.println("Dati limita superioara ");
        Scanner in= new Scanner(System.in);
        int limita=in.nextInt() ;
        int produs=1;
        while (produs<limita){
            System.out.println(("Dati urmatorul numar"));
            int nr=in.nextInt();
            produs=produs*nr;
        }
        System.out.println("Produsul este "+produs);
    }
}
