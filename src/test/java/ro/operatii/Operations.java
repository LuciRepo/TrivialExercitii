package ro.operatii;

public class Operations {
    public static void main(String[] args) {
        byte shoesSize = 4;
        byte humanAgeInEars = 5;
        int operation1 = shoesSize + humanAgeInEars;
        System.out.println("Rezultat operatie byte " + operation1);
        short s1 = 589;
        short s2 = 900;
        int s3 = s1 + s2;
        System.out.println("Rezultat operatie short" + s3);
        int i1 = 348;
        int i2 = 897;
        int i3 = i1 * i2;
        System.out.println("Rezultat operatie int" + i3);
        long l1 = -82980289;
        long l2 = 937;
        long l3 = l1 / l2;
        System.out.println("Rezultat operatie long " + l3);
        float f1 = 898.8f;
        float f2 = 764.9f;
        float f3 = f1 * f2;
        System.out.println("Rezultat operatie float" + f3);
        double d1 = 799.78d;
        double d2 = 322131.7646723d;
        double d3 = d2 / d1;
        System.out.println("Rezultat operatie double " + d3);
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 || b2;
        System.out.println(b3);
        char c1 = 'f';
        char c2 = 'd';
        int c3 = c1 + c2;
        System.out.println("Rezultat operatie char " + c3);
        String firstName = "Ion ";
        String lastName = "Florin";
        String fullName = firstName + lastName;
        System.out.println("Full name este " + fullName);


    }
}
