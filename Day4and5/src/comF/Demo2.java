package comF;

public class Demo2 {
	public static void main(String[] args) {
//		String :  Immuatbale : we cant change : born -- die 
		String name=new String("Thanesh");
		name.concat("Kumar");
		System.out.println(name);
		
		// String buffer : mutable : we can chage 
			// desig : developer 
					// sr Developer
		StringBuffer sb= new StringBuffer("Thanesh");
		sb.append("Kumar");
		System.out.println(sb);
		
		sb.insert(0, "Mr ");
		System.out.println("Insert :"+sb);
		
		sb.delete(10, 15);
		System.out.println("Delete : "+sb);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1= new StringBuilder("Thanesh");
		sb1.append("Kumar");
		System.out.println(sb1); 
	}
}							
//	id		int  
//	NAME	String 					: fixed : im muatble : we cant change 
//	AGe		int 
//	salary	int
//	designation Stringbuffer; / bulder 		: not fixed : mutable : we can change 
