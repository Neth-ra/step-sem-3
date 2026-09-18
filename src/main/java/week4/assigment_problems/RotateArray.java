// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class RotateArray {
   public RotateArray() {
   }

   static int[] rotateArray(int[] var0, int var1) {
      var1 %= var0.length;
      int[] var2 = new int[var0.length];

      for(int var3 = 0; var3 < var0.length; ++var3) {
         int var4 = (var3 + var1) % var0.length;
         var2[var4] = var0[var3];
      }

      return var2;
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

      System.out.print("Enter k: ");
      int var7 = var1.nextInt();
      int[] var5 = rotateArray(var3, var7);
      System.out.print("Rotated Array: ");

      for(int var6 = 0; var6 < var5.length; ++var6) {
         System.out.print(var5[var6] + " ");
      }

      var1.close();
   }
}
