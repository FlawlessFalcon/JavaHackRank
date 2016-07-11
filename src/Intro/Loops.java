package Intro;

import java.util.Scanner;

/**
 * Created by Falcon on 7/10/16.
 */
public class Loops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int sum = 0;
            sum = sum + a;

            for (int i = 0; i < c; i++) {
                sum = sum + (int) (Math.pow(2, i)) * b;
                System.out.print(sum + " ");

            }
            System.out.println();

            n--;

        }
    }

}
