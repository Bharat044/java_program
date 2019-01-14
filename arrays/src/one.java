import java.util.*;
class one {
	public static void main(String args[]) {
		int num[] = new int[10];
		int rowcounter;
		int searchElement;
		Boolean flag;
		Scanner in=new Scanner(System.in);
		//input from user
		for(rowcounter=0;rowcounter<num.length;rowcounter++) {
			System.out.println("enter the element {"+(rowcounter+1)+"}");
			num[rowcounter]=in.nextInt();
			System.out.println();
		}
		//Ask for number to be searched
		System.out.print("Enter the elemnt to be searched : ");
		searchElement=in.nextInt();
		System.out.print("Elements in the array are : ");
		for (rowcounter=0;rowcounter<num.length;rowcounter++) {
			System.out.println(num[rowcounter]);
		}
		//search for the elemnt
		flag=false;
		for(rowcounter=0;rowcounter<num.length;rowcounter++){
			if(num[rowcounter] ==searchElement){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("Element found at location : " +rowcounter);
		}
		else
		{
			System.out.println("-1");
		}
	}
}