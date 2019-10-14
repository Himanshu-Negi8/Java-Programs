class A

{
 public static void main(String a[])
{
 B obj = new B();
//obj.a = new int[3];//we can't assign a new memory to arrray a as it is define as final

obj.a[0] = 23;//array is final but array fields are not final so we can change the value inside the array
for(int x:obj.a)
System.out.println(x);


}
}

class B
{
final int a[] = {1,2,3};

}