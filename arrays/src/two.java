import java.util.*;
class two {
		static Scanner in = new Scanner(System.in);
		static int num[] =new int[10];
		static int rowcounter=0;
		static int searchElement=0;
	static void getInput(){
		//input from user
		for(rowcounter=0;rowcounter<num.length;rowcounter++) {
			System.out.println("enter the element {"+(rowcounter+1)+"}");
			num[rowcounter]=in.nextInt();
			System.out.println();
		}

	}
	static void searchElement(){
		//Ask for number to be searched
		System.out.print("Enter the elemnt to be searched : ");
		searchElement=in.nextInt();

	}
	static void displayElement(){
				System.out.print("Elements in the array are : ");
		for (rowcounter=0;rowcounter<num.length;rowcounter++) {
			System.out.println(num[rowcounter]);
		}
	}
	static void findElement(){
		//search for the elemnt
		boolean flag=false;
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
	public static void main(String args[]){
		getInput();
		searchElement();
		findElement();
	}

}