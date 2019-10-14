class A
{

 public static void main(String a[])
{
B ob = new B();
ob.show();

}
}

class B implements I1,I2
{
void show()
{
 System.out.println(I1.i);
}
 /*int m =i;
interface_two.java:12: error: reference to i is ambiguous
 int m =i;
        ^
  both variable i in I1 and variable i in I2 match
1 error*/

}

interface I1
{
 int i =45;
}

interface I2
{
int i =23;
}