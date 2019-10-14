class A

{
 public static void main(String a[])
{
  char c[] = {'a','b','c','c','e'};
  String s = new String(c);
  System.out.println("this is string "+s);
 /*int l1 = s.length();
   System.out.println(s);
 for(int i=0;i<l1;i++)
{
  System.out.println(s.charAt(i));
}*/
char cc[] = new char[s.length()];
for(int i=0;i<s.length();i++)
 {
   cc[i] = s.charAt(i);
 }
  System.out.println(cc);
  
}

}

class  B

{

}