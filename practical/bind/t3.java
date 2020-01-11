class A
{

	public static void main(String[] args)throws Exception {
		B obj = new B();
		C ob = new C();
		ob.start();
		
		obj.start();

	}
}

class D 
{
	synchronized public static void print(int n){
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){

			}
			System.out.println(n*i);

		}
	}
}

class B extends Thread{

	public void run(){
		D.print(3);
	}
}

class C extends Thread{

	public void run(){
		D.print(5);
	}
}