import java.util.*;
class Vehicle{
	void display(){
	System.out.println("this is a Vehicle");
}
}
class Car extends Vehicle{
	@Override
	void display(){
		System.out.println("this is a car");
	}
}
class Bike extends Vehicle{
	@Override
	void display(){
		System.out.println("this is a bike");
	}
}
class two{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int number;
		System.out.println("please enter the number of tyres :");
		number=in.nextInt();
		switch(number){
			case(2):{
				Bike b1=new Bike();
				b1.display();
				break;
			}
			case(4):{
				Car c1 = new Car();
				c1.display();
			}
			default:{
				Vehicle v1=new Vehicle();
				v1.display();
			}
		}
	}
}