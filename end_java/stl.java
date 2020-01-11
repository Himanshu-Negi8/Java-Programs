class A
{
public static void main(String args[])
{
D d=new C();
d.show();
C c=(C)d;
c.show1();

C a=new B();
a.show1();
B b=(B)a;
b.show2();
} 
}

class B extends C
{

public void show1()
{  
System.out.println("B is here");
}
public void show2()
{
System.out.println("B show2");
}

}

class C extends D
{
public void show()
{
System.out.println("C is here");
}
public void show1()
{
System.out.println("C show1");
}

}

class D
{
void show()
{
System.out.println("D is here");
}
}