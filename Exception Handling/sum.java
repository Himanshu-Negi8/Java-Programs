import java.io.*;
class A
{
public static void main(String args[]) throws Exception
{

char a;
a =(char)System.in.read();
int b =Character.getNumericValue(a);
System.in.read();
System.in.read();
char c=(char)System.in.read();
int d = Character.getNumericValue(c);
System.out.println(d+b);

/*int a;
a=System.in.read();
System.out.println(a);

a=System.in.read();
System.out.println(a);
a=System.in.read();
System.out.println(a);*/

}
}