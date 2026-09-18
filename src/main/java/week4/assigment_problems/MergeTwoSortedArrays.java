// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class MergeTwoSortedArrays {
   public MergeTwoSortedArrays() {
   }

   static int[] mergeSortedArrays(int[] var0, int[] var1) {
      int[] var2 = new int[var0.length + var1.length];
      int var3 = 0;
      int var4 = 0;

      int var5;
      for(var5 = 0; var3 < var0.length && var4 < var1.length; ++var5) {
         if (var0[var3] < var1[var4]) {
            var2[var5] = var0[var3];
            ++var3;
         } else {
            var2[var5] = var1[var4];
            ++var4;
         }
      }

      while(var3 < var0.length) {
         var2[var5] = var0[var3];
         ++var3;
         ++var5;
      }

      while(var4 < var1.length) {
         var2[var5] = var1[var4];
         ++var4;
         ++var5;
      }

      return var2;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter size of first array: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter first sorted array:");

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      System.out.print("Enter size of second array: ");
      int var8 = var1.nextInt();
      int[] var5 = new int[var8];
      System.out.println("Enter second sorted array:");

      for(int var6 = 0; var6 < var8; ++var6) {
         var5[var6] = var1.nextInt();
      }

      int[] var9 = mergeSortedArrays(var3, var5);
      System.out.print("Merged Array: ");

      for(int var7 = 0; var7 < var9.length; ++var7) {
         System.out.print(var9[var7] + " ");
      }

      var1.close();
   }
}
