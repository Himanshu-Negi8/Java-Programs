class A 
{
 public static void main(String a[])
 {
   C c = new C();
   c.show();
 
 }
}

class C extends B
{
int i=10;
C()
{
super();
}
void show()
{
System.out.println(this.i+" it is C child class i variable");
super.show();

}


}

class B 
{
 
 int i=0;
 B()
{
System.out.println("Parent class constructor");
}
 void show()
{
 i=100;
System.out.println(i);
}

}