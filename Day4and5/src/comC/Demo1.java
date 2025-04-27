package comC;
abstract class Bank{
//	void roi()
//	{
//		System.out.println("10 %");
//	}
//	i want to hide this implementation only show funcunality to user 
//	by using abstarct 
	abstract  void roi();
	void withdraw() 
	{
		// abstract class can have both 
		//abstarct method and non abstarct method also
		//  0 - 100 % safe and secure 
	}
}
class Sbi extends Bank{
	@Override
	void roi() {
			System.out.println("10%");
	}
	//	we have to provide the implementation in child class 
}
class Axis extends Bank{
	@Override
	void roi() {
		System.out.println("13%");		
	}
}
public class Demo1 {
		public static void main(String[] args) {
			Sbi s = new Sbi();s.roi();
			Axis a = new Axis();a.roi();
//			Bank b = new Bank();
		}
}
// if class decaled as abstarct this will become abst class 
// it can have both abstyarct method and non abstarct also 
// 0 - 100 %
//we can not crrate objof abstact class 
