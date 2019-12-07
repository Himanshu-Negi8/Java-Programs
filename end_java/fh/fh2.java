import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{

try(B b = new B();FileWriter fw = new FileWriter("a.txt",true);)
{
fw.write("hey bucati");
}
try
{
FileReader fr = new FileReader("a.txt");
int k=0;
while((k=fr.read())!=-1)
{
System.out.println((char)k);
}
}catch(Exception e){System.out.println(e);}
}
}

class B implements Closeable
{
public void close()
{
System.out.println("Closed");
}
}