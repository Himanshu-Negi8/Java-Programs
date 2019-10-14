class A
{

public static void main(String args[])
{

String s[];
s= args;
int sum=0;
for(int i=0;i<s.length;i++)
{
 char c[] = s[i].toCharArray();
 for(char d:c)
 if(Character.isDigit(d))
 {int k=Character.getNumericValue(d);
  sum+=k;
 }

}
 System.out.println(sum);

}

}