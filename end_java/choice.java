
import java.io.*;
import java.net.*;

class A
{
public static void main(String args[]) throws Exception
{
FileInputStream fis = new FileInputStream("i1.java");
BufferedInputStream bfr = new BufferedInputStream(fis);
int line=0;
while((line=bfr.read())!=-1)
System.out.println((char)line);
bfr.close();
fis.close();

}
}