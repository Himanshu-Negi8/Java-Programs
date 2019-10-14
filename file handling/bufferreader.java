import java.io.*;

class A
{

public static void main(String args[]) throws Exception
{

//FileWriter fw = new FileWriter(f,true);

/*BufferedWriter bfr = new BufferedWriter(fw);
bfr.write("seema");
bfr.newLine();
bfr.write("gita");
bfr.newLine();
bfr.write("sita");
bfr.close();*/
try
{
FileReader fr = new FileReader("a.txt");
String s="";
BufferedReader br = new BufferedReader(fr);
while((s=br.readLine())!=null)
System.out.println(s);


br.close();
}
catch(Exception e)
{
System.out.println(e);

System.out.println("Hh");
}

}
}