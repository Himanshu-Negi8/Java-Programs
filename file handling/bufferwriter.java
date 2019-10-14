import java.io.*;

class A
{

public static void main(String args[]) throws Exception
{
File f = new File("a.txt");
FileWriter fw = new FileWriter(f,true);
BufferedWriter bfr = new BufferedWriter(fw);
bfr.write("seema");
bfr.newLine();
bfr.write("gita");
bfr.newLine();
bfr.write("sita");
bfr.close();
}
}