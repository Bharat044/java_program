import java.io.File;
public class FileDemo{
	public static void main(String args[]){
		File f= null;
		String strs= "test1.txt";
		try{
			//create new file
			f= new File(strs);
			String a = f.getAbsolutePath();
			//prints Absolute path and length
			System.out.println("\n"+a);
			System.out.println("\nLength =" +f.length() );
		} catch (Exception e){
			//if any I/O error occurs
			e.printStackTrace();
		}
	}
}