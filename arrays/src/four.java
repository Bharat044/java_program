import java.util.*;
class four {
	static Scanner in=new Scanner(System.in);
	static int i;
	static boolean flag;
	static int k;
	static int n;
	static int arr[]=new int[5];
	static void array(){
		for(i=0;i<5;i++){
	        System.out.println("Enter element["+(i+1)+"]:" );
	        n = in.nextInt();
	        while(true) {
			if(n>9 && n<101){
			    break;
			}
			System.out.println("Enter integer between 10 - 100:");  //check validity
			n = in.nextInt();
	}
	flag=false;
		for (int k=i-1;k>=0;k--) {            
			if(n==arr[k]){                      //Compare already filled array elements
				System.out.println("Duplicate entry");
		            	flag=true;
			}

}
if(flag==true){
			i=i-1;
			continue;
			}
			 arr[i]=n;
		System.out.println("===================");
		for(int k=0;k<=i;k++){       //Array printing
	        	System.out.print(arr[k]+" ");
}
}
}
public static void main(String args[]){
				array();
			}
		}