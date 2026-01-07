package conditionals;

public class IfElse {
    public static void main(String[]args){
        String input="";
        if(input.isEmpty()) System.out.println("La stringa é vuota");

        int x=1,y=2,z=3;

        if(x>y) System.out.println("X è più grande di y");
        else System.out.println("Y è più grande di x");

        //----------------------------TERNARY------------------------------
        String t=x>y?"X è più grande di y":"Y è più grande di x";



    }
}
