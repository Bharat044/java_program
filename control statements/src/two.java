import java.util.*;
class two{
	public static void main(String[] args) //main program to show the name of month as per user's choice
	{
		Scanner in=new Scanner(System.in);
		char a;
		do {
			system.out.println("please enter any value between 1 to 12");
			int number=in.nextInt();
			switch(number) {
				case(1):
				System.out.println("name of the month is january");
				break;
				case(2):
				System.out.println("name of the month is february");
				break;
				case(3):
				System.out.println("name of the month is march");
				break;
				case(4):
				System.out.println("name of the month is april");
				break;
				case(5):
				System.out.println("name of the month is may");
				break;
				case(6):
				System.out.println("name of the month is june");
				break;
				case(7):
				System.out.println("name of the month is july");
				break;
				case(8):
				System.out.println("name of the month is august");
				break;
				case(9):
				System.out.println("name of the month is september");
				break;
				case(10):
				System.out.println("name of the month is october");
				break;
				case(11):
				System.out.println("name of the month is november");
				break;
				case(12):
				System.out.println("name of the month is december");
				default:
				System.out.println("Invalid  number is chosen");
			}
			System.out.println("press Q for exit the program");
			a=in.next().charAt(0);
			while (a!='Q');	}
		}
 }