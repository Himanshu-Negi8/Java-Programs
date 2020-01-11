import java.io.*;

class A
{
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		B obj = new B();
		oos.writeObject(obj);
		oos.close();
		fos.close();
		FileInputStream fis = new FileInputStream("a.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		B b =(B)o;
		System.out.println(b.a);
		System.out.println(b.i);


	}
}

class B implements Serializable
{
	int a = 10;
	transient int i =456;
}