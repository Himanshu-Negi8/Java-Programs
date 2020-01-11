
import java.net.*;
import java.io.*;

class Client
{
public static void main(String args[])throws Exception
{
Socket s = new Socket("localhost",8000);
OutputStream os = s.getOutputStream();
DataOutputStream dos = new DataOutputStream(os);
dos.writeUTF("abc");
InputStream is = s.getInputStream();
DataInputStream dis = new DataInputStream(is);
String m = dis.readUTF();
System.out.println(m);
}
}