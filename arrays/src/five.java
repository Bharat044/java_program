import java.util.Scanner;
public class five 
{
	public static void main(String args[]) 
	{
	Scanner scan = new Scanner(System.in);
	int i , j , k , num1 , num2 ,num , rowcounter;  //for loop and limit of loops

	int a[] = new int[10]; // for saving array
	int b[] = new int[10];
	int c[] = new int[20];
	
	System.out.println("please enter the number of elements of array 1");
	num1 = scan.nextInt();
	
	System.out.println("enter the elements of array 1 :");
	for(i=0;i<num1;i++)
	{
	a[i]=scan.nextInt();
    }

	System.out.println("please enter the number of elements of array 2");
	num2 = scan.nextInt();

	System.out.println("enter the element of array 2 :");
	for(i=0;i<num2;i++)
	{
	b[i]=scan.nextInt();
	}
	System.out.println("Merging the arrays...");
	for(i=0; i<num1;i++)
	{
		c[i]=a[i];
	}
	num=num1+num2;
	for(i=0 , k=num1; k<num && i<num2; i++ , k++)
	{
		c[k]=b[i];
	}
	{
		if(c[i]>c[++i])
		{
			int temp = c[i];
			c[i]=c[i++];
			c[++i]=temp;
		}
	}
	System.out.println("now the new array after merging is :");
	for(i=0; i<num; i++)
	{
		System.out.println(c[i] + " ");
	}
}
}

