class A
{
 public static void main(String a[])
{
 B ob = new B();
 System.out.println(ob.show("Aam","Shyam",235235,3));
}
}

class B
{
String result = "";
 String show(String s1,String s2,int num,int key)
{
 if(s1.compareTo(s2)<0)
{
 result = ""+s1.charAt(0)+s2.charAt(s2.length()-1);
}
else
{
 result = ""+s2.charAt(0)+s1.charAt(s1.length()-1);
}

String left="";
String right="";
String s=Integer.toString(num);
left = ""+s.charAt(key-1);
right = ""+s.charAt(s.length()-key);


result+=left+right;

if(Character.isUpperCase(result.charAt(0)))
{
Character.toLowerCase(result.charAt(0));
}

 /*if(Character.isLowerCase(var))
{
 Character.toUpperCase(var);
 result.charAt(0) = var;
}
else
{
 Character.toLowerCase(var);
 result.charAt(0)=var;
}*/
return result;
}
}