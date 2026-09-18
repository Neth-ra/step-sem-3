// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
   public BestTimeToBuyAndSellStock() {
   }

   static int maxProfit(int[] var0) {
      int var1 = var0[0];
      int var2 = 0;

      for(int var3 = 1; var3 < var0.length; ++var3) {
         if (var0[var3] < var1) {
            var1 = var0[var3];
         }

         int var4 = var0[var3] - var1;
         if (var4 > var2) {
            var2 = var4;
         }
      }

      return var2;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter stock prices:");

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      System.out.println("Maximum Profit: " + maxProfit(var3));
      var1.close();
   }
}
