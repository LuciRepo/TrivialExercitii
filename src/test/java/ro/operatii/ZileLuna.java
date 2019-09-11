package ro.operatii;

import java.util.Scanner;

public class ZileLuna {
    public static void main(String[] args) {
        System.out.println("Dati numarul lunii ");
        Scanner in = new Scanner(System.in);
        int nrLuna = in.nextInt();
        switch (nrLuna) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Luna are 31 de zile");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Luna are 30 de zile ");
                break;
            case 2:
                System.out.println("Luna are 28 sau 29 zile");
                break;
            default:
                System.out.println("Numar invalid");
        }
    }
}
