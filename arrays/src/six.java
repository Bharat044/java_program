import java.util.*;  //main method to print 2D array
class six{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int i;
		int j;
		int row;
		int col;
		int number;
		int array[][] = new int[5][5];
		System.out.println("Enter the number of row and columns");
		row = in.nextInt();
		col=in.nextInt();
		System.out.println("enter the elements one by one");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				number=in.nextInt();
				if(number>99){
					System.out.println("Please enter two digit integer");
					number=in.nextInt();
				}
				array[i][j]=number;
			}
		}
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(array[i][j]%2!=0){
					array[i][j]=array[i][j]*2;
				}
				else{
					continue;
				}
			}
		}
		System.out.println("array is :");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.println(array[i][j]+ "/t/" );
			}
			System.out.println();
		}
	}
}