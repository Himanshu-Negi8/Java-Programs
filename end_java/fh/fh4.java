import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{
FileWriter fw = new FileWriter("b.txt",true);
BufferedWriter br = new BufferedWriter(fw);
br.write("conie");
br.newLine();
br.write("mogambo");
br.close();

FileReader fr = new FileReader("b.txt");
BufferedReader brw = new BufferedReader(fr);
String s ="";
while((s=brw.readLine())!=null)
{
System.out.println(s);
}
}
}