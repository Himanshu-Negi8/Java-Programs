import java.io.*;

class A
{

public static void main(String args[]) throws Exception
{
int count =0;
File obj = new File("G:/Java Programs/file handling/a.txt");
System.out.println(obj.createNewFile());
File ob = new File("G:/Java Programs/file handling");
File f[] = ob.listFiles();
System.out.println(f[0]);
for(File o:f)
{
if(!o.isFile())
{
++count;
}

}
System.out.println(count);

/*FileWriter fr = new FileWriter(obj,true);
fr.write("hello");
fr.write("world");
fr.close();*/
}
}