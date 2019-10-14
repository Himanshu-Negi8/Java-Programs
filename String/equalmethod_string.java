class A
{
 public static void main(String a[])
{
  B b1 = new B("hello");
  B b2 = new B("hello");
  System.out.println(b1.equals(b2));
}
}

class B

{
String s;
B(String s)
{
this.s = s;
}
public boolean equals(Object o)
{
B r = (B)o;
if(this.s.equals(r.s))
{
return true;
}
else
{
return false;
}

}
void show()
{
 System.out.println(this.s);
}
}
