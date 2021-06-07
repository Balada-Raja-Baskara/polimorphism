/*    */ package overriding;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NewClass1
/*    */   extends NewClass
/*    */ {
/*    */   public void Input() {
/* 16 */     Scanner input = new Scanner(System.in);
/* 17 */     System.out.print("Panjang : ");
/* 18 */     this.panjang = input.nextInt();
/* 19 */     System.out.print("Lebar   : ");
/* 20 */     this.lebar = input.nextInt();
/* 21 */     this.luas = this.panjang * this.lebar;
/* 22 */     this.keliling = 2 * this.panjang + 2 * this.lebar;
/*    */   }
/*    */   public void Output() {
/* 25 */     System.out.println("-----==========-----");
/* 26 */     System.out.println("Panjang  : " + this.panjang);
/* 27 */     System.out.println("Lebar    : " + this.lebar);
/* 28 */     System.out.println("Luas     :" + this.luas);
/* 29 */     System.out.println("Keliling :" + this.keliling);
/*    */   }
/*    */ }


/* Location:              D:\NetBeansProjects\Overloading\build\classes\!\overriding\NewClass1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */