import java.io.*;

class A
{
	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("hello.txt");
		int i=0;
		String s = "";

		while((i=fr.read())!=-1)
		{
			char ch = (char)i;
		if(Character.isDigit(ch))
		{
			s+=ch;
		}
		}
		
		
		FileWriter fw = new FileWriter("second.txt");
		fw.write(s);
		fw.close();
		fr.close();

	}
}