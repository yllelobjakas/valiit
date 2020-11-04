package ee.bcs.valiit.tasks;

import java.util.Scanner;

public class Lesson1MathUtil {
    private String test;

    public Lesson1MathUtil(String test) {
        this.test = test;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("sisesta midagi");
       String rida = scanner.nextLine();

       if(rida.equals("min")){
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           System.out.println(min(a, b));
       } else if (rida.equals("max")){
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           System.out.println(max(a, b));
       } else if (rida.equals("abs")){
           int a = scanner.nextInt();
           System.out.println(abs(a));
       } else if (rida.equals("isEven")){
           int a = scanner.nextInt();
           System.out.println(isEven(a));
       } else if (rida.equals("min2")) {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           int c = scanner.nextInt();
           System.out.println(min2(a, b, c));
       } else if (rida.equals("max2")) {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           int c = scanner.nextInt();
           System.out.println(max2(a, b, c));
       }
    }

    public void test() {
        System.out.println(test);
    }

    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

    public static int max(int a, int b) {
        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public static boolean isEven(int a) {
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int min2(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }

    }


    public static int max2(int a, int b, int c) {
        // TODO tagasta a, b ja c suurim väärtus
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }

    }
}
