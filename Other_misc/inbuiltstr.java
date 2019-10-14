class A
{
 public static void main(String a[])
{
  char c[] = {'q','a','s','e','f'};
  String obj = new String(c);
  char cc[] = obj.toCharArray();
  for(char d:cc)
  System.out.println(d);
}
 
}