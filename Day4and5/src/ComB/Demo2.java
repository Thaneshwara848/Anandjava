package ComB;

class Bank
{
	 public void roi()
	{
		System.out.println("10 % ");
	}
}
class Sbi extends Bank
{
	
}
class Axis extends Bank
{
	public void roi()					// same methods same signature 
	{
		System.out.println("13 % ");	// but dut diff implementation : over riding
	}
}
public class Demo2 {
	public static void main(String[] args) {
		
//		Sbi s = new Sbi();
//		s.roi();
//		Axis a = new Axis();
//		a.roi();
		
		Bank s = new Sbi();		
		s.roi();
		Bank a = new Axis();
		a.roi();
				
	}
}
