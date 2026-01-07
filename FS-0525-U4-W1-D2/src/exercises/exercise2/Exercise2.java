package exercises.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Inserisci un numero da 0 a 3");
        int n1= Integer.parseInt(scanner.nextLine());
        stampaInLettere(n1);
    }
    public static void stampaInLettere(int n1){
        switch (n1){
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("Uno");
                break;

            case 2:
                System.out.println("Due");
                break;

            case 3:
                System.out.println("Tre");
                break;

            default:
                System.out.println("Numero non valido");
        }
    }
}

