class A
{
 
 public static void main(String args[])
 {
 
  String s="cddddcccac";
  int min=1;
  char result ='\0';
  int freq[] = new int[256];
  
  for(int i=0;i<s.length();i++)
  {
    freq[s.charAt(i)]++;
    if(freq[s.charAt(i)]<=min)
    {
      min = freq[s.charAt(i)];
      result = s.charAt(i);
    }
  } 
 
  System.out.println(result);
 }

}


