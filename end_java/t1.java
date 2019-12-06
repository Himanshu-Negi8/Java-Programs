
class A
{
public static void main(String args[])throws Exception
{
B b = new B();
C c = new C();




c.start();
c.join();
b.start();
}
}

class B extends Thread
{
public void run()
{
try{
 for(int i=0;i<5;i++)
{
System.out.println("B"+i);
//System.out.println(Thread.currentThread().getName());
sleep(500);
}
}catch(Exception e){}
}
}


class C extends Thread
{
public void run()
{
try{
 for(int i=0;i<5;i++)
{
System.out.println("C"+i);
//System.out.println(Thread.currentThread().getName());
sleep(500);
}
}catch(Exception e){}
}

}



