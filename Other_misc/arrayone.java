class A
{

public static void main(String a[])
{
 B b = new B();
b.show();
 
} 

}



class B
{
  void show()
{
 int []b = {10,20,30};
 int [] a = new int [6];
 for(int i=0;i<b.length;i++)
{
 a[i]=b[i];
}
 

a[5] = 40;
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}

}
 
  
}