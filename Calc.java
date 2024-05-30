public class Calc {

    public Calc ()
    {
        
    }

    public static void CalcThis (int a, int b)
    {
     System.out.println(a+b);   
    }

    public static void Subtract (int a, int b)
    {
      System.out.println(a-b);           
    }

     public static int Subtract (int a, int b)
    {
      return a-b;           
    }

    public static void Multiply(int a, int b) {
        System.out.println(a * b);
    }

     public static void Divide(int a, int b) {
        if (b != 0) {
            System.out.println((double) a / b);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    public static void Power(int base, int exponent) {
        System.out.println(Math.pow(base, exponent));
    }

    public static void Modulus(int a, int b) {
        if (b != 0) {
            System.out.println(a % b);
        } else {
            System.out.println("Cannot perform modulus operation with zero divisor!");
        }
    }

    public static void Increment(int num) {
        System.out.println(++num);
    }

    public static void Decrement(int num) {
        System.out.println(--num);
    }

    public static void Absolute(int num) {
        System.out.println(Math.abs(num));
    }

    public static void SquareRoot(int num) {
        System.out.println(Math.sqrt(num));
    }

    public static void RandomNumber(int min, int max) {
        System.out.println((int) (Math.random() * (max - min + 1) + min));
    }
    
}
