class A
{
	public static void main(String[] args) {
		String s ="aaaaabbbbcdddd";
		int [] freq = new int[s.length()];
		char []arr = s.toCharArray();
		char minChar = s.charAt(0);
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]&&arr[i]!='0'){
					freq[i]++;
					arr[j]='0';
				}
			}
		}

		int minFreq = freq[0];
		
		for(int i=0;i<freq.length;i++){
			if(minFreq>freq[i]&&arr[i]!='0'){
				 minChar = arr[i];
			}
		}
		System.out.println(minChar);
	}
}