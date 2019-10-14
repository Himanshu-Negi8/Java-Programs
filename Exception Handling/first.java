class A
{
public static void main(String args[])
{
int a=5;
try{
System.out.println(a/Integer.parseInt(args[0]));
}catch(Exception e)
{
 e.printStackTrace();
}
/*catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
catch(ArithmeticException w)
{
System.out.println(w);
}*/
System.out.println("executed");
}
}