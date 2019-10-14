
class A
{
 public static void main(String a[])
{
  B ob = new B();
  ob.show();
}
}





class B
{
void show()
{

  int c [][] = new int [2][];
  c[0] = new int[10];
  c[1] = new int[5];
int k=0;

 for(int i=0;i<c.length;i++)
{
 for(int j=0;j<c[i].length;j++)
{
  c[i][j]=k;
  k++;
 }
}

 for(int i=0;i<c.length;i++)
 for(int j=0;j<c[i].length;j++)
  System.out.println(c[i][j]);

}
}





// here program for one-d array inside two-d array
/*class A
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

 int a[] = {1,2,3};
 int b[][] = {a,{7,8,9,34,56}};
 for(int i=0;i<b.length;i++)
 for(int j=0;j<b[i].length;j++)
 System.out.println(b[i][j]);
 
}
 
}*/