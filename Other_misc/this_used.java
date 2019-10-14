class A
{

 public static void main(String a[])
 {
  B b = new B();
  b.i=40;
 B obj = new B();
obj.i=60;
  b.show();
 obj.show();
 }

}


class B
{
 int i=30;//instance variable

 void show()
{

B b = new B();
int i =20;//local variable
 System.out.println(i+" local value");
 System.out.println(b.i+" instance value with b object in local scope");
 System.out.println(this.i+" instance value with this keyword");
 }
 
}