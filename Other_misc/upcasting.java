class A
{
 public static void main(String a[])
 {
   C c = new B();//upcasting
   c.show();
   B b = (B)c;
   b.show1();
   
   
 }
}

class B extends C
{
 void show()
{
System.out.println("Upcasted by B");
}
 void show1()
{
System.out.println("B");
}
}
class C
{
 void show()
{
 System.out.println("C");
}
}