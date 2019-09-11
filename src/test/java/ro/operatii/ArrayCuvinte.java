package ro.operatii;

import java.util.Scanner;

public class ArrayCuvinte {
    public static void main(String[] args) {
        System.out.println("Dati cele 4 cuvinte");
        String[] cuvinte = new String[4];
        Scanner in = new Scanner(System.in);
        cuvinte[0] = in.nextLine();
        cuvinte[1] = in.nextLine();
        cuvinte[2] = in.nextLine();
        cuvinte[3] = in.nextLine();
        System.out.println(cuvinte[0] + " " + cuvinte[1] + " " + cuvinte[2] + " " + cuvinte[3] + ".");

    }
}
