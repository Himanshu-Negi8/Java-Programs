import java.io.*;

class B implements Serializable
{
int i =10;
}

class A
{
public static void main(String args[])throws Exception
{
FileOutputStream fos = new FileOutputStream("c.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
B b = new B();
oos.writeObject(b);
oos.close();

FileInputStream fis = new FileInputStream("c.txt");
ObjectInputStream ois = new ObjectInputStream(fis);

Object o = ois.readObject();
B c = (B)o;
System.out.println(c.i);
ois.close();

}
}