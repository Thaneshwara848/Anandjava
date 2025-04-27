package comA;
class Emp
{
	 int id ;
	 String  name;
	 int age;
}
class Clerk extends Emp
{
	int salary = 20000;
	String 	desig = "Clerk";
	 Adress a =new Adress();
}
class Dev extends Emp
{
	int salary = 50000;
	String 	desig = "Dev";
	 Adress a =new Adress();
}
class Manager extends Emp
{

	int salary = 90000;
	String 	desig = "Manager";
	 Adress a =new Adress();
}
class Tester  extends Emp
{
	int salary = 30000;
	String 	desig = "Tester";
	 Adress a =new Adress();
}
class Adress 
{
//		homeno
//		street
//		location
//		pin
}
public class Demo1 {

	public static void main(String[] args) {
		
//			Composition : is a relation   : extends 
//			Aggration :	has a relationship  : we create a obj 
	}

}

class Bike
{

}
class Pulsar extends Bike
{
	Engine e= new Engine();
}
class Royal extends Bike
{	
	Engine e= new Engine();
}
class Engine
{

}



