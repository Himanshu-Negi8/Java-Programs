class A
{
 public static void main(String args[])
{
B obj = new B();
obj.i=50;
//obj.show();
B ob = new B();
ob.show();
}
}

class B
{
int i;
public void show()
{
int i =40;
System.out.println(i);
System.out.println(this.i);
}
}