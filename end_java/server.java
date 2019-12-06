import java.net.*;
import java.io.*;

class Server
{
public static void main(String args[]) throws Exception
{
ServerSocket sc = new ServerSocket(8000);
Socket s = sc.accept();
InputStream is = s.getInputStream();
DataInputStream dis = new DataInputStream(is);
String p = dis.readUTF();
System.out.println(p);

OutputStream os = s.getOutputStream();
DataOutputStream dos = new DataOutputStream(os);
dos.writeUTF("hey client");
dos.close();


}
}