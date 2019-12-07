import java.io.*;
import java.net.*;

class A
{
public static void main(String a[]) throws Exception
{
URL u =new URL("https://4ono.com/");
System.out.println(u.getHost());
System.out.println(u.getPort());
System.out.println(u.getProtocol());
System.out.println(u.getFile());
}
}