package ro.operatii;

import java.util.Scanner;

public class Minim {
    public static void main(String[] args) {
        System.out.println("Dati 3 numere");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a <= b && a <= c) {
            System.out.println("Minimul este : " + a);
        } else {
            if (b <= a && b <= c) {
                System.out.println("Minimul este : " + b);
            } else {
                System.out.println("Minimul este : " + c);
            }
        }
    }
}
