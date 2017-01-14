/**
 * Created by matthewmartin on 1/12/17.
 */

import java.util.Scanner;

public class sumOfTheNumbers {
    public static void main (String [] argu){
        Scanner ask = new Scanner(System.in);
        System.out.println("Please enter a number");

        int n = ask.nextInt();
        int sum = 0;

        for(int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("the sum of your numbers is " + sum);

    }

}

