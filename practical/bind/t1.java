class A
{
// 	public static void main(String[] args) {
// 		Thread t = new Thread(){
// 			public void run(){
// 				System.out.println("hello");
// 			}
// 		};
// 		t.start();
// 	}
// }


 public static void main(String[] args) throws Exception {
 	B b = new B();
 	C c = new C();

 	b.start();
 	b.join();
 	
 	c.start();
 }
}

class B extends Thread{

	public void run(){
		for(int i=0;i<5;i++){
			try{

			sleep(500);
		}catch(Exception e){

		}
			System.out.println("hello"+i);
		}
		
		
	}
}
class C extends Thread{

	public void run(){
		for(int i=0;i<5;i++){
			try{

			sleep(500);
		}catch(Exception e){

		}
			System.out.println("world"+i);
		}
		
		
	}
}