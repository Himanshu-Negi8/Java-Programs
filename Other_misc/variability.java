class A
{

public static void main(String a[])
{
  int arr[]={1,2,4};
  B obj = new B();
 obj.show(arr);
}

}


class B
{
void show(int ...x)
{
for(int i:x)
System.out.println(i);
}

}