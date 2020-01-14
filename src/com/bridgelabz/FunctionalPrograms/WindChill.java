package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.Utility;

/**
 * @author swati
 * Given the temperature t (in Fahrenheit) and the wind speed v
 * (in miles per hour), compute the wind chill w using the formula
 * from the National Weather Service.
 *
 *    w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 *
 */
public class WindChill {
      public static void main(String[] args) {
	  double t=Double.parseDouble(args[0]);
	  double v=Double.parseDouble(args[1]);
	  Utility.getTemprature(t, v);
	}

}
