class A
{

 public static void main(String[] args)  {
 	B b = new B();
 	
 	Thread obj = new Thread(b);
 	obj.start();
 	
 }
}

class B implements Runnable{

	public void run(){
		for(int i=0;i<5;i++){
			try{

			Thread.sleep(500);
		}catch(Exception e){

		}
			System.out.println("hello"+i);
		}
		
		
	}
}