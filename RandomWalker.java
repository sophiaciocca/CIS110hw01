/**********************************************
  * Name: Sophia Ciocca
  * PennKey: sciocca
  * Recitation: 211
  * 
  * Compilation: javac RandomWalker.java
  * Execution: java RandomWalker
  * 
  * Takes integer command-line argument for number of steps, and simulates
  * the coordinates of a person taking steps in random directions.
  * 
  * % java RandomWalker 10
  * (0, -1)
  * (1, -1)
  * (2, -1)
  * (3, -1)
  * (3, 0)
  * (3, 1)
  * (3, 2)
  * (4, 2)
  * (4, 3)
  * (5, 3)
  * squared distance = 34.0
  **********************************************/

public class RandomWalker {
    public static void main(String[] args) {
        
        //get command-line argument N (number of steps)
        int N;
        N = Integer.parseInt(args[0]);
        
        //use for statement to get "N times"
        int x = 0;
        int y = 0;
        
        for (int i = 1; i <= N; i++) {
            
            double randomnumber = Math.random();
            
            //if 0 < random number <= 0.25, increase x coordinate
            if (randomnumber <= 0.25) {
                x = x + 1;
            }
            //if 0.25 < random number <= 0.5, decrease x coordinate
            else if (randomnumber > 0.25 && randomnumber <= 0.5) {
                x = x - 1;
            }
            //if 0.5 < random number <= 0.75, increase y coordinate
            else if (randomnumber > 0.5 && randomnumber <= 0.75) {
                y = y + 1;
            }
            //if 0.75 < random number < 1, decrease y coordinate
            else {
                y = y - 1;
            }
            
            //print coordinates each time
            System.out.print("(");
            System.out.print(x);
            System.out.print(", ");
            System.out.print(y);
            System.out.println(")");
        }
        
        //calculate squared distance
        double squareddistance;
        squareddistance = ((x * x) + (y * y));
        
        //print squared distance
        System.out.print("squared distance = ");
        System.out.println(squareddistance);
        
        
    }
}