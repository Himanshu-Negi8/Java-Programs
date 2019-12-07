import java.io.*;

class A
{
public static void main(String args[]) 
{
try{
FileWriter fw = new FileWriter("a.txt",true);
fw.write("hey bucati");
fw.close();
}catch(Exception e){System.out.println(e);}
}

}