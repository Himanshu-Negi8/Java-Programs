
class A

{
public static void main(String a[])
{
B b = new B();
b.show();
}

}



class B

{
void show()
{

int a[]= {1,2,3};
int b[][] = {a,a};

for(int x[]:b)
for(int y:x)
System.out.println(y);
}

}