import java.util.*;
class A
{
 public static void main(String a[])
{
Vector v = new Vector(10);
v.add(3);
v.add(2.3);
v.add("hello");
v.add('h');
v.add(23423);
System.out.println(v.size());
System.out.println(v);
v.removeElementAt(2);
System.out.println(v);

}

}

