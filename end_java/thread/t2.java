class A
{
public static void main(String a[]) throws Exception
{
C obj = new C();
Thread t = new Thread(obj);
t.start();
}
}

class C implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
{
try{
Thread.sleep(500);
}catch(Exception e){}
System.out.println("C"+i);
}

}

}