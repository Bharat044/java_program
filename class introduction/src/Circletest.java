import java.util.*;
class Circle {
	int radius;
	final double PI = 3.14;
	Circle(){
		radius=1;
	}
	Circle(int radius){
		this.radius=radius;
	}
	void area(){
		System.out.println("Area : " +(PI*radius*radius));
	}
	void circumference(){
		System.out.println("circumference : " +(2*PI*radius));
	}
    void display(){
    	System.out.println("radius : "+radius);
    	area();
    	circumference();
    }
}

    public class Circletest{
    	public static void main(String args[]){
    		Scanner in = new Scanner(System.in);
    		Circle c1 = new Circle();
    		c1.display();
    		System.out.println("Enter the radius :");
    		int radius = in.nextInt();
    		Circle c2 = new Circle(radius);
    		c2.display();
    	}
    }
