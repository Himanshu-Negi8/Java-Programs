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
void print(int n)
{

for(int i=1;i<=10;i++)
{
System.out.println(n*i);
try{
Thread.sleep(500);}catch(Exception e){}
}

}
}

class B extends Thread
{

public void run()
{D d = new D();
d.print(3);
}
}

class C extends Thread
{

public void run()
{D d = new D();
d.print(5);
}
}