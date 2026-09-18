// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class ContainsDuplicate {
   public ContainsDuplicate() {
   }

   static boolean containsDuplicate(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         for(int var2 = var1 + 1; var2 < var0.length; ++var2) {
            if (var0[var1] == var0[var2]) {
               return true;
            }
         }
      }

      return false;
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

      System.out.println("Contains Duplicate: " + containsDuplicate(var3));
      var1.close();
   }
}
