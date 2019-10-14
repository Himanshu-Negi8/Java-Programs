class A

{

public static void main(String a[])
{

int free=100;
int unit =304;
if(unit<=100)
System.out.println("Free no bill");
else if(100<unit &&unit<=200)
System.out.println((unit-free)*1);
else if(200<unit&& unit<=300)
System.out.println((unit-2*free)*5+free*1);
else
System.out.println((unit-3*free)*10+free*1+free*5);


}


}