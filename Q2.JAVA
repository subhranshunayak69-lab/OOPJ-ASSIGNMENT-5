import java.util.*;

class A5Q2 {
    public static void main(String args[]) {

        double e = 1.0;
        int fact = 1;

        for (int i = 2; i <= 5; i++) {
            fact = fact * i;
            e = e + (1.0 / fact);
        }

        System.out.println("The value of e = " + e);
    }
}