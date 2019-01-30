import java.lang.*;
class Test{
	/*int a;
	int b;
	Test(int a,int b){
	this.a=a;
	this.b=b;
	}
	int Divide(){
	return a/b;
	}
	public static void main(String args[]){
	Test t1= new Test(3,4);
	Test t2= new Test(5,0);*/
	try{
		int x[]=new int[10]; //array has only 10 elements
		a[11] = 9;
		/*int num=Integer.parseInt ("XYZ");
		System.out.println(num); */
		/*String str= null;
		System.out.println(str.length()); */
		/*if(t2.b==0){
			throw new ArithmeticException("value of b cannot be 0");
		}*/
	/*System.out.println(t2.Divide());
	System.out.println("Error");*/
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutOfBounds"); } 
		/*catch(NumberFormatException e){
           System.out.println("NumberFormatException"); }*/
           /*catch(NullPointerException e){
               System.out.println("NullPointerException..");} */
		catch(ArithmeticException e){
	System.out.println(e.getMessage());
	System.out.println(t1.Divide());
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}

	System.out.println("Error");
	}
}