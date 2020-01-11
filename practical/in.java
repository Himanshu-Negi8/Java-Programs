class A
{
public static void main(String args[])
{
String m = "abc";
String p="";
for(int i=0;i<m.length();i++)
{
char c = m.charAt(i);
 p = p+(++c);
}
System.out.println(p);
}
}