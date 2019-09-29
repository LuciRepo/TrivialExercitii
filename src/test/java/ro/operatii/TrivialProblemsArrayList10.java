package ro.operatii;

import com.sun.jdi.IntegerValue;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TrivialProblemsArrayList10 {
    public static void main(String[] args) {


        // 16.	Sa se determine daca un numar este palindrom sau nu (cu ArrayList)

        // (palindrom = care citit de la stânga la dreapta sau de la dreapta la stânga rămâne neschimbat ex  4334)

       /* System.out.println("Dati numarul n");
        Scanner inNr = new Scanner(System.in);
        int nr = inNr.nextInt();
        ArrayList cifreNr = new ArrayList();
        ArrayList<Integer> sirCifre = new ArrayList<Integer>();
        int contor = 0;
        boolean isPalindrom = false;
        while (nr != 0) {
            sirCifre.add(nr % 10);
            nr = nr / 10;
            contor++;
        }
        System.out.println(sirCifre);
        System.out.println(contor);
        for (int i = 0; i < contor; i++) {
            if (sirCifre.get(i) != sirCifre.get(contor - i - 1)) {
                isPalindrom=false;
            } else {
                isPalindrom = true;
            }
        }
        if (isPalindrom == false) {
            System.out.println("Numarul citit nu este palindrom");
        } else {
            System.out.println("Numarul citit  este palindrom");
        }*/

        //20.	Sa se citeasca si sa se afiseze un sir de numere cu n elemente. (Cu ArrayList)

        /*System.out.println("Dati lungimea sirului n= ");
        ArrayList list= new ArrayList();
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        Scanner inNr = new Scanner(System.in);
        int listLenght=inNr.nextInt();
        System.out.println("Introduceti elementele sirului");
        for(int i=0;i<listLenght;i++){
            numbersList.add(inNr.nextInt());
        }
        System.out.println("Sirul de numere este: "+numbersList);*/


        //21.Sa se citeasca doua siruri de lungime n si sa se afiseze sirul care contine suma elementelor de pe pozitii identice.(Cu ArrayList)

        /*System.out.println("Dati lungimea celor doua siruri n=");
        Scanner inNr=new Scanner(System.in);
        int lenghtArrays=inNr.nextInt();
        ArrayList list=new ArrayList();
        ArrayList<Integer> listOne =new ArrayList<Integer>();
        ArrayList<Integer> listTwo =new ArrayList<Integer>();
        ArrayList<Integer> listSumOneTwo =new ArrayList<Integer>();
        System.out.println("Introduceti elementele primului sir ");
        for(int i=0;i<lenghtArrays;i++){
            listOne.add(inNr.nextInt());
        }
        System.out.println("Introduceti elementele celui de-al doilea sir ");
        for(int i=0;i<lenghtArrays;i++){
            listTwo.add(inNr.nextInt());
            listSumOneTwo.add(listOne.get(i)+listTwo.get(i));
        }
        System.out.println("Sirul cu suma elementelor, de pe pozitii identice, a celor doua siruri este "+listSumOneTwo);*/


        //22.	Sa se determine si sa se afiseze minimul dintr-un sir de numere citite de la tastatura.(cu ArrayList)

        /*System.out.println("Dati lungimea sirului de numere n=");
        ArrayList<Integer> listOne = new ArrayList<Integer>();
        Scanner inNr = new Scanner(System.in);
        int lenght = inNr.nextInt();
        System.out.println("Introduceti elementele sirului");
        for (int i = 0; i < lenght; i++) {
            listOne.add(inNr.nextInt());
        }
        int minimum = listOne.get(0);
        for (int i = 0; i < lenght; i++) {
            if (listOne.get(i) <= minimum) {
                minimum = listOne.get(i);
            } else {
            }
        }
        System.out.println(listOne);
        System.out.println("Minimul din sir este " + minimum);*/


        //23.	Sa se determine si sa se afiseze maximul dintr-un sir de numere citite de la tastatura.

        /*System.out.println("Dati lungimea sirului de numere n=");
        ArrayList<Integer> listOne = new ArrayList<Integer>();
        Scanner inNr = new Scanner(System.in);
        int lenght = inNr.nextInt();
        System.out.println("Introduceti elementele sirului");
        for (int i = 0; i < lenght; i++) {
            listOne.add(inNr.nextInt());
        }
        int maximum = listOne.get(0);
        for (int i = 0; i < lenght; i++) {
            if (listOne.get(i) >= maximum) {
                maximum = listOne.get(i);
            } else {
            }
        }
        System.out.println(listOne);
        System.out.println("Maximul din sir este " + maximum);*/


        //24.Se da un vector a1..an. Sa se determine nr. numerelor pozitive si suma lor, apartinand intervalului [a,b].

        /*System.out.println("Se citeste dimensiunea vectorului ");
        Scanner in = new Scanner(System.in);
        int lenghtVector = in.nextInt();
        System.out.println("Dati limita inferioara a intervalului a");
        int downLimit = in.nextInt();
        System.out.println("Dati limita superioara a intervalului b");
        int upLimit = in.nextInt();
        int sum = 0;
        ArrayList<Integer> vector = new ArrayList<Integer>();
        System.out.println("Introduceti elementele vectorului");
        for (int i = 0; i < lenghtVector; i++) {
            vector.add(in.nextInt());
        }
        //for (Integer tip : vector) {
           // if ((vector.indexOf(tip) >= downLimit) && (vector.indexOf(tip) < upLimit) && (vector.get(tip) > 0)) {
           //     sum = sum + vector.get(tip);
           // }else {
           // }
       // } //de intrebat la clasa
        for (int i=0;i<vector.size();i++){
            if (vector.get(i)>0&&i>=downLimit&&i<=upLimit)
                sum=sum+vector.get(i);
        }
        System.out.println("Suma elementelor prozitive ale vectorului cuprinse in intevalul dat este "+sum );*/


        //41.	(vectori: ) Se citeste un sir de numere. Sa se spuna pe ce pozitie se afla primul element 0.

       /* System.out.println("Dati dimensiunea sirului de numere");
        Scanner in = new Scanner(System.in);
        int sizeVector = in.nextInt();
        ArrayList<Integer> vector = new ArrayList<Integer>();
        System.out.println("Dati elementele vectorului");
        boolean noZero = false;
        for (int i = 0; i < sizeVector; i++) {
            vector.add(in.nextInt());
        }
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == 0) {
                System.out.println("Primul 0 este pe pozitia " + vector.indexOf(i));
                return;
            } else {
                noZero = true;
            }
        }
        if (noZero == true) {
            System.out.println("Vectorul nu are niciun element 0");
        }*/


        //42.	Se citeste o succesiune de numere pana la zero. Sa se adune cele pozitive, sa se numere cate negative.

        /*System.out.println("Introduceti primul numar");
        boolean zero = false;
        Integer contor=0;
        int sumPositive = 0;
        int countNegative = 0;
        ArrayList<Integer> succesiune=new ArrayList<Integer>();
        do {
            Scanner inNumbers = new Scanner(System.in);
            succesiune.add(inNumbers.nextInt());
            if (succesiune.get(contor) == 0) {
                zero = true;
            } else {
                System.out.println("Introduceti urmatorul numar ");
            }
            if (succesiune.get(contor) >= 0) {
                sumPositive += succesiune.get(contor);
            } else {
                countNegative++;
            }
            contor++;
        } while (zero == false);
        System.out.println("Suma elementelor pozitive din sir este " + sumPositive);
        System.out.println("Sirul contine " + countNegative + " elemente negative");*/


//46.	Se dau n numere. Sa se treaca toate 0 la coada

      /*  System.out.println("Dati numarul de numere citite n");
        Scanner in = new Scanner(System.in);
        int howMany = in.nextInt();
        ArrayList<Integer> sir = new ArrayList<Integer>();
        System.out.println("Introduceti  numerele");
        for (int i = 0; i < howMany; i++) {
            sir.add(in.nextInt());
        }
        for (int i = 0; i < sir.size(); i++) {
            sir.set(i, sir.get(i) * 10);
            System.out.println(sir.get(i));
        }*/


//59.	Sa se calc. m.a. a elementelor sirului a1..an, cuprinse intre a si b, a<b.

        System.out.println("Introduceti limita sirului n=");
        Scanner in = new Scanner(System.in);
        int sirLimit = in.nextInt();
        System.out.println("Introduceti limita inferioara a intervalului a");
        int a = in.nextInt();
        System.out.println("Introduceti limita superioara a intervalului b");
        int b = in.nextInt();
        ArrayList<Integer> sir = new ArrayList<Integer>();
        System.out.println("Introduceti elementele sirului");
        for (int i = 0; i < sirLimit; i++) {
            sir.add(in.nextInt());
        }
        double sumAverage = 0;
        double average;
        double count = 0;
        if (a > b || b >= sirLimit) {
            System.out.println("Intervalul introdus este incorect ");
            return;
        } else {
            for (int i = a; i <= b; i++) {
                sumAverage = sumAverage + sir.get(i);
                count++;
            }
            average = sumAverage / count;
            System.out.println("Media numerelor cuprinse intre pozitiile " + a + " si " + b + " este " + average);
        }
    }

}