import java.net.*;
import java.io.*;

class A
{
	public static void main(String[] args) throws Exception {
		File f = new File("a.txt");
		URL u = f.toURL();
		String s ="";
		InputStream is = u.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
	}
}