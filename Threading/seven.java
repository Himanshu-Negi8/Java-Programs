/*Daemon thread program*/
class A
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
System.out.println("A"+i);
}
B b = new B();
b.setDaemon(true);
b.start();

}
}


class B extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("B"+i);
try
{
sleep(500);
}catch(Exception e){}
}
}
}