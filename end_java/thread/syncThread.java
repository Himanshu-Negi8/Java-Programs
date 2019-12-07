
class A
{
public static void main(String a[]) throws Exception
{
B b = new B();
b.start();
b.join();
C c =new C();
c.start();
}
}

class D 
{
 static void print(int n)
{

for(int i=1;i<=10;i++)
{
try{Thread.sleep(1000);}
catch(Exception e){}
System.out.println(n*i);
}
}
}

class B extends Thread
{
public void run()
{
D.print(3);
}
}
class C extends Thread
{
public void run()
{
D.print(5);
}
}
