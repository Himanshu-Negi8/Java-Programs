import java.net.*;
import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{
InetAddress ia = InetAddress.getLocalHost();
System.out.println(ia);
System.out.println(ia.getHostAddress());
System.out.println(ia.getHostName());
System.out.println(ia.getByName("www.google.com"));

}
}