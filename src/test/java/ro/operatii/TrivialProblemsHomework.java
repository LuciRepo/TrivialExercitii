package ro.operatii;

import java.sql.SQLOutput;
import java.util.Scanner;


public class TrivialProblemsHomework {
    public static void main(String[] args) {

        //1.	Sa se determine suma primelor 10 numere naturale

        /*int sum10 = 0;
        for (int i = 0; i <= 10; i++) {
            sum10 = sum10 + i;
        }
        System.out.println("Suma primelor 10 numere naturale este: " + sum10);*/

        //2.	Sa se determine suma primelor 100 numere naturale

       /* int sum100=0;
        for (int i=0;i<=100;i++){
            sum100=sum100+i;
        }
        System.out.println("Suma primelor 100 numere naturale este: " + sum100);*/

        //3.	Sa se determine suma primelor n numere naturale

        /*System.out.println("Dati limita naturala n= ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumN = 0;
        for (int i = 0; i <= n; i++) {
            sumN = sumN + i;
        }
        System.out.println("Suma primelor " + n + "  numere naturale este: " + sumN);*/

        //4.	Sa se determine suma primelor n numere pare

       /* System.out.println("Dati limita naturala n= ");
        Scanner in = new Scanner((System.in));
        int n = in.nextInt();
        int sumEvenN = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sumEvenN = sumEvenN + i;
            }
        }
        System.out.println("Suma primelor "+ n +"  numere pare este: " + sumEvenN);*/

        //5.	Sa se determine suma primelor n numere impare

        /*System.out.println("Dati limita naturala n= ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumOddN = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sumOddN = sumOddN + i;
            } else {

            }
        }
        System.out.println("Suma primelor "+n+"  numere naturale impare este: " + sumOddN);*/

        //6.	Sa se determine suma patratelor primelor n numere

       /* System.out.println("Dati limita naturala n= ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumSquareN = 0;
        for (int i = 0; i <= n; i++) {
            sumSquareN = sumSquareN + (i * i);
        }
        System.out.println("Suma patratelor primelor" +n+"  numere naturale este: "+sumSquareN);*/

        //  7.	Sa se determine suma cuburilor primelor n numere

        /*System.out.println("Dati limita naturala n= ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumCubeN = 0;
        for (int i = 0; i <= n; i++) {
            sumCubeN = sumCubeN + (i * i * i);
        }
        System.out.println("Suma cuburilor primelor"+ n +"  numere naturale este: " + sumCubeN);*/

        //8.	Sa se determine produsul primelor n numere naturale

        /*System.out.println("Dati limita naturala n= ");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        double multiplicationN=1;
        for(int i=1;i<=n;i++){
            multiplicationN*=i;
        }
        System.out.println("Produsul primelor "+n+" numere naturale este: "+multiplicationN);*/

        //9.	Sa se calculeze media aritmetica a n numere

      /*  System.out.println("La cate numere facem media aritmetica n= ");
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        double averageN=0;
        System.out.println("Dati cele "+n+" numere");
        for (int i=1;i<=n;i++){
           // System.out.println("Dati cele "+n+" numere");
            Scanner inNTimes=new Scanner(System.in);
            int number=in.nextInt();
            averageN=averageN+number;
        }

        System.out.println("Media aritmetica a celor "+n+" numere date este: "+averageN/n);*/

        //10.	Factorialul unui numar n n!=1*2*3*...*n

       /* System.out.println("Dati limita naturala n= ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double factorialN = 1;
        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }
        System.out.println(n+" ! "+"este egal cu "+factorialN);*/

        //11.	Sa se verifice daca un numar n diferit de 0 sau 1 este prim sau nu.

        /*System.out.println("Dati un numar natural n= ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("Dati un numar n diferit de 1 sau 0");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    i=n-1;
                    System.out.println("Numarul " + n + " nu este prim");
                } else {
                    System.out.println("Numarul "+n+" este prim");
                    i=n-1;
                }
            }
        }*/

        //12.	Sa se afiseze cifrele unui numar (Cum punem cifrele obtinute in bucla while intr-un array)

       /* System.out.println("Dati numarul n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 0) {
            System.out.println(n % 10 + " ");
            n = n / 10;
        }*/

        //13.	Sa se afiseze cifra maxima a unui numar

       /* System.out.println("Dati numarul natural n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rest;
        int maximum = 0;
        while (n != 0) {
            rest=n%10;
            if (rest >= maximum) {
            maximum=rest;
            }else{

            }
            n=n/10;
        }
        System.out.println("Cifra cea mai mare este: "+maximum);*/

        //14.	Sa se afiseze cifra minima a unui numar.

        /*System.out.println("Dati numarul natural n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rest;
        int minimum = 10;
        while (n != 0) {
            rest = n % 10;
            if (rest <= minimum) {
                minimum = rest;
            } else {
            }
            n=n/10;
        }
        System.out.println("Cea mai mica cifra a numarului este: "+minimum);*/

        //15.	Sa se afiseze inversul unui numar dat.

        /*System.out.println("Dati numarul n");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("1/"+n);*/

        //15.	Sa se afiseze inversul unui numar dat.Rezolvare la clasa

        /*System.out.println("Dati numarul n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rest;
        int newNumber=0;
        int contor = 0;
        while (n != 0) {
            rest = n % 10;
            n = n / 10;
            newNumber = newNumber * 10 + rest;
            /*contor++;
            for (int i=1;i<1;i++){   //construim numarul invers
                newNumber=i*10+rest;
                System.out.println(newNumber);
            }
            System.out.print(rest);*/
        // }
        //  System.out.println("Inversul este " + newNumber);

        //  System.out.println("1/"+n);

        // 16.	Sa se determine daca un numar este palindrom sau nu

        // (palindrom = care citit de la stânga la dreapta sau de la dreapta la stânga rămâne neschimbat ex  4334)
        /*System.out.println("Dati numarul n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cloneN = n;
        int digitsNo = 0;
        while (cloneN != 0) { // trebuie sa aflam numarul de cifre pentru a initializa sirul cu dimeniune
            digitsNo++;
            cloneN = cloneN / 10;
        }
        System.out.println("Numarul " + n + " are " + digitsNo + " cifre");
        String[] arrayN = new String[digitsNo];
        for (int i = 0; i < digitsNo; i++) {
            String rest;
            rest = String.valueOf(n % 10);
            arrayN[i] = rest;
            n = n / 10;
            // System.out.print(arrayN[i]+" ");
        }
        for (int i = 0; i < digitsNo; i++) {
           // System.out.println(arrayN[i]+" ");
            if ( Integer.valueOf(arrayN[i]) != Integer.valueOf(arrayN[(digitsNo-i-1)])) {
                System.out.println("Numarul dat nu este palisandru");
                i=digitsNo;
            }
            else {
                System.out.println("Numarul dat este palisandru");
                i=digitsNo;
            }
            //System.out.print(arrayN[(digitsNo - i)] + " ");
        }*/

        //17.	Sa se calculeze suma inverselor primelor n numere naturale

       /* System.out.println("Dati limita naturala n");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       double sumOfInverse= 0;
        for(double i=1;i<=n;i++){
            sumOfInverse=(sumOfInverse+(1/i));
           // System.out.println(1/i);
        }
        System.out.println("Suma inverelor primelor "+n+" numere naturele este "+sumOfInverse);*/

        //18.	Sa se calculeze suma inverselor patratelor primelor n numere naturale

       /* System.out.println("Dati limita naturala n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sumOfSquareInverse = 0;
        for (double i = 1; i <= n; i++) {
            sumOfSquareInverse = (sumOfSquareInverse + (1 / (i * i)));
            // System.out.println(1/i);
        }
        System.out.println("Suma inverselor primelor " + n + " numere naturele este " + sumOfSquareInverse);*/

        //  19.	Dandu-se un numar n sa se afiseze daca este par sau nu

       /* System.out.println("Dati numarul n");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("Numarul "+n+" este par");
        }else {
            System.out.println("Numarul "+n+" este impar");
        }*/

        //20.	Sa se citeasca si sa se afiseze un sir de numere cu n elemente.

        /*System.out.println("Dati lungimea sirului n=");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String [] arrayN=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Introduceti elementul de pe pozitia "+i);
            Scanner inArray=new Scanner(System.in);
            int arrayElement=in.nextInt();
            String string;
            string=String.valueOf(arrayElement);
            arrayN[i]=string;
        }
        System.out.println("Elementele sirului sunt ");
        for(int i=0;i<n;i++){
            System.out.print(arrayN[i]+" ");
        }*/

        //21.Sa se citeasca doua siruri de lungime n sis a se afiseze sirul care contine suma elementelor de pe pozitii identice.

        /*System.out.println("Dati lungimea celor doua siruri n=");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arrayOne = new String[n];
        String[] arrayTwo = new String[n];
        String[] arraySum = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti in primul sir elementul de pe pozitia " + i);
            Scanner inArrayOne = new Scanner(System.in);
            int arrayOneElement = in.nextInt();
            String convertToString;
            convertToString = String.valueOf(arrayOneElement);
            arrayOne[i] = convertToString;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti in al doilea sir elementul de pe pozitia " + i);
            Scanner inArrayTwo = new Scanner(System.in);
            int arrayTwoElement = in.nextInt();
            String convertToString;
            convertToString = String.valueOf(arrayTwoElement);
            arrayTwo[i] = convertToString;
        }
        System.out.println("Sirul cu suma suma elementelor primelor doua siruri este ");
        for (int i = 0; i < n; i++) {
            int convertToInt;
            String convertToString;
            convertToInt = Integer.valueOf(arrayOne[i]) + Integer.valueOf(arrayTwo[i]);
            convertToString = String.valueOf(convertToInt);
            arraySum[i] = convertToString;
            System.out.print(arraySum[i] + " ");
        }*/

        //22.	Sa se determine si sa se afiseze minimul dintr-un sir de numere citite de la tastatura.

       /* System.out.println("Dati lungimea sirului de numere n=");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] array = new String[n]; //int array[]=new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti in sir elementul de pe pozitia " + i);
            Scanner inArray = new Scanner(System.in); // nu e cazul sa mai fie definit
            int arrayElement = in.nextInt(); //int arrayElement=in.nextInt();
            String convertToString;
            convertToString = String.valueOf(arrayElement);
            array[i] = convertToString;
        }
        int minimum = Integer.valueOf(array[0]);
        for (int i = 0; i < n; i++) {
            if(Integer.valueOf(array[i])<=minimum){
                minimum=Integer.valueOf(array[i]);
            }
        }
        System.out.println("Minimul dintre elementele sirului este: "+minimum);*/


        //22.	Sa se determine si sa se afiseze minimul dintr-un sir de numere citite de la tastatura. Rezolvare la clasa

       /* System.out.println("Dati lungimea sirului de numere n=");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n]; //int array[]=new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti in sir elementul de pe pozitia " + i);
           // Scanner inArray = new Scanner(System.in); nu e cazul , a fost definit deja
            int arrayElement = in.nextInt(); //int arrayElement=in.nextInt();
            array[i] = arrayElement;
        }
        int minimum = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] <= minimum) {
                minimum = array[i];
            }
        }
        System.out.println("Minimul dintre elementele sirului este: " + minimum);*/

        //23.	Sa se determine si sa se afiseze maximul dintr-un sir de numere citite de la tastatura.

        /*System.out.println("Dati lungimea sirului de numere n=");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti in sir elementul de pe pozitia " + i);
            Scanner inArray = new Scanner(System.in);
            int arrayElement = in.nextInt();
            String convertToString;
            convertToString = String.valueOf(arrayElement);
            array[i] = convertToString;
        }
        int maximum = Integer.valueOf(array[1]);
        for (int i = 0; i < n; i++) {
            if(Integer.valueOf(array[i])>=maximum){
                maximum=Integer.valueOf(array[i]);
            }
        }
        System.out.println("Maximul dintre eelementele sirului este: "+maximum);*/

        //23.	Sa se determine si sa se afiseze maximul dintr-un sir de numere citite de la tastatura. Rezolvat la clasa

      /*  System.out.println("Dati lungimea sirului de numere n=");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti in sir elementul de pe pozitia " + i);
            //Scanner inArray = new Scanner(System.in); nu e cazul
            int arrayElement = in.nextInt();
            // String convertToString; nu e cazul
            //convertToString = String.valueOf(arrayElement); nu e cazul
            array[i] = arrayElement;
        }
        int maximum = array[0];
        int minimum = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] >= maximum) {
                maximum = array[i];
            } else {
                if (array[i] < minimum) {
                    minimum = array[i];
                } else {
                }
            }
        }
        System.out.println("Maximul dintre elementele sirului este: " + maximum);
        System.out.println("Minimul dintre elementele sirului este: "+ minimum);*/

        //24.Se da un vector a1..an. Sa se determine nr. numerelor pozitive si suma lor, apartinand intervalului [a,b].

       /* System.out.println("Introduceti numarul de elemente ale vectorului");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Introduceti valoarea inferioara a intervalului");
        Scanner inSmallValue = new Scanner(System.in);
        int smallValue = in.nextInt();
        System.out.println("Introduceti valoarea superioara a intervalului");
        Scanner inBigValue = new Scanner(System.in);
        int bigValue = in.nextInt();
        if (smallValue > bigValue ||smallValue<0|| smallValue >=n || bigValue >=n) {
            System.out.println("Valorile introduse nu sunt corecte");
            return;
        }

        String[] vector = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti in vector elementul de pe pozitia " + i);
            Scanner inElements = new Scanner(System.in);
            int element = in.nextInt();
            String convertToString;
            convertToString = Integer.toString(element);
            vector[i] = convertToString;
        }
        int countPositiveElements = 0;
        int sumPositiveElements = 0;
        for (int i = smallValue; i <= bigValue; i++) {
            if (Integer.valueOf(vector[i]) > 0) {
                countPositiveElements++;
                sumPositiveElements = sumPositiveElements + Integer.valueOf(vector[i]);
            }
        }
        System.out.println("Intervalul [" + smallValue + "," + bigValue + "]" + "contine " + countPositiveElements + " elemente pozitive a caror suma este " + sumPositiveElements);*/

        //25.	Dandu-se a si b, sa se determine suma, produsul si media lor aritmetica

        /*System.out.println("Introcuceti cele 2 numere");
        Scanner inFirstNumber = new Scanner(System.in);
        double firstNumber = inFirstNumber.nextDouble();
        Scanner inSecondNumber = new Scanner(System.in);
        int secondNumber = inSecondNumber.nextInt();
        System.out.println("Suma numerelor este " + (firstNumber + secondNumber));
        System.out.println("Produsul numerrelor este :" + (firstNumber * secondNumber));
        System.out.println("Media numerelor este " + (firstNumber + secondNumber) / 2);*/

        //26.	Se da un numar a. Sa se determine primii 10 multiplii ai lui. (prin adunare, apoi prin inmultire)

        /*System.out.println("Introduceti numarul n");
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double cloneN = n;
        System.out.println("Primii 10 multipli, prin adunare, ai lui " + n + " " + "sunt ");
        for (int i = 1; i <= 10; i++) {
            n = n + cloneN;
            System.out.print(n + " ");
        }
        n=cloneN;
        System.out.println("");
        System.out.println("Primii 10 multipli, prin inmultire, ai lui " + n + " " + "sunt ");
        for (int i=1;i<=10;i++){
            n=n*cloneN;
            System.out.print(n+" ");
        } */

        // 27.	Se considera trei numere a, b, c. Sa se afiseze cel mai mare dintre ele.

       /* System.out.println("Introcuceti cele 3 numere");
        Scanner inFirstNumber = new Scanner(System.in);
        double firstNumber = inFirstNumber.nextDouble();
        Scanner inSecondNumber = new Scanner(System.in);
        int secondNumber = inSecondNumber.nextInt();
        Scanner inThirdNumber = new Scanner(System.in);
        int thirdNumber = inThirdNumber.nextInt();
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Cel mai mare numar este " + firstNumber);
        } else {
        }
        if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Cel mai mare numar este " + secondNumber);
        } else {
        }
        if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
            System.out.println("Cel mai mare numar este " + thirdNumber);
        } else {
        }*/

        //28.	Dandu-se un numar n sa se afiseze daca este impar sau nu

     /*   System.out.println("introduceti numarul n ");
        Scanner in=new Scanner(System.in);
        double n=in.nextDouble();
        if(n%2!=0){
            System.out.println("Numarul "+n+" este impar");
        }else {
            System.out.println("Numarul "+n+" este par");
        }*/

        //  29.	Dandu-se un numar n sa se afiseze daca este divizibil cu 3

        /*System.out.println("Introduceti numarul n");
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        if (n % 3 == 0) {
            System.out.println("Numarul " + n +" este divizibil cu 3");
        } else {
            System.out.println("Numarul "+n+" nu este divizibil cu 3");
        }*/

        //30.	Care este cel mai mic numar prim mai mare ca 1000?

        /*double n = 1009;
        boolean prime = false;
        double i = 2;
        while (i <=n / 2) {
            if (n % i == 0) {
                System.out.println("Numarul " + n + " nu este prim");
                prime = false;
                return;
            } else {
                i++;
                prime = true;
            }
        }
        if (prime = true) {
            System.out.println("Numarul " + n + " este prim");
        }*/

        //31.	Sa se afiseze toti divizorii numarului n, dat

        /*System.out.println("introduceti numarul n ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " este divizor al lui " + n);
            } else {
            }
        }*/

        //32.	Sa se afiseze toti divizorii primi ai numarului n, dat

       /* System.out.println("introduceti numarul n ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean prime = false;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                for (int a = 2; a <= i / 2; a++) {
                    if (i % a == 0) {
                        prime = false;
                        return;
                    } else {
                        a++;
                        prime = true;
                    }
                }
                if (prime = true) {
                    System.out.println(i + " este divizor prim al lui " + n);
                } else {
                }
            } else {
            }
        }*/

        //33.	Sa se afiseze toate numerele prime mai mici ca n, dat . Rezolvat la clasa.

        /*System.out.println("Introduceti numarul n");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 1; i <= number; i++) {
            boolean prime = true;
            for (int j = 2; j < i/2; j++) { //mergem pana la jumatate sau pana la modul din radical din i
                if (i % j == 0) {
                    prime = false;
                }
            }

            if (prime == true) {
                System.out.println("Numar prim mai mic decat "+number+" este "+i);
            }
        }*/


        // 34.	sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17 iar al doilea cu 19.

        /*for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if ((i + j) == 1000 && (i % 17 == 0) && (j % 19 == 0)) {
                    System.out.println(i + " " + j);
                } else {
                }
            }
        }*/

        // 35.	sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17 sau cu 13 iar al doilea cu 19 sau cu 7.


        /*System.out.println("Numerele a caror suma este 1000 si primul e divizibil cu 17 sau 13 iar al doilea cu 19 sau 7, sunt:");
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if ((i + j) == 1000 && ((i % 17 == 0) || i % 13 == 0) && ((j % 19 == 0) || (j % 7 == 0))) {
                    System.out.println(i + "  " + j);
                } else {
                }
            }
        }*/

        //36.	Sa se gaseasca numarul abc pentru care a2+b2+c2=a+b+c

       /* for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if ((i * i) + (j * j) + (k * k) == (i + j + k)) {
                        System.out.println(i + " " + j + " " + k);
                    } else {

                    }
                }
            }
        }*/

        //37.	sa se genereze toate numerele de 4 cifre de forma 3a2b care se divid cu 9

        /*System.out.println("Numerele divizibile cu 9 de forma 3a2b sunt: ");
       for (int i=3020;i<3930;i++){
           if(i%9==0){
               System.out.println(i);
           }
           else{}
       }*/

        //38.	Sa se gaseasca perechile de cifre a si b pentru care numarul 7ab3 sa fie divizibil cu 7 si cu 3

       /* System.out.println("Perechile de cifre pentru care numarul 7ab3 sa fie divizibil cu 7 si cu 3, sunt");
        String[] arrayN = new String[4];
        int digitOne;
        int digitTwo;
        for (int i = 7003; i <= 7993; i++) {
            if ((i % 7 == 0) && (i % 3 == 0)) {
                int cloneI = i;
                //System.out.println(cloneI);
                for (int j = 0; j < 4; j++) {

                    String convertToString;
                    convertToString = Integer.toString(((cloneI % 10)));
                    arrayN[j] = convertToString;
                    cloneI = cloneI / 10;
                }

                System.out.println("" + arrayN[2] + " " + arrayN[1]);
            } else {
            }
        }*/

//39.	Se da un numar x. Sa se afle daca apartine intervalului [a,b] (2 variante: cu AND si fara AND)

       /* System.out.println("Dati numarul n");
        Scanner inNumber = new Scanner(System.in);
        int n = inNumber.nextInt();
        System.out.println("Dati valoarea inferioara a intervalului");
        Scanner inSmallValue = new Scanner(System.in);
        int smallValue = inSmallValue.nextInt();
        System.out.println("Dati valoarea superioara a intervalului");
        Scanner inBigValue = new Scanner(System.in);
        int bigValue = inBigValue.nextInt();
        boolean belong = true;
        if (smallValue > bigValue || ((smallValue * -1) < (bigValue * -1))) {
            System.out.println("Ati introdus un interval gresit");
            return;
        } else {
            if ((n >= smallValue) && (n <= bigValue)) {
                System.out.println("Metoda cu AND :Numarul " + n + " apartine intervalului [" + smallValue + "," + bigValue + "]");
            } else {
                System.out.println("Metoda cu AND: Numarul " + n + " nu apartine intervalului [" + smallValue + "," + bigValue + "]");
            }
            //metoda fara AND
            for (int i = smallValue; i <= bigValue; i++) {
                if (i == n) {
                    // System.out.println(smallValue + "  " + bigValue);
                    System.out.println("Metoda fara AND: Numarul " + n + " apartine intervalului [" + smallValue + "," + bigValue + "]");
                    return;
                } else {
                    belong = false;
                }
            }
            if (belong == false) {
                System.out.println("Metoda fara AND: Numarul " + n + " nu apartine intervalului [" + smallValue + "," + bigValue + "]");
            } else {

            }
        }*/

        //40.	Se da un numar x. Sa se afle daca NU apartine intervalului [a,b] (2 variante: cu OR si fara OR)

        /*System.out.println("Dati numarul n");
        Scanner inNumber = new Scanner(System.in);
        int n = inNumber.nextInt();
        System.out.println("Dati valoarea inferioara a intervalului");
        Scanner inSmallValue = new Scanner(System.in);
        int smallValue = inSmallValue.nextInt();
        System.out.println("Dati valoarea superioara a intervalului");
        Scanner inBigValue = new Scanner(System.in);
        int bigValue = inBigValue.nextInt();
        boolean belong = true;
        if (smallValue > bigValue || ((smallValue * -1) < (bigValue * -1))) {
            System.out.println("Ati introdus un interval gresit");
            return;
        } else {
            if ((n < smallValue) || (n > bigValue)) {
                System.out.println("Metoda cu OR :Numarul " + n + " nu apartine intervalului [" + smallValue + "," + bigValue + "]");
            } else {
                System.out.println("Metoda cu OR: Numarul " + n + "  apartine intervalului [" + smallValue + "," + bigValue + "]");
            }
            //metoda fara OR
            for (int i = smallValue; i <= bigValue; i++) {
                if (i == n) {
                    // System.out.println(smallValue + "  " + bigValue);
                    System.out.println("Metoda fara OR: Numarul " + n + " apartine intervalului [" + smallValue + "," + bigValue + "]");
                    return;
                } else {
                    belong = false;
                }
            }
            if (belong == false) {
                System.out.println("Metoda fara OR: Numarul " + n + " nu apartine intervalului [" + smallValue + "," + bigValue + "]");
            } else {

            }
        }*/

        //41.	(vectori: ) Se citeste un sir de numere. Sa se spuna pe ce pozitie se afla primul element 0.

        /*System.out.println("Dati dimeniunea sirului de numere  ");
        Scanner inElementsNumber = new Scanner(System.in);
        int elementsNumber = inElementsNumber.nextInt();
        if (elementsNumber < 0) {
            System.out.println("Trebuie sa introduceti un numar pozitiv");
            return;
        } else {
            String[] vector = new String[elementsNumber];
            int elementPosition = 0;
            boolean zero = true;
            String convertToString;

            System.out.println("Introduceti elementele sirului ");
            for (int i = 0; i < elementsNumber; i++) {
                Scanner inElements = new Scanner(System.in);
                int elements = inElements.nextInt();
                if (elements == 0) {
                    System.out.println("Primul 0 a aparut pe pozitia " + i);
                    zero = true;
                    return;
                } else {
                    zero = false;
                }
            }
            if (zero == false) {
                System.out.println("Sirul de numere nu contine elementul " + 0);
            } else {
            }
        }*/


        //41.	(vectori: ) Se citeste un sir de numere. Sa se spuna pe ce pozitie se afla primul element 0. Rezolvat la clasa

     /*   System.out.println("Dati dimeniunea sirului de numere  ");
        Scanner inElementsNumber = new Scanner(System.in);
        int elementsNumber = inElementsNumber.nextInt();
        if (elementsNumber < 0) {
            System.out.println("Trebuie sa introduceti un numar pozitiv");
            return;
        } else {
            int[] vector = new int[elementsNumber];
            int elementPosition = 0;
            boolean zero = true;
            //  String convertToString;

            System.out.println("Introduceti elementele sirului ");
            for (int i = 0; i < elementsNumber; i++) {
               // System.out.println("Dati elementele sirului ");
                vector[i] = inElementsNumber.nextInt();
            }
            int contor = 0;
            while (contor<elementsNumber&&vector[contor] != 0) {
                contor++;
            }
            if (contor==elementsNumber){
                System.out.println("Nu exista niciun 0");
            }else {
                System.out.println("Pozitia primului 0 este " + contor);
            }
        }*/


        //42.	Se citeste o succesiune de numere pana la zero. Sa se adune cele pozitive, sa se numere cate negative.

       /* System.out.println("Introduceti primul numar");
        boolean zero = false;
        int sumPositive = 0;
        int countNegative = 0;
        do {
            Scanner inNumbers = new Scanner(System.in);
            int numbers = inNumbers.nextInt();
            if (numbers == 0) {
                zero = true;
            } else {
                System.out.println("Introduceti urmatorul numar ");
            }
            if (numbers >= 0) {
                sumPositive += numbers;
            } else {
                countNegative++;
            }
        } while (zero == false);
        System.out.println("Suma elementelor pozitive din sir este " + sumPositive);
        System.out.println("Sirul contine " + countNegative + " elemente negative");*/

        //43.	Sa se determine trei numere x,y,z direct proportionale cu a,b,c si a caror suma este S.
        // (indicatie: (x,y,z) direct prop cu (a,b,c) => x/a=y/b=z/c=s/(a+b+c) => x=s*a/(a+b+c);   y=b*x/a; z=c*x/a)
        //rezolvare incompleta....!!!!

        /*double sumXYZ=0;
        double proportionalA=0;
        double proportionalB=0;
        double proportionalC=0;
        System.out.println("Introduceti primul numar a");
        Scanner inA=new Scanner(System.in);
        double a=inA.nextDouble();
        System.out.println("Introduceti cel de-al doilea numar b");
        Scanner inB=new Scanner(System.in);
        double b=inB.nextDouble();
        System.out.println("Introduceti cel de-al treilea numar c");
        Scanner inC=new Scanner(System.in);
        double c=inC.nextDouble(
        int contor=0;
        while((a+b+c)<=sumXYZ){
            proportionalA++;
            proportionalB++;
            proportionalC++;
            sumXYZ=proportionalA+proportionalB+proportionalC;
            if(proportionalA%a==0 &&proportionalB%b==0 && proportionalC%c==0){
                System.out.println(proportionalA+" "+proportionalB+" "+proportionalC);
            }
        }*/


        //44.	Se da un sir de n numere intregi. Sa se calculeze urmatoarele sume:
        // a celor care se afla inaintea primului element =0; a celor care se afla intre 2 elemente nule, consecutive.

       /* System.out.println("Dati limita sirului de numere intregi n");
        Scanner inN = new Scanner(System.in);
        int n = inN.nextInt();
        int[] array = new int[n];
        int sumBefore0 = 0;
        int contor = 0;
        int sumBetween0 = 0;
        System.out.println("Introduceti elementele sirului ");
        for (int i = 0; i < n; i++) {
            array[i] = inN.nextInt();
        }
        while (array[contor] != 0) {
            sumBefore0 = sumBefore0 + array[contor];
            contor++;
        }
        System.out.println("Suma elementelor inainte de primul 0 este " + sumBefore0);
        System.out.println(contor);
        for(int j=(contor+1);j<n;j++){
            if (array[j]!=0){
                sumBetween0=sumBetween0+array[j];
            }else {
                System.out.println("Suma elementelor intre doua elemente de 0 este "+sumBetween0);
            }
        }*/



//45.	Permutarea a doua variabile

        /*System.out.print("Introduceti prima variabila ");
        Scanner in=new Scanner(System.in);
        int firstVariable=in.nextInt();
        System.out.print("Introduceti cea de-a doua variabila ");
        int secondVariable=in.nextInt();
        //int sum=firstVariable+secondVariable;
        firstVariable=firstVariable+secondVariable;
        secondVariable=firstVariable-secondVariable;
        firstVariable=firstVariable-secondVariable;
        System.out.println(firstVariable+" "+secondVariable);*/ //Gazeta de informatica


//46.	Se dau n numere. Sa se treaca toate 0 la coada

        /*System.out.println("Dati valoarea n");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Introduceti un numar");
            Scanner inNumar=new Scanner(System.in);
            int numar=in.nextInt();
            System.out.println("Generam "+numar+"0");
        }*/

//47.	Se dau n numere. Sa se faca produsul P al celor diferite de zero. In caz ca toate sunt nule sa se specifice acest lucru.
// Numerele se vor citi unul cate unul.(se poate folosi un K=0 initial, semafor pt. cazul cand toate sunt nule. K=1 daca nr<>0.)

       /* int produs = 1;
        int k = 0;
        System.out.println("Dati valoarea n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Introduceti un numar");
            Scanner inNumar = new Scanner(System.in);
            int numar = in.nextInt();
            if (numar != 0) {
                produs = produs * numar;
            } else {
                k++;
            }
        }

        if (k == n) {
            System.out.println("Toate numerele introduse sunt nule ");
        } else {
            System.out.println("Produsul numerelor diferite de zero, introduse, este " + produs);
        }*/

//48.	Se da o succesiune de n numere.
// Sa se calculeze raportul dintre suma celor impare si produsul celor pare. Citirea se face element cu element.

        /*int sumNumber=0;
        double multiplicationNumber=1;
        double divideSumAndMulti;
        System.out.println("Dati valoarea n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Introduceti un numar");
            Scanner inNumber = new Scanner(System.in);
            int number = in.nextInt();
            if ((number%2==0)&&(number!=0)) {
                multiplicationNumber = multiplicationNumber * number;
            } else {
                sumNumber=sumNumber+number;
            }
        }
            divideSumAndMulti=sumNumber/multiplicationNumber;
        System.out.println("Raportul dintre suma numerelor impare si produsul celor pare este "+divideSumAndMulti);*/

//49.	Suma S=12+22+32+…+n2

        /*System.out.println("Introduceti numarul n");
        Scanner inNumber=new Scanner(System.in);
        int number=inNumber.nextInt();
        int sumNumber=0;
        for(int i=1;i<=number;i++){
            sumNumber=sumNumber+(i*10+2);
        }
        System.out.println("Suma este "+sumNumber);*/

//50.	Suma S=12+32+52+…+(2n+1)2

        /*System.out.println("Introduceti numarul n");
        Scanner inNumber=new Scanner(System.in);
        int number=inNumber.nextInt();
        int sumNumber=0;
        for(int i=0;i<number;i++){
            sumNumber=sumNumber+((2*i+1)*10+2);
        }
        System.out.println("Suma este "+sumNumber);*/

//51.	Suma S=1+1*2+1*2*3+…+1*2*3*…*n

      /* System.out.println("Introduceti numarul n");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int sumFactorialN = 0;
        int produsNumber = 1;
            for (int i = 1; i <=number; i++) {
                produsNumber = produsNumber *i;
                System.out.println(produsNumber);
            sumFactorialN = sumFactorialN + produsNumber;
        }
        System.out.println("Suma este " + sumFactorialN);*/

//51.	Suma S=1+1*2+1*2*3+…+1*2*3*…*n Rezolvare la clasa

        /*System.out.println("Introduceti numarul n");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int sumFactorialN = 0;

        for (int i = 1; i <= number; i++) {
            int produsNumber = 1;

            //System.out.println(produsNumber);
            for (int j = 1; j <= i; j++) {
                produsNumber = produsNumber * j;
            }

            sumFactorialN = sumFactorialN + produsNumber;

        }
        System.out.println("Suma este " + sumFactorialN);*/

//52.	Suma S=1+ 2/1*2 +3/1*2*3 + …+ n/1*2*3*…*n

        /*System.out.println("Introduceti numarul n");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        double sumFactorialN = 0;
        float produsNumber = 1.0f;
        float divideNumber=1.0f;
        for (float i = 1; i <=number; i++) {
            produsNumber =produsNumber *i;
            divideNumber=i/produsNumber;
            System.out.println("Produs "+produsNumber);
            System.out.println("Impartire "+divideNumber);
            sumFactorialN = sumFactorialN + divideNumber;
        }
        System.out.println("Suma este " + sumFactorialN);*/

//53.	Sa se tranfsorme un numar n din baza 10 in 2.

        /*System.out.println("Dati numarul in baza 10 n= ");
        Scanner inNumber10=new Scanner(System.in);
        int number10=inNumber10.nextInt();
        String convertToString;
        int count=-1;
        int position=0;
        String[] arrayNumber2=new String[number10];
        while (number10>0){
            convertToString=String.valueOf((number10%2));
            arrayNumber2[position]=convertToString;
            number10=number10/2;
            count++;
            position++;
        }
        System.out.println("Numarul introdus,  transformat in baza 2 este: ");
        for (int i=count;i>=0;i--){
            System.out.print(arrayNumber2[i]+" ");
        }*/

//54.	sa se afiseze daca un numar n e divizibil cu : 5, 7

        /*System.out.println("Dati un numar n= ");
        Scanner inN = new Scanner(System.in);
        double n = inN.nextDouble();
        if (((n * 10) % 57) == 0){
            System.out.println("Numarul " + n + " este divizibil cu 5,7");
        } else{
            System.out.println("Numarul " + n + "  nu este divizibil cu 5,7");

        }*/

//55.	sa se afiseze daca un numar a e divizibil cu : b; a+3 cu b; a-b cu 5; a*b cu c

        /*System.out.println("Dati numarul a ");
        Scanner inA = new Scanner(System.in);
        double a = inA.nextDouble();
        System.out.println("Dati numarul b ");
        Scanner inB = new Scanner(System.in);
        double b = inB.nextDouble();
        System.out.println("Dati numarul c ");
        Scanner inC = new Scanner(System.in);
        double c = inC.nextDouble();

        if (a % b == 0) {
            System.out.println("Numarul " + a + " este divizibil cu " + b);
        } else {
            System.out.println("Numarul " + a + " nu este divizibil cu " + b);
        }
        if ((a + 3) % b == 0) {
            System.out.println("Numarul " + (a + 3) + " este divizibil cu " + b);
        } else {
            System.out.println("Numarul " + (a + 3) + " nu este divizibil cu " + b);
        }
        if ((a - b) % 5 == 0) {
            System.out.println("Numarul " + (a - b) + " este divizibil cu " + 5);
        } else {
            System.out.println("Numarul " + (a - b) + " nu este divizibil cu " + 5);
        }
        if ((a * b) % c == 0) {
            System.out.println("Numarul " + (a * b) + " este divizibil cu " + c);
        } else {
            System.out.println("Numarul " + (a * b) + " nu este divizibil cu " + c);
        }*/

//56.	sa se afiseze dif dintre x si y daca x>y si suma lor daca x<y

        /*System.out.println("Dati numarul x ");
        Scanner inX = new Scanner(System.in);
        double x = inX.nextDouble();
        System.out.println("Dati numarul y ");
        Scanner inY = new Scanner(System.in);
        double y = inY.nextDouble();
        if(x>y){
            System.out.println("Diferenta dintre x si y este "+ (x-y));
        }else {
            System.out.println("Suma dintre x si y este "+(x+y));
        }*/

//57.	sa se afle val functiei: f={ max(x,y), pt. x<y; 0 pt. x=y; min(x,y) pt. x>y

       /* System.out.println("Dati numarul x ");
        Scanner inX = new Scanner(System.in);
        double x = inX.nextDouble();
        System.out.println("Dati numarul y ");
        Scanner inY = new Scanner(System.in);
        double y = inY.nextDouble();
        if (x < y) {
            System.out.println("Valoarea functiei f este " + y);
        } else {
            if (x == y) {
                System.out.println("Valoarea functiei f este " + 0);
            } else {
                System.out.println("Valoarea functiei f este " + y);
            }
        }*/

//58.	Sa se afle val functiei: f={x-y pt. x>y; x+y pt. x<y

        /*System.out.println("Dati numarul x ");
        Scanner inX = new Scanner(System.in);
        double x = inX.nextDouble();
        System.out.println("Dati numarul y ");
        Scanner inY = new Scanner(System.in);
        double y = inY.nextDouble();
        if (x > y) {
            System.out.println("Valoarea functiei f este " + (x - y));
        } else {
            System.out.println("Valoarea functiei f este " + (x+y));
        }*/

//59.	Sa se calc. m.a. a elementelor sirului a1..an, cuprinse intre a si b, a<b.

        /*System.out.println("Introduceti limita sirului n=");
        Scanner inN = new Scanner(System.in);
        int n = inN.nextInt();
        System.out.println("Introduceti limita inferioara a intervalului");
        Scanner inA = new Scanner(System.in);
        int a = inA.nextInt();
        System.out.println("Introduceti limita superioara a intervalului");
        Scanner inB = new Scanner(System.in);
        int b = inB.nextInt();
        double sumAverage = 0;
        double average;
        int count = 0;
        if (a > b) {
            System.out.println("Intervalul introdus este incorect ");
            return;
        } else {
            for (double i = a; i <= b; i++) {
                sumAverage = sumAverage + i;
                count++;
            }
            average = sumAverage / count;
            System.out.println("Media numerelor cuprinse intre " + a + " si " + b + " este " + average);
        }*/

//60.	sa se afle m.a intre min(x,y2) si min(x2,y)

       /* System.out.println("Introduceti primul numar");
        Scanner inFirstNumber = new Scanner(System.in);
        double firstNumber = inFirstNumber.nextDouble();
        System.out.println("Introduceti cel de-al doilea numar");
        Scanner inSecondNumber = new Scanner(System.in);
        double secondNumber = inSecondNumber.nextDouble();
        double firstMinimum;
        double secondMinimum;
        double average;
        if (firstNumber < (2*secondNumber)) {
            firstMinimum = firstNumber;
        } else {
            firstMinimum = (2*secondNumber);
        }
        if ((2*firstNumber) < secondNumber) {
            secondMinimum = (2* firstNumber);
        } else {
            secondMinimum = secondNumber;
        }
        System.out.println(firstMinimum);
        System.out.println(secondMinimum);
        average=(firstMinimum+secondMinimum)/2;
        System.out.println("Media aritmetica ceruta este "+ average);*/

//61.	sa se afle m.a intre max(2x,y) si max(x,2y)

      /*  System.out.println("Introduceti primul numar");
        Scanner inFirstNumber = new Scanner(System.in);
        double firstNumber = inFirstNumber.nextDouble();
        System.out.println("Introduceti cel de-al doilea numar");
        Scanner inSecondNumber = new Scanner(System.in);
        double secondNumber = inSecondNumber.nextDouble();
        double firstMaximum;
        double secondMaximum;
        double average;
        if ((2 * firstNumber) > secondNumber) {
            firstMaximum = (2 * firstNumber);
        } else {
            firstMaximum = secondNumber;
        }
        if (firstNumber > (2 * secondNumber)) {
            secondMaximum = firstNumber;
        } else {
            secondMaximum = (2*secondNumber);
        }
        System.out.println(firstMaximum);
        System.out.println(secondMaximum);
        average = (firstMaximum+ secondMaximum) / 2;
        System.out.println("Media aritmetica ceruta este " + average);*/

//62.	sa se afle m.a intre a+b, min(a,b) si min(a-b,(a+b)/2)

      /*  System.out.println("Introduceti primul numar");
        Scanner inFirstNumber = new Scanner(System.in);
        double firstNumber = inFirstNumber.nextDouble();
        System.out.println("Introduceti cel de-al doilea numar");
        Scanner inSecondNumber = new Scanner(System.in);
        double secondNumber = inSecondNumber.nextDouble();
        double firstMinimum;
        double secondMinumum;
        double average;
        double sumAB=(firstNumber+secondNumber);
        if (firstNumber < secondNumber) {
            firstMinimum = firstNumber;
        } else {
            firstMinimum = secondNumber;
        }
        if ((firstNumber - secondNumber) < ((firstNumber + secondNumber) / 2)) {
            secondMinumum = (firstNumber-secondNumber);
        } else {
            secondMinumum = ((firstNumber + secondNumber) / 2);
        }
        System.out.println(sumAB);
        System.out.println(firstMinimum);
        System.out.println(secondMinumum);
        average = (sumAB+ firstMinimum+secondMinumum) / 3;
        System.out.println("Media aritmetica ceruta este " + average);*/

//63.	sa se afiseze sirul puterilor lui 2 (primii 15 termeni)

        /*System.out.println("Sirul primelor 15 puteri ale lui 2: ");
        for(double i=0;i<15;i++){
            System.out.print(Math.pow(2,i)+" ");
        }*/

//64.	Se dau n numere. Sa se numere cate sunt mai mici ca 5, egale cu 5 si mai mari ca 5

       /* System.out.println("Introduceti limita n");
        Scanner inN = new Scanner(System.in);
        int n = inN.nextInt();
        int countBigger = 0;
        int countEven = 0;
        int countSmaller = 0;
        System.out.println("Introduceti cele "+n+" numere");
        for (int i = 1; i <= n; i++) {
            Scanner inNumbers = new Scanner(System.in);
            double numbers = inN.nextDouble();
            if (numbers < 5) {
                countSmaller++;
            } else {
                if (numbers == 5) {
                    countEven++;
                } else {
                    countBigger++;
                }
            }
        }
        System.out.println("Au fost introduse "+countBigger+" numere mai mari decat 5");
        System.out.println("Au fost introduse "+countEven+" numere egale cu 5");
        System.out.println("Au fost introduse "+countSmaller+" numere mai mici decat 5");*/

//65.	Sa se faca media aritmetica intre suma si produsul elementelor unui sir de numere cu n elemente

        /*System.out.println("Introduceti limita n");
        Scanner inN = new Scanner(System.in);
        int n = inN.nextInt();
        if (n <= 0) {
            System.out.println("Limita gresita, introduceti alta limita");
            return;
        } else {
            double sumNumbers = 0;
            double multiplyNumbers = 1;
            double average;
            System.out.println("Introduceti cele " + n + " numere");
            for (int i = 1; i <= n; i++) {
                Scanner inNumbers = new Scanner(System.in);
                double numbers = inNumbers.nextDouble();
                sumNumbers += numbers;
                multiplyNumbers *= numbers;
            }
            average = (sumNumbers + multiplyNumbers) / 2;
            System.out.println(sumNumbers);
            System.out.println(multiplyNumbers);
            System.out.println("Media aritmetica ceruta este " + average);

        }*/
    }
            }




