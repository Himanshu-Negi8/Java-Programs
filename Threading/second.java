class A
{
public static void main(String args[]) throws Exception
{
B b = new B();
C c = new C();
b.start();
b.join();
c.start();
}
}

class B extends Thread
{
public void run()
{
try 
{
for(int i=0;i<10;i++)
{
sleep(500);
System.out.println("B"+i);
}
}catch(Exception e){}
}
}

class C extends Thread
{
public void run()
{
try
{
for(int i=0;i<10;i++)
{
sleep(1000);
System.out.println("C"+i);
}
}catch(Exception e){}
}
}