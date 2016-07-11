package Intro;

import java.util.*;
/**
 * Created by Falcon on 7/10/16.
 */
public class StdInOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String myStr = scan.next();
        int b = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(myStr);
        System.out.println(b);

    }
}
