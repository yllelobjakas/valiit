package ee.bcs.valiit.tasks;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        System.out.println(factorial());
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta suvaline number");
        int arv = scanner.nextInt();
        int b = 1;
        for (int x = 1; x <= arv; x++) {
            b = x * b;
        }
        return b;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        // leia arrayst a kõige väiksem number
        //salvesta mingisse muutujasse ka index int a_i, millel vastav number oli
        //loo uus array b, mis on sama suur kui array a
        //väärtusta b[0] = varem leitud min väärtus
        //määra a[a_i]=Integer.MAX_VALUE
        //tee tsükkel, kus teed kõike eelnevate
        //a.length korda, nii, et kõigepealt täidame b[0], siis b[1] jne.
        //for (int a)
        int[] b;
        int size = a[].length;
        b.length = a.length;
        for (int i, i<)
        // if number < kui each next number arrays, pane see nr array b kohale [0]
        return new int[0];
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";

        return "";
    }

    public static boolean isPrime(int x) {
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }

}
