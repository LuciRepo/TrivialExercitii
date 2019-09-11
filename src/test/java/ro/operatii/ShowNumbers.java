package ro.operatii;

import java.util.Scanner;

public class ShowNumbers {
    public static void main(String[] args) {
        System.out.println("Dati limita n");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        for (int i=0;i<n;i++){
          //  System.out.print(i+" ");
            System.out.println(i);
        }
    }
}
