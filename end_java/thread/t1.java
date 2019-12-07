class A
{
public static void main(String a[]) throws Exception
{
B obj = new B();
C ob = new C();
obj.start();
obj.join();
ob.start();

}
}
class C extends Thread
{
public void run()
{
try{
for(int i=0;i<5;i++)
{
sleep(500);
System.out.println("C"+i);
}
}
catch(Exception e){}
}
}
class B extends Thread
{
public void run()
{

for(int i=0;i<5;i++)
{
try{
sleep(500);
}
catch(Exception e){}
System.out.println("B"+i);
}
}
}