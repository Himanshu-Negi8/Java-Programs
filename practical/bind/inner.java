class A
{
	public static void main(String[] args) {
		B outer = new B();
		B.C obj= outer.new C();
		System.out.println(obj.i);
	}
}


class B
{

	class C
	{
		int i=50;
	}
}