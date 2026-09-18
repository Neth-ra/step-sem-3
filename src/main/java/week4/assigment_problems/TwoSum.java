// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class TwoSum {
   public TwoSum() {
   }

   static int[] twoSum(int[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         for(int var3 = var2 + 1; var3 < var0.length; ++var3) {
            if (var0[var2] + var0[var3] == var1) {
               return new int[]{var2, var3};
            }
         }
      }

      return new int[]{-1, -1};
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter array elements:");

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      System.out.print("Enter target: ");
      int var6 = var1.nextInt();
      int[] var5 = twoSum(var3, var6);
      System.out.println("Indices: [" + var5[0] + ", " + var5[1] + "]");
      var1.close();
   }
}
