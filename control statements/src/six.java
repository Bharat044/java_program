import java.util.*;
class six {
	public static void main(String[] args) { //main method to print whether the entered character is consonant or vowel 
		Scanner in=new Scanner(System.in);
		System.out.println("enter the character");
		String a=in.next().toLowercase();
		boolean uppercase = a.charAt(0) >= 65 && a.charAt(0) <= 90;
		boolean lowercase = a.charAt(0) >= 97 && a.charAt(0) <= 122;
		boolean vowels = a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u");
		if (a.length() > 1)
		{
			System.out.println("Error!.you have entered a special character or a digit enter uppercase or lowercase letter.");
		}
		else if (!(uppercase || lowercase))
		{
			System.out.println("Error!you have entered a special character or a digit Enter uppercase or lowercase letter.");
		}
		else if (vowels)
		{
			System.out.println("Entered character is vowel");
		}
		else
		{
			System.out.println("Entered letter is consonant");
		}
	}
}