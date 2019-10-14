class A
{

public static void main(String args[])
{

int a=5;
try
{
System.out.println(5/0);
}
catch(Exception e)
{
}finally{
System.out.println("34");
}
System.out.println("34");
}
}






/*class A

{
public static void main(String args[])
{
int sum=0;
for(String s:args)
try{
sum+= Integer.parseInt(s);	
System.out.println(sum);
}catch(NumberFormatException e)
{
System.out.println(e);
}

}
}*/