class A
{
 public static void main(String a[])
{
 Vector1 ob = new Vector1();

ob.add(2.3);
ob.add("himanshu");
ob.add("negi");
ob.add(2);
System.out.println(ob.elementAt(1));
ob.setElementAt(23,0);
System.out.println(ob.elementAt(0));
}

}

class Vector1
{
static int i=0;
Object arr[] = new Object[20];

void add(Object o)
{
arr[i++]=o;

}
void setElementAt(Object o,int i)
{
 arr[i]=o;
}

Object elementAt(int i)
{return arr[i];
}

}