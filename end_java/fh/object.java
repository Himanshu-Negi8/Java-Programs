import java.io.*;

class A 
{
public static void main(String a[]) throws Exception
{
FileOutputStream fos = new FileOutputStream("d.txt",true);
ObjectOutputStream oos = new ObjectOutputStream(fos);
B b = new B();
oos.writeObject(b);
oos.close();
FileInputStream fis = new FileInputStream("d.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
Object o =ois.readObject();
B c =(B)o;
System.out.println(c.i);
ois.close();
}

}
class B implements Serializable
{
int i=10;
}


