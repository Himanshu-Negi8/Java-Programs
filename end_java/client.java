import java.net.*;
import 

class Client
{
public static void main(String args[]) throws Exception
{
Socket s = new Socket("localhost",8000);
OutputStream os = s.getOutputStream();
DataOutputStream dos = new DataOutputStream(os);
dos.writeUTF("hey server");



InputStream is = s.getInputStream();
DataInputStream dis = new DataInputStream(is);
String p = dis.readUTF();
System.out.println(p);


}
}