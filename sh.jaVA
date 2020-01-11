class A
{
public static void main(String args[])
{
String a = "abcde";
String p="";

for(int i=0;i<a.length();i++)
{
char ch =a.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u')
{
p=p+(++ch);
}
else
{
p=p+(--ch);
}
}
System.out.println(p);
}
}