class A
{
public static void main(String args[])throws Exception
{
	D d =new D();
	d.start();
	//d.join();
	E e =new E();
	e.start();
   		
}

}
class D extends Thread
{
public void run()
{
try
{
for(int i=0;i<5;i++)
{
	System.out.println("sheetal");
sleep(2000);

}

}catch(Exception e){}
}
}
class E extends Thread
{
public void run()
{
try
{
for(int i=0;i<5;i++)
{
	System.out.println("kunnu");
}

}catch(Exception e){}
}
}