//custom code to get obj address
class A
{

public static void main(String args[])
{
/*char c[] = {'a','b','c'};
System.out.println(c.toString()); */

A obj = new A();
System.out.println(obj);//coded third line similarly
System.out.println(obj.hashCode());
System.out.println("A"+"@"+Integer.toHexString((int)obj.hashCode()));
}


}