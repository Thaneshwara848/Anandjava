package ComB;
// polymorphism : same name but diff behivior 
//  poly : many 
// marphism : from 
//	many form   : same mathods but diff froms diff actiion 

		// boy : school ---- student 
//				: shop : customer 
//				: ground : player
//				: home : kids 
// same methond but diff behior : 
//complei time : over lodiing
			// method  over loding 

	// Same method name + multiple time + with diff diff paramnert + in same class : OL
// run time  : over riding 
		// method over riding 
	// same method name + same paramenter in child is : over riding ....!
class A
{
	void draw()
	{
		System.out.println("hi We are drawing..!");
	}
	void draw(int r)
	{
		System.out.println("hi We are drawing.. area of circle : "+ ( 2 * 2.7 * r *r ));
	}
	void draw(int l,int b)
	{
		System.out.println("hi We are drawing.. area of Rectangle : "+ ( l * b ));
	}
}
public class Demo1 {
	public static void main(String[] args) {
		A a = new A();
		a.draw();
		a.draw(10);
		a.draw(10, 20);
	}
}		
	//2 minuts time : quickely revise : Both Inheritance / polymorphism 
