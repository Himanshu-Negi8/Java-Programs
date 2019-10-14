class A
{
public static void main(String a[])
{
//I1 i = new B()// will throw an error if same name method is static and having body in the interface and b class trying to overrride it
B obj = new B();
obj.show();
I1.show();

}

}


class B implements I1,I2
{
public void show()
{
// I2.show();
 System.out.println("Implement successful");
}

}


interface I1
{
 static void show()
{
System.out.println("hello buch");
}
}


interface I2
{
static void show()
{

}

}