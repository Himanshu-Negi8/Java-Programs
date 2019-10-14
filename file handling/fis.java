import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{
FileInputStream fis = new FileInputStream("b.txt");
int line=0;
while((line=fis.read())!=-1)
System.out.println((char)line);

}
}