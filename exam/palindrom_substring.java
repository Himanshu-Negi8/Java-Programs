 import java.util.*;
class A

{
public static void main(String args[])
{

String s="abba";
//List list1 = new;
 Vector<String> obj = new Vector<String>();
Vector<String> ob = new Vector<String>();

for(int i=0;i<s.length();i++)
{
 for(int j=i+1;j<=s.length();j++)
 {
    String temp = s.substring(i,j);
   obj.add(temp);
    System.out.println(temp);
 }

}
System.out.println("-------");
for(int i=0;i<obj.size();i++)
{
 String temp = obj.get(i);
 String rev = new StringBuffer(temp).reverse().toString();
 if(temp.equals(rev))
  ob.add(temp);

}
for(int i=0;i<ob.size();i++)
{
System.out.println(ob.get(i));
}
System.out.println("-------");


int len = ob.get(0).length();
String max="";

/*for(int i=0;i<ob.size();i++)
{
 String temp = ob.get(i);
 if(len<temp.length())
    max = temp;
System.out.println(temp);
}*/

for(String m:ob)
if(m.length()>len)
max=m;
System.out.println(max);

}
}