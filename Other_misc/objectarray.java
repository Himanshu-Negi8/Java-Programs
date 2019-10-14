



class A
{
int a=10;
public static void main(String a[])
{
//Object o[] = new int [2];
Object o[] = {new A(),new B()};

//System.out.println(o[0].a);gives compile arror symbol a not found beccause a is not present in object class 
System.out.println(((A)o[0]).a);//here downcasted object into a 
System.out.println(((B)o[1]).b);//downcast in b type

}
}


class B
{
int b =20;
}






















/*class A extends B
{
public static void main(String a[])
{
 B obj = new B();
 B x[] = new B[2];
 x[0] = new A();//here b type object array hacving memory of a that is upcasting
 x[0]=(B)x[0];//downcasted to B type object
 x[1]=new B();
 System.out.println(x[0].i);//downcasted x[0] w.r.to B kind object thats why able to use i
}
}


class B
{
int i=0;
}*/