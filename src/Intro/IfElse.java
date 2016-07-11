package Intro;

import java.util.Scanner;

/**
 * Created by Falcon on 7/10/16.
 */
public class IfElse {

    private static String ans = "";
    private int n = 1;
    private void Solution1(int n) {

        if (n % 2 == 1){
            ans = "Weird";
        }
        else if (n <= 5) {
            ans = "Not Weird";
        }
        else if (n >= 6 && n <= 20){
            ans = "Weird";
        }
        else ans = "Not Weird";

        System.out.println(ans);

    }


    private void Solution2(int n) {

        if ((n % 2 == 1) || (n >= 6 && n <= 20)){
            ans = "Weird";
        } else ans = "Not Weird";

        System.out.println(ans);
    }

    private void Solution3(int n) {

        if (n%2 == 0 && (n>20 || n < 6)) { ans += "Not "; }
        ans += "Weird";

        System.out.println(ans);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        //int n = inp.nextInt();
        IfElse sol = new IfElse();
        sol.Solution1(3);
        sol.Solution2(3);
        sol.Solution3(3);

    }
}

