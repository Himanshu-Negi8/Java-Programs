import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{

FileOutputStream fos = new FileOutputStream("b.txt");
FileInputStream fis = new FileInputStream("b.txt");
fos.write('a');
fos.close();
int line=0;
while((line=fis.read())!=-1)
System.out.println((char)line);
fis.close();


}
}