package com.GUSTAV.Scanner;
import java.util.Scanner;



//TODO Lektion Scanner
public class Main {
    public static void main(String[] args) {

        boolean isPlaying = true;

       do {
           int result = scannerNumber();

           if (result > 1000){
               break;
           }
           for (int i = 0; i < result ; i++) {
               System.out.println(i);

           }



       }while (isPlaying);


    }
    public static int scannerNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Pleas insert a number");


        return sc.nextInt();

    }
    public static String scannerText(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert some sentence ");
        String input = sc.nextLine();

        return input;
    }
}




