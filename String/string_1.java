class A
{
 public static void main(String a[])
 {
   char c[] = {'a','b','c','d'};
   String s = new String(c);
   System.out.println(s);
   char ar[] = {'a','b'};
   String1 ob = new String1(ar);
   System.out.println(ob);
 }


}


class String1
{
 String s ="";
 String1(char arr[])
{
 for(char m:arr)
  s+=m;
}
public String toString()//in string class a toString method that takes char arr and return as a string which we are overriding here
{
return s;
}
}