class A
{
 public static void main(String a[])
 {
   B obj = new B();
   System.out.println(obj.i);
 }

}

class B
{
 int i=40;//instance variable and initialize at the declration time.
/* do not set any value for instance variable and write i only{
i=10;//this block will copy in the class constructor and set value of i 10 instead of 0.
}*/
 B()
{
 System.out.println(i);
 i=23;
}


	
}