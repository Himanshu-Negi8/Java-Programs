
import java.net.*;
import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{
File f = new File("i1.java");
URL u = f.toURL();
//URL  u = new URL("https://github.com/Himanshu-Negi8/Java-Programs/blob/master/file%20handling/autocloseable.java");
System.out.println(u);
System.out.println(u.getProtocol());
InputStream is = u.openStream();
BufferedReader bfr = new BufferedReader(new InputStreamReader(is));

String s ="";
while((s=bfr.readLine())!=null)
System.out.println(s);
is.close();
bfr.close();

}
}