class A
{
 
public static void main(String a[])
{ int []arr = {1,2,3};
  int i = 20;
 B b = new B();
 b.show(i,arr);
}
  
}


class B
{
 void show(int z, int ...x)
{
 System.out.println(z);
 for(int m:x)
 System.out.println(m);

}
}