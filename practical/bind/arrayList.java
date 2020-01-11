import java.util.*;

class A
{
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(12);
		a.add(2345.567);
		a.add("himanshu");
		a.add(34);
		Iterator  ia = a.iterator();
		while(ia.hasNext()){
			System.out.println(ia.next());
		}
	}
}