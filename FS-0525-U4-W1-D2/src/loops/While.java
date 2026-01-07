package loops;

import java.util.Scanner;

public class While {
    public static void main(String[]args){
        //---------------------------------WHILE--------------------------------
        Scanner scanner=new Scanner(System.in);

        System.out.println("Dammi il primo numero");
        int num1= Integer.parseInt(scanner.nextLine());

        System.out.println("Dammi il secondo numero");
        int num2= Integer.parseInt(scanner.nextLine());

        while(num2<=num1+20){
            System.out.println(num2);
        }


    }
}
