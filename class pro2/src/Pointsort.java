import java.util.*;
class Pointsort{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Point pArr[] = new Point[5];
		int i,j;
		Point temp= new Point();
		double x,y;
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
		System.out.println("Sorted array is :");
		for(i=0;i<pArr.length;i++){
			System.out.println(pArr[i].getX() + " " +pArr[i].getY());
		}
	}
}