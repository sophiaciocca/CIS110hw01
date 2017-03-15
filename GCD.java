/**********************************************
  * Name: Sophia Ciocca
  * PennKey: sciocca
  * Recitation: 211
  * 
  * Compilation: javac GCD.java
  * Execution: java GCD
  * 
  * Computes and prints the Greatest Common Divisor of two integers.
  * 
  * % java GCD 3 5
  * The GCD of 3 and 5 is 1.
  **********************************************/

public class GCD {
    public static void main(String[] args) {
        
       //gather the original integers and define variables
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        int gcd = 0;
            
        int c = a;
        int d = b;

        
        while (c > 0 && d > 0) {       
            //subtracting the correct way, storing answer as larger number
            if (c > d) {
                c = c - d;
            }
            else {
                d = d - c;
            }        
        }
        
        //if c is the one that gets to 0, d is the GCD
        if (c == 0) {
            gcd = d;
        }
        //...if c is not the one that gets to 0, c is the GCD
        //(also accounts for if both numbers are the same)
        else {
            gcd = c;
        }
         
        //print the GCD
        System.out.print("The GCD of ");
        System.out.print(a);
        System.out.print(" and ");
        System.out.print(b);
        System.out.print(" is ");
        System.out.print(gcd);
        System.out.println("."); 
        
    }
}