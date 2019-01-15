import java.util.*;
class Date {
	int m; //month
	int d; //day
	int y; //year
	Date(){
		m=1;
		d=1;
		y=2000;
	}
	Date(int m,int d,int y){
		this.m=m;
		this.d=d;
		this.y=y;
	}
	void date(){
		System.out.println("Date : "+(m/d/y));
	}
	void display(){
		System.out.println("Date : "+(m)+"/"+(d)+"/"+(y)+"");
	}
	}
public class DateTest{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		Date d1 = new Date();
		d1.display();
		System.out.println("enter the month :");
		int m = in.nextInt();
		System.out.println("enter the day :");
		int d = in.nextInt();
		System.out.println("enter the year :");
		int y=in.nextInt();
		Date d2=new Date(m,d,y);
		d2.display();
	}
}
