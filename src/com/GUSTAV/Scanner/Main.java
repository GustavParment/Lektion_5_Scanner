package com.GUSTAV.Scanner;
import java.util.Scanner;



/*TODO Lektion Scanner
   -branch Basic
 -
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Input number! ");
            int result = sc.nextInt();

            System.out.println("You picked " + result);


        } while (true);


    }
}





