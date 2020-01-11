/*thread program use of synchronized method*/

class A
{
public static void main(String args[])
{

new B().start();
new C().start();
}
}

class D
{
 synchronized static void print(int n)
{
try
{
Thread.sleep(500);
}catch(Exception e){}
for(int i=1;i<=10;i++)
System.out.println(n*i);
}

}
class C extends Thread
{

public void run()
{
D.print(3);
}

}

class B extends Thread
{
public void run()
{
D.print(5);
}
}