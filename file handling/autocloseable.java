import java.io.*;

class A
{
public static  void main(String args[]) throws Exception
{

try(B b = new B(); FileWriter fw = new FileWriter("a.txt",true);)
{
fw.write("hey buddy whats up");

}

}
}

class B implements Closeable
{
public void close()
{
System.out.println("close");
}
}