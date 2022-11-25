/*
A local inner class is a nested class defined within a method. Like local variables, a local 
inner class declaration does not exist until the method is invoked, and it goes out of scope 
when the method returns. This means that you can create instances only from within the 

method. Those instances can still be returned from the method. This is just how local variables work. Local inner classes have the following properties: 
 ■ They do not have an access specifier. 
 ■ They cannot be declared static and cannot declare static fields or methods. 
 ■ They have access to all fields and methods of the enclosing class.
 */
 public class Outer {
   private int length = 5;
   public void calculate() 
   {
     final int width =20;
     class Inner
     {
       public void multiply() {
         System. out .println(length * width); 
       }
     }
     Inner inner = new Inner(); 
     inner.multiply(); 
   } 
   public static void main(String[] args) {
     Outer outer = new Outer();
     outer.calculate(); 
 }
   
