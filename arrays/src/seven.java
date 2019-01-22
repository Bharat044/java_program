import java.util.*;
class seven 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		char a;
		int i;
		int array[] = new int[5];
		int choice;
		int sum=0;  //sum of all elements
		int sum1;  //sum of alternate elements
		int largest;
		int max=array[0];
		int smallest;
		int count=0;  //count of even numbers
		int count1=0;  //no. of same elements
		int frequency=0;
		do
		{
			System.out.println("please enter the elements one by one :");
			for(i=0;i<5;i++)
			{
				System.out.println("enter element "+(i+1)+ ":");
				array[i]=in.nextInt();
			}
			System.out.println("select anyone from the following options :");
			System.out.println("1 to see the elements ");
			System.out.println("2 to sum all elements ");
			System.out.println("3 to see largest number ");
			System.out.println("4 to see smallest number ");
			System.out.println("5 to see 2nd largest number ");
			System.out.println("6 to sum alternate elements ");
			System.out.println("7 to count even numbers ");
			System.out.println("8 to see occurence and its frequency ");
			System.out.println("Enter your choice :");
			choice = in.nextInt();
			switch(choice)
			{
				case(1):{
					System.out.println("array is :");
					for(i=0;i<5;i++){
						System.out.println(array[i]);}
						break;
					}
					case(2):{
						for(i=0;i<5;i++){
							sum=sum+array[i];
						}
						System.out.println(sum);
						break;
					}
					case(3):{
						largest=array[0];
						for(i=0;i<5;i++){
							if(largest<array[i]){
								largest=array[i];}}
								System.out.println("largest element of the array is :");
								System.out.println(largest);
								break;
							}
							case(4):{
								smallest=array[0];
						for(i=0;i<5;i++)
						{
							if(array[i]<smallest)
							{
								smallest=array[i];
							}
						}
								System.out.println("smallest element of the array is :");
								System.out.println(smallest);
								break;
							}
							case(5):{
								largest=array[0];
					for(i=0;i<5;i++){
							if(largest<array[i]){
								max=array[i];}}
					for(i=0;i<5;i++){
							if(array[i]>max && array[i]<largest){
								max=array[i];}}
							System.out.println("Second Largest element is :");
							System.out.println(max);
						break;
							}
							case(6):{
								sum1=array[0]+array[2]+array[4];
								System.out.println("sum of alternate elements is :"+sum1);
								break;
							}
							case(7):{
								for(i=0;i<5;i++){
									if(array[i]%2==0){
										count++;
									}
								}
								System.out.println("even numbers are : "+count);
								break;
							}
							case(8):{
								System.out.println("please enter whose frequency you want to know :");
								frequency=in.nextInt();
								for(i=0;i<5;i++){
									if(array[i]==frequency){
										count1++;
									}
								}
								System.out.println("frequency is : "+count1);
							}
							break;
						}
						System.out.println("press n if you want to exit or press any key to continue");
						a=in.next().charAt(0);
						}
						while(a!='n');
					}
					}
