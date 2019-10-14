class A
{

public static void main(String args[])

{

String s = "aaaabbbbbbbbbbbhuuuuuu";
char c[] = s.toCharArray();
int count=0;
char result = s.charAt(0);
for (int i=0;i<s.length();i++)
{
  int cur_count=0;
 for(int j=i+1;j<s.length();j++)
  {     
	if(s.charAt(i)!=s.charAt(j))
	{
	break;
	}
     ++cur_count;
  }
  if(cur_count>count)
  {
     count = cur_count;
    result = s.charAt(i);
  }
}


System.out.println(result);

}


}