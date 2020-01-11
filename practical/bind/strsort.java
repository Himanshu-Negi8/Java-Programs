class A
{
	public static void main(String[] args) {
		String [] array = new String[]{"him","abc","def"};

		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i].compareTo(array[j])>0){
				String temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
			
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}