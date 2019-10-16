class A
{

public static void main(String args[])
{
D d = new D();
B b = new B(d);
C c = new C(d);
b.start();
c.start();
}
}
class D
{

synchronized void print(int n)
{

for(int i=1;i<=10;i++)
{
System.out.println(n*i);
try
{
Thread.sleep(500);
}catch(Exception e){}
}

}
}

class B extends Thread
{D d;
B(D d)
{
this.d =d;
}
public void run()
{
d.print(3);
}
}
class C extends Thread
{D d;
C(D d)
{
this.d =d;
}
public void run()
{
d.print(5);
}
}