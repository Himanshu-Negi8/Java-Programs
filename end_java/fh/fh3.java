import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{
FileReader fr = new FileReader("a.txt");
BufferedReader br = new BufferedReader(fr);
String s ="";
while((s=br.readLine())!=null)
{
System.out.println(s);
}

}

}