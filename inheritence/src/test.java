import java.util.*;
class Shape{
	void display(){
		System.out.println("Inside shape class");
	}
}
class Rectangle extends Shape{
	@Override
	void display(){
		System.out.println("Inside rectangle class");
	}
}
class Circle extends Shape{
	@Override
	void display(){
		System.out.println(" Inside circle class");
	}
}
class Square extends Shape{
	@Override
	void display(){
		System.out.println("Inside Square class");
	}
}
public class test{
	public static void main(String args[]){
	Shape s[] = new Shape[10];
	char choice = 'r';
	int i=0;
	Scanner scn= new Scanner(System.in);
	while(choice != 'q')
	{
		switch(choice){
			case 'r' : s[i] = new Rectangle();
			           break;
			case 's' : s[i] = new Square();
			           break;
			case 'c' : s[i] = new Circle();
			           break;
			default : break;
		}
		i++;
	}	
	System.out.println("your choices :");
	for(i=0;i<s.length;i++){
		if(s[i] instanceof Rectangle ){
			System.out.println("choice Rectangle");
			s[i].display();
		}else if (s[i] instanceof Square ){
			System.out.println("choice Square");
			s[i].display();
		}else if (s[i] instanceof Circle ){
			System.out.println("choice Circle");
			s[i].display();		
		}
	}
	}
	
}