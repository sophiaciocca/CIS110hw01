/**********************************************
  * Name: Sophia Ciocca
  * PennKey: sciocca
  * Recitation: 211
  * 
  * Compilation: javac Checkerboard.java
  * Execution: java Checkerboard
  * 
  * Creates a checkerboard pattern of N asterisks based on the integer argument entered.
  * 
  * % java Checkerboard 4
  * |* * * * |
  * | * * * *|
  * |* * * * |
  * | * * * *|
  **********************************************/

public class Checkerboard {
    public static void main(String[] args) {
   
        //get command-line argument N
        int N;
        N = Integer.parseInt(args[0]);
        
        //establish each checkerboard row
        for (int i = 1; i <= N; i++) {
            
            System.out.print("|");
            
            //odd rows:
            if (i % 2 == 1) {
                for (int j = 1; j <= N; j++) {
                    System.out.print("* ");
                }
            }
            //even rows:
            else {
                for (int k = 1; k <= N; k++) {
                    System.out.print(" *");
                }
            }
           
            System.out.println("|");
            
        }
         
    }
}