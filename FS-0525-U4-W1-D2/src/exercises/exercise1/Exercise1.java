package exercises.exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("Inserisci una stringa");
        String string=scanner.nextLine();
        System.out.println(stringaPariODispari(string));*/
        System.out.println("Inserisci un numero");
        int n1= Integer.parseInt(scanner.nextLine());
        System.out.println(annoBisestile(n1));
    }
    public static boolean stringaPariODispari(String string){
        if (string.length()%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean annoBisestile(int n1){
        if(n1%4==0&&n1%100!=0){
            return true;
        } else if(n1%4==0&&n1%100==0&&n1%400!=0){
            return false;
        } else if (n1%4==0&&n1%100==0&&n1%400==0) {
            return true;
        }else {return false;}
    }
}
