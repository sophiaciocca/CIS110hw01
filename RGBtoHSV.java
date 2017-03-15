/**********************************************
  * Name: Sophia Ciocca
  * PennKey: sciocca
  * Recitation: 211
  * 
  * Compilation: javac RGBtoHSV.java
  * Execution: java RGBtoHSV
  * 
  * Converts RGB color values to HSV
  * 
  * % java RGBtoHSV 75 0 130
  * hue = 274.61538461538464
  * saturation = 1.0
  * value = 0.5098039215686274
  **********************************************/

import java.lang.*;

public class RGBtoHSV {
    public static void main(String[] args) {
        
        //read RGB values from arguments
        int red, green, blue;
        red = Integer.parseInt(args[0]);
        green = Integer.parseInt(args[1]);
        blue = Integer.parseInt(args[2]);
        
        //calculates maximum and minimum of RGB values
        double cmax = Math.max(Math.max(red, green), Math.max(green, blue));
        double cmin = Math.min(Math.min(red, green), Math.min(green, blue));
        double deltac = cmax - cmin;
        
        //calculate Hue (H)
        double hue = 0;
        if (deltac == 0) {
            hue = 0.0;
        }
        else {
            if (cmax == 0) {
                hue = 0.0;
            }
            else if (cmax == red) {
                hue = ((60 * ((green-blue)/deltac) + 360) % 360);
            }
            else if (cmax == green) {
                hue = (60 * ((blue-red)/deltac) + 120);
            }
            else if (cmax == blue) {
                hue = (60 * ((red-green)/deltac) + 240);
            }
            else {
                hue = 0.0;
            }
        }
        
        //calculate Saturation (S)
        double saturation = 0;
        if (red == green && green == blue) {
            saturation = 0.0;
        }
        else {
            saturation = (deltac / cmax);
        }
        
       //calculate Value (V)
        double value;
        value = (cmax / 255);
        
        //print Hue, Saturation, and Value
        System.out.print("hue = ");
        System.out.println(hue);
        System.out.print("saturation = ");
        System.out.println(saturation);
        System.out.print("value = ");
        System.out.println(value);
    }
}