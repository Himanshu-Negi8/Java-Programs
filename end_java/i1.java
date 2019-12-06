
class A
{
public static void main(String args[])
{
B c = B.show();
System.out.println(c);

}
}

class B
{
private B()
{
}
static B show()
{
B b = new B();
return b;
}
}