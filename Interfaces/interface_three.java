class A
{
public static void main(String a[])
{
B ob = new B();
ob.show();

}

}


class B extends C implements I
{



}

class C
{
public void show()
{
System.out.println("Make me false");
}
}

interface I
{
 void show();
}