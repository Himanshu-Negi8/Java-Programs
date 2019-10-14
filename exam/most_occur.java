//most occuring character in a string 

class A
{

public static void main(String args[])
{
  
String s = "Hzardhhhhhhhddd";
int len = s.length();
int freq[] = new int[256];
int max=0;
char result= '\0';
for(int i=0;i<len;i++)
{
 freq[s.charAt(i)]++;
 if(max<freq[s.charAt(i)])
{
 max = freq[s.charAt(i)];
 result = s.charAt(i);
}

}

System.out.println("Most occuring charactet is "+ " " + result);

}

}