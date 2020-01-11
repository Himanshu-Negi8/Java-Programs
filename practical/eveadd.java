class A

{
	public static void main(String args[])
	{
		String s="1231344592672";
		String s2="";
		System.out.println("ORIGINAL STRING :  "+s);
		for(int i=0;i<s.length();i++)
		{	char c=s.charAt(i);
			int j=Character.getNumericValue(c);
			
			if(j%2==0)
			{
			Integer ii=j;
			String m=ii.toString();
				if(!s2.contains(m))
				   s2=s2+m;
			}
		}
			System.out.println("RESULTANT STTRING :  "+s2);
	}
}
