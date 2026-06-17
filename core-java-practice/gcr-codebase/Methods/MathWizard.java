// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;
import java.util.Scanner;

public class MathWizard {
   public MathWizard() {
   }

   static void isPrime(int var0) {
      if (var0 <= 1) {
         System.out.println(var0 + " is not prime number");
      } else {
         for(int var1 = 2; (double)var1 <= Math.sqrt((double)var0); ++var1) {
            if (var0 % var1 == 0) {
               System.out.println(var0 + " is not prime number");
               return;
            }
         }

         System.out.println(var0 + " is prime number");
      }
   }

   static void factorial(int var0) {
      int var1 = 1;

      for(int var2 = 1; var2 <= var0; ++var2) {
         var1 *= var2;
      }

      System.out.println("Factorial of " + var0 + " is: " + var1);
   }

   static void fibonacci(int var0) {
      int var1 = 0;
      int var2 = 1;
      System.out.print("Fibonacci Series: ");

      while(var1 <= var0) {
         System.out.print(var1 + " ");
         int var3 = var1 + var2;
         var1 = var2;
         var2 = var3;
      }

      System.out.println();
   }

   static int gcd(int var0, int var1) {
      while(var1 != 0) {
         int var2 = var1;
         var1 = var0 % var1;
         var0 = var2;
      }

      return var0;
   }

   static void lcm(int var0, int var1) {
      int var2 = var0 * var1 / gcd(var0, var1);
      System.out.println("LCM is: " + var2);
   }

   static void power(int var0, int var1) {
      int var2 = 1;

      for(int var3 = 1; var3 <= var1; ++var3) {
         var2 *= var0;
      }

      System.out.println(var0 + "^" + var1 + " = " + var2);
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("===== Math Wizard =====");
      System.out.println("1. Prime Check");
      System.out.println("2. Factorial");
      System.out.println("3. Fibonacci");
      System.out.println("4. GCD");
      System.out.println("5. LCM");
      System.out.println("6. Power");
      System.out.print("Enter your choice: ");
      int var2 = var1.nextInt();
      switch (var2) {
         case 1:
            System.out.print("Enter a number: ");
            int var3 = var1.nextInt();
            isPrime(var3);
            break;
         case 2:
            System.out.print("Enter a number: ");
            int var4 = var1.nextInt();
            factorial(var4);
            break;
         case 3:
            System.out.print("Enter a number: ");
            int var5 = var1.nextInt();
            fibonacci(var5);
            break;
         case 4:
            System.out.print("Enter first number: ");
            int var6 = var1.nextInt();
            System.out.print("Enter second number: ");
            int var7 = var1.nextInt();
            PrintStream var10000 = System.out;
            int var10001 = gcd(var6, var7);
            var10000.println("GCD is: " + var10001);
            break;
         case 5:
            System.out.print("Enter first number: ");
            int var8 = var1.nextInt();
            System.out.print("Enter second number: ");
            int var9 = var1.nextInt();
            lcm(var8, var9);
            break;
         case 6:
            System.out.print("Enter base: ");
            int var10 = var1.nextInt();
            System.out.print("Enter exponent: ");
            int var11 = var1.nextInt();
            power(var10, var11);
            break;
         default:
            System.out.println("Invalid Choice!");
      }

      var1.close();
   }
}
