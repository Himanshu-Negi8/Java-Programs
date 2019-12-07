import java.io.*;
import java.net.*;

class A
{
public static void main(String a[]) throws Exception
{
File f = new File("nt2.java");
URL u = f.toURL();
InputStream is = u.openStream();
BufferedReader br = new BufferedReader(new InputStreamReader(is));
String s ="";
while((s=br.readLine())!=null)
{
System.out.println(s);
}
is.close();
br.close();
}
}