import java.util.*;
import java.lang.Math;

public class MathFunctions {
  public class Main {
      public static void main(String[] args) {
        double x = 9.0;
        double angleRad = Math.PI / 4; // 45 degrees in radians
        double degrees = 45.0; 
        Math.toRadians(degrees);
        
        // Basic Arithmetic & Roots
        System.out.println("Square root of " + x + ": " + Math.sqrt(x));    // sqrt(9)  = 3.0
        System.out.println("Cube root of " + x + ": " + Math.cbrt(x));      // cbrt(9)  ≈ 2.08
        System.out.println("Power (5^8): " + Math.pow(5, 8));               // 5^8 = 390625.0
        
        // Trigonometric functions
        System.out.println("Sine of 45 degrees: " + Math.sin(angleRad));    // sin(π/4) ≈ 0.707
        System.out.println("Cosine of 45 degrees: " + Math.cos(angleRad));  // cos(π/4) ≈ 0.707
        System.out.println("Tangent of 45 degrees: " + Math.tan(angleRad)); // tan(π/4) ≈ 1.0
        
        // Logarithms & Exponentials
        System.out.println("Natural log of " + x + ": " + Math.log(x));     // ln(9) ≈ 2.197
        System.out.println("e^2: " + Math.exp(2));                          // e^2 ≈ 7.389
        
        // Rounding & Absolute Value
        System.out.println("Absolute value of -5.5: " + Math.abs(-5.5));    // 5.5
        System.out.println("Ceiling of 5.1: " + Math.ceil(5.1));            // Smallest int >= 5.1 → 6.0
        System.out.println("Floor of 5.9: " + Math.floor(5.9));             // Largest int <= 5.9 → 5.0
        System.out.println("Round of 5.5: " + Math.round(5.5));             // Rounded to nearest int → 6
    }
  }
}
