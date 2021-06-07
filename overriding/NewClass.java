/*    */ package overriding;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NewClass
/*    */ {
/*    */   int sisi;
/*    */   int panjang;
/*    */   int lebar;
/*    */   int luas;
/*    */   int keliling;
/*    */   
/*    */   public void input() {
/* 18 */     Scanner input = new Scanner(System.in);
/* 19 */     System.out.print("sisi : ");
/* 20 */     this.sisi = input.nextInt();
/* 21 */     this.luas = this.sisi * this.sisi;
/* 22 */     this.keliling = this.sisi * 4;
/*    */   }
/*    */   public void output() {
/* 25 */     System.out.println("-----=========-----");
/* 26 */     System.out.println("sisi    : " + this.sisi);
/* 27 */     System.out.println("Luas    :" + this.luas);
/* 28 */     System.out.println("Keliling:" + this.keliling);
/*    */   }
/*    */ }


/* Location:              D:\NetBeansProjects\Overloading\build\classes\!\overriding\NewClass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */