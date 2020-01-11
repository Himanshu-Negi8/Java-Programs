import java.io.*;
public class TW10
{
	public static  void main(String args[])throws Exception
	{
		FileOutputStream fos=new FileOutputStream("tw10.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		A a=new A();
		oos.writeObject(a);
		oos.close();
	
		System.out.println("reading object..");
		FileInputStream fis=new FileInputStream("tw10.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		A m=(A)o;
		System.out.println("name:"+m.name);
		System.out.println("password:"+m.password);
		ois.close();
	}

}
class A implements Serializable
{
	String name="himanshu";
	transient String password="qwerty12";
}
