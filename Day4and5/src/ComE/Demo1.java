package ComE;
			
class A
{
	String name="Suresh";				// litrals 
	String name1="Suresh";
	String name2="suresh";
	String name3=new String("Suresh");	// new 
	String name4=new String("Suresh");
	A()
	{
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name==name1);  // true
		System.out.println(name1==name2); // false
		System.out.println(name1==name3); //  false
		System.out.println(name3==name4); //  false		== it will check refrence
		System.out.println(name3.equals(name)); //  true / .equals it will check the contant 
	}
}
public class Demo1 {
	public static void main(String[] args) {
		A a = new A();
	}
}

						// == and .equals		