import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{FileOutputStream fos=null;
try{
fos = new FileOutputStream("c.txt",true);
fos.write('a');
fos.close();
}catch(Exception e){}

FileInputStream fis = new FileInputStream("c.txt");
int i =0;
while((i=fis.read())!=-1)
System.out.println((char)i);


}

}