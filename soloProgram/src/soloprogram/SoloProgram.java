
package soloprogram;

import static java.lang.Math.pow;


public class SoloProgram {

    
    public static void main(String[] args) {
        // Program that declares an integer variable, anInt, and initializes it to a value of choice.
        // There must also be a String declared, doubleLine, which must be initialized to a whole row of “=” symbols.
        //The program must then calculate the cube value of the integer (store answer into variable cube) and display it.
        
        String doubleLine= "====================================================";
        
        System.out.println("My first solo program");
        System.out.println(doubleLine);
        
        int num = 10;
        double cube = pow(num, 3);
        String finalC = String.format("%.0f", cube);
        
        double quotient = num / 7;
        String finalQ = String.format("%.0f", quotient);
        
        double rem = num % 7;
        String finalR = String.format("%.0f", rem);
        
        double sum = cube + rem;
        String finalS = String.format("%.0f", sum);
        
        System.out.println(num + " cubed is " + finalC);
        System.out.println(num + " divided by 7 is " + finalQ + " rem " + finalR);
        System.out.println("The sum of " + finalC + " and " + finalR + " is " + finalS);
        
    }
    
}
