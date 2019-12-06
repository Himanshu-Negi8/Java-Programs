
import java.net.*;
import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{
URL  u = new URL("https://github.com/Himanshu-Negi8/Java-Programs/blob/master/file%20handling/autocloseable.java");
System.out.println(u.getHost());//return host name only
System.out.println(u.getPort()); //returns port  number
System.out.println(u.getProtocol()); //retunrs the protocol is used specified in url
System.out.println(u.getFile());//retunrs file name
}
}