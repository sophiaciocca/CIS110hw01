/**********************************************
  * Name: Sophia Ciocca
  * PennKey: sciocca
  * Recitation: 211
  * 
  * Compilation: javac RandomWalkers.java
  * Execution: java RandomWalkers
  * 
  * Simulates T people walking N number of steps, and finds the mean squared distance.
  * 
  * % java RandomWalkers 100 10000
  * mean squared distance = 101.446
  **********************************************/

public class RandomWalkers {
    public static void main(String[] args) {
        
        
       //get command-line arguments N (number of steps) & T (independent experiments)
        int N, T;
        N = Integer.parseInt(args[0]);
        T = Integer.parseInt(args[1]);
        
        //delcare & initialize other variables
        int x = 0;
        int y = 0;
        double squaredDistance = 0;
        double totalSquaredDist = 0;
        double meanSquaredDist = 0;
        
        //use for statement to get "N times"
        for (int t = 1; t <= T; t++) {
            
            x = 0;
            y = 0; 
            for (int i = 1; i <= N; i++) {
            
                double randomnumber = Math.random();
            
                //if 0 <= random number < 0.25, increase x coordinate
                if (randomnumber <= 0.25) {
                    x = x + 1;
                }
                //if 0.25 <= random number < 0.5, decrease x coordinate
                else if (randomnumber > 0.25 && randomnumber <= 0.5) {
                    x = x - 1;
                }
                //if 0.5 <= random number < 0.75, increase y coordinate
                else if (randomnumber > 0.5 && randomnumber <= 0.75) {
                    y = y + 1;
                }
                //if 0.75 <= random number < 1, decrease y coordinate
                else {
                    y = y - 1;
                }
            }
            
            //calculate squared distance for that one person
            squaredDistance = ((x * x) + (y * y));
            
            //calculate updated total squared distance
            totalSquaredDist = totalSquaredDist + squaredDistance;
        }
        
        //calculate mean squared distance
        meanSquaredDist = totalSquaredDist / T;
        
        //print squared distance
        System.out.print("mean squared distance = ");
        System.out.println(meanSquaredDist);
        
        
    }
}
        
        
        
        
        
        
        
 