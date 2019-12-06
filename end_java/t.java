class A
{
public static void main(String args[])
{
B obj = new B();
Thread t = new Thread(obj);
t.start();

}
}

class B implements Runnable
{
public void run()
{
System.out.println("b");
}
}