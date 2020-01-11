class A
{
	 public static void main(String[] args) {

	 	String p = "123224446788";
	 	String m ="";

	 	for(int i=0;i<p.length();i++){

	 		char ch = p.charAt(i);
	 		int k = Character.getNumericValue(ch);

	 		if(k%2==0){
	 			Integer obj = k;
	 			String temp = obj.toString();

	 			if(!m.contains(temp)){
	 				m+=temp;
	 			}
	 		}
	 	}

	 	System.out.println(m);
		
	}
}
