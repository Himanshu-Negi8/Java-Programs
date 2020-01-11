class A
{
	public static void main(String[] args) {
		String str = args[0];
		String s2 = args[1];

		StringBuffer sb = new StringBuffer(str);
		if(sb.reverse().toString().equals(s2)){
			System.out.println("yes");
		}
				
	}
}