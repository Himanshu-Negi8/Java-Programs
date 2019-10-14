

class B
{
 void show(B o)
{
 System.out.println(o instanceof B);

}
}


class A extends B
{
 
 public static void main(String a[])
 {
  B b = new B();
  A obj = new A();
  
  b.show(obj);
 }
 

}

