package com;
// aquring the propert from parwntr to child 
class Parent  // super  // base class 
{
	int site= 5;
	int money= 500000;
	String car = "BMW";
	
	void use()
	{
		System.out.println("SIte :"+site);
		System.out.println("Money :"+ money);
		System.out.println("CAr :"+ car );
	}
}
class Child  extends Parent
{
//	int site= 5;
//	int money= 500000;
//	String car = "BMW";
	String car = "Maruthi";
		// we can re use this property from Parent to child 
	void use()
	{
		System.out.println("SIte :"+site);
		System.out.println("Money :"+ money);
		System.out.println("CAr :"+ car );
		System.out.println("CAr :"+ super.car );
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.use();
		System.out.println("====child=====");
		Child c = new Child();
		c.use();
	}
}
