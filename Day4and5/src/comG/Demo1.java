package comG;

public class Demo1 {
	public static void main(String[] args) {
		
		int arr[]= {1,54,6,7,3,5,7,8,9};
				// collectionof similer type of records 
				// int : only number 
		for(int  i=0 ;i<arr.length ;i++)
		{
			System.out.println("I :"+ arr[i]);
		}
		System.out.println("====== For each ===== ");
		for(int x :arr) {
			System.out.println("X :"+x);
		}
		System.out.println("========");
		int ar[]= new int[5];
		ar[0]=0;
		ar[1]=100;
		ar[2]=200;
		ar[3]=300;
		ar[4]=400;
		//ar[5]=500;ar[6]=500;ar[7]=500; size fixed 
		for(int  i=0 ;i<ar.length ;i++)
		{
			System.out.println("I :"+ ar[i]);
		}
		
	}
}
	
