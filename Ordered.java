/**********************************************
  * Name: Sophia Ciocca
  * PennKey: sciocca
  * Recitation: 211
  * 
  * Compilation: javac Ordered.java
  * Execution: java Ordered
  * 
  * Takes three numbers. Prints "true" if the numbers the user inputs are in order.
  * Prints "false" if the numbers the user inputs are not in order.
  * 
  * % java Ordered 6 8 9
  * true
  **********************************************/

public class Ordered {
    public static void main(String[] args) {
        
        //reading in the values:
        int x, y, z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);
        
        //deciding whether the sequence is ordered:
        boolean isOrdered;
        if (x < y && y < z) {
            isOrdered = true;
        }
        else if (x > y && y > z) {
            isOrdered = true;
        }
        else { 
            isOrdered = false;
        }
        
        //printing out the value of isOrdered ("true" or "false")
        System.out.println(isOrdered);
                  
    }
}