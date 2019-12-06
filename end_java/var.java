class A
{
 public static void main(String args[])
{
 B b = new B();
b.j=60;
B b1 = new B();
b1.j=90;
System.out.println(b.j);
System.out.println(b1.j);
System.out.println(b.i);

System.out.println(b1.i);
b1.i=90;
System.out.println(b1.i);
}
}


class B
{
static int i=60;

int j;
}
