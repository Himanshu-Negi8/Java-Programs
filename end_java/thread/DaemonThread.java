class A
{
public static void main(String a[]) throws Exception
{
for(int i=0;i<5;i++)
{
Thread.sleep(1000);
System.out.println("A"+i);
}
DaemonThread dt = new DaemonThread();
dt.setDaemon(true);
dt.start();
System.out.println("main exit");

}
}

class DaemonThread extends Thread

{
int i=0;
public void run()
{
while(true)
{
try{
sleep(5000);
}catch(Exception e){}

}
}

}
