class A
{
 public static void main(String a[])
{
 String s="12xd4";
 String p= " ";
 for(int i=0;i<s.length();i++)
{
 if(Character.isDigit(s.charAt(i)))
{
 p+=s.charAt(i);
}
}
for(int i=p.length()-1;i>=0;i--)
System.out.print(p.charAt(i));
}
}