import java.io.*;

class A
{
public static void main(String args[]) throws Exception
{
FileReader fr = new FileReader("b.txt");
FileWriter fw = new FileWriter("b.txt",true);
int i=0;
int count =0;
int diff=0;
while((i=fr.read())!=-1)
{
count++;

}
if(count>500)
{
fw.write("himanshu");
fw.close();
}
else
{
diff = 500-count;

while(diff!=0)
{
 if((i=fr.read())!=-1)
fw.write((char)i);
else
 fr = new FileReader("b.txt");
diff--;
}
fr.close();
fw.write("himanshu");
fw.close();
}


}
}