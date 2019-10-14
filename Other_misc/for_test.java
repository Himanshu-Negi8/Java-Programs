class test
{
	public static void main(String a[])
	{
		paper obj = new paper();
		System.out.print(paper.a);
		obj.show();
	}
}


class paper
{
	static int a;
	void show()

	{
		a=10;
		System.out.print(a);
	}
}