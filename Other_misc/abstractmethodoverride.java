class A
{
 public static void main(String a[])
 {
   C obj = new B();
   obj.show();
   
   C c = new D();
   c.show();
   B b = (B)obj;//downcast the objected created by B constructor
   b.show1();
   D d = (D)c;//downcast 
   
    
   
  }
}

class D extends C
{
 void show()
{
 System.out.println("D");
}
}
class B extends C
{
 void show1()
{
 System.out.println("Hello");
}
void show()
{
System.out.println('b');
}

}

abstract class C
{
 abstract void show();
}