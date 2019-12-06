/*class A
{
 public static void main(String args[])
{
B obj = new B();
obj.display();
}
}

class B
{
public void show()
{
System.out.println("hey bot");
}
public void display()
{
System.out.println("ssdfg");
this.show();

}
}*/


class A
{
A()
{
this(40);
}
A(int i)
{
System.out.println(i);
}
 public static void main(String args[])
{
A obj  = new A();

}

}