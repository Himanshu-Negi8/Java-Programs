class A
{
 public static void main(String a[])
 {
  B b = new B();
  B b1 = new B();
  //b.i=34;//here giving the instance value to i
  //b.j= 60;//here giving tor changing the static value of j
  b.show();
  b1.j = 4567;
  b1.show();
 }

}


class B
{
int i;//instance variable

static int j =45;
/*static {
i=20;// we can not reference a instance variable inside a static method
}*/

void show()
{
 System.out.println(this.i);
 System.out.println(this.j);//here this keyword refers to the obj in main method
}
 
}