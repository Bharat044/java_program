import java.util.*;
class Pointfunc{
	static Scanner in = new Scanner(System.in);
	static Point pArr[] = new Point[5];
		static int i,j;
		static Point temp= new Point();
		static double x,y;
		                    //input from user
		static void getInput(){
			for(i=0;i<pArr.length;i++){
			System.out.println("Enter the elements of point "+(i+1)+" : ");
			System.out.println("enter the value of x :");
			x=in.nextDouble();
			System.out.println("Enter the value of y :");
			y=in.nextDouble();
			pArr[i]=new Point(x,y);
		}
		for(i=0;i<pArr.length;i++){
			for(j=0;j<pArr.length;j++){
				if(pArr[i].getY()<pArr[j].getY()){
					temp=pArr[i];
					pArr[i]=pArr[j];
					pArr[j]=temp;
				}
			}
		}
	}
		static void displayElement(){
			System.out.println("Sorted array is :");
		for(i=0;i<pArr.length;i++){
			System.out.println(pArr[i].getX() + " " +pArr[i].getY());
		}
		}
		public static void main(String args[]){
			getInput();
			displayElement();

		}
		}
