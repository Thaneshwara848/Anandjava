package comD;

interface I
{
	abstract void roi(); 
//	void withdraw() 
//	{
//		// interface  can have only  abstarct method 
//	100 % safe ands secure 
//	}
}
class Sbi implements I
{
	@Override
	public void roi() {
		System.out.println("10 %");
	}
}
class Axis  implements I
{
	@Override
	public void roi() {
		System.out.println("13 %");
	}	
}
public class Demo1 {
	public static void main(String[] args) {
		Sbi s = new Sbi();s.roi();
		Axis a = new Axis();a.roi();
//		Bank b = new Bank();
	}
}

// if class decalred as a interface this will become isterface
//it can have both abstyarct method
// 100%
// we can not create obj of interface 