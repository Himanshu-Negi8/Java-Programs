class A
{
 public static void main(final String a[])
{int sum=0;
int i=0;
 for(String r:a)
{
 i=Integer.parseInt(r);
if(i>0)
sum+=1;
else
break;
}
System.out.println(sum);
}
}
