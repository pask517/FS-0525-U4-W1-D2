package exercises.exercise3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[]args){
    dividiStringa();


    }
    public static void dividiStringa(){

       Scanner scanner= new Scanner(System.in);
       String string;
       
        do {
            System.out.println("Inserisci una stringa");
            string = scanner.nextLine();
            System.out.println(String.join(",", string.split("")));
        } while (!string.equals(":q"));
    }
}
