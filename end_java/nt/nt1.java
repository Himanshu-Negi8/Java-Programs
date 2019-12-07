import java.io.*;
import java.net.*;

class A
{
public static void main(String a[]) throws Exception
{
InetAddress ia =InetAddress.getLocalHost();
System.out.println(ia);
System.out.println(ia.getHostAddress());
System.out.println(ia.getHostName());
System.out.println(ia.getByName("www.4ono.com"));
}
}