import java.net.*;
import java.io.*;

class Server
{
public static void main(String args[])throws Exception
{

ServerSocket sc = new ServerSocket(8000);
Socket s = sc.accept();
InputStream is = s.getInputStream();
DataInputStream dis = new DataInputStream(is);
String m = dis.readUTF();
String p ="";
for(int i=0;i<m.length();i++)
{
char c = m.charAt(i);
 p = p+(++c);
}
System.out.println(m);
OutputStream os = s.getOutputStream();
DataOutputStream dos = new DataOutputStream(os);
dos.writeUTF(p);

}
}