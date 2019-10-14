import java.io.*;
class A
{
 
public static void main(String args[]) throws Exception
{
FileWriter fw = null;
try{
fw = new FileWriter("a.txt",true);
fw.write("abcd");
}catch(Exception e)
{
System.out.println(e);
}
finally{
if(fw!=null)
fw.close();
}
FileReader fr = new FileReader("a.txt");
int k=0;
while((k=fr.read())!=-1)
{
System.out.println((char)k);
}
}
}