package ee.bcs.valiit.tasks;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        System.out.println(uusSumma());
    }


    private static void test(Map<String, String> testMap) {
        testMap.put("test", "test");
    }

    public static int uusSumma() {
        // TODO liida kokku ja tagasta x ja y väärtus
        int x = 2;
        int y = 9;
        return x + y;
    }

    public static int sum(int[] x) {
        // Todo liida kokku kõik numbrid massivis x
        x = new int[]{
                9, 7, 6, 3, 5, 2, 8, 1
        };
        int sum = 0;
        for (int i = 0; i <= 7; i++) {
            sum = sum + x[i];
        }
        return sum;
    }

    public static int factorial() {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
        int arv = new int;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta suvaline number");
        for (int x = 1; x <= arv; x++) {
            arv = scanner.nextInt();
            x = x * arv;
            return x;
        }

        public static int[] sort ( int[] a){
            // TODO sorteeri massiiv suuruse järgi
            // Näiteks {2, 6, 8, 1}
            // Väljund {1, 2, 6, 8}
            return new int[0];
        }

        public static String reverseString (String a){
            // TODO tagasta string tagurpidi
            // Näiteks:
            // a = "Test";
            // return tseT";
            System.out.println(a.substring(0, 1));
            System.out.println(a.substring(1, 2));
            System.out.println(a.substring(2, 3));
            System.out.println(a.substring(3, 4));
            System.out.println(a.substring(2, 4));
            System.out.println(a.substring(2));

            String[] array = a.split("e");
            System.out.println(array[0]);
            System.out.println(array[1]);

            System.out.println(a.indexOf(" "));
            return "";
        }

        public static boolean isPrime ( int x){
            // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
            return false;
        }

    }
