package ro.operatii;

import java.util.Scanner;

public class SumNenule {
    public static void main(String[] args) {
        System.out.println("Dati numere -Oprire cu 0");
        Scanner in= new Scanner(System.in);
        int nr=0;
        int sum=0;
        do {
            nr=in.nextInt();
            sum=sum+nr;
        }
        while   (nr!=0);
        System.out.println("Suma este: "+sum);
    }
}
