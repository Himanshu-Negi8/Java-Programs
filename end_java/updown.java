 class A
{
public static void main(String args[])
{
C c = new B(); //parent object can have the memory of child class 
c.show();
B obj = (B)c; //downcasted in B class object
d.show1();

}

} 

class B extends C
{

public void show()
{
System.out.println("B is here");
}
public void show1()
{
System.out.println("B show1");
}

}

class C
{

void show()
{
System.out.println("C is here");
}
}