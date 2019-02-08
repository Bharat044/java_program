import java.io.*;
import java.util.*;
class FileDemo2 {
   public static void main(String[] args) {
      File f = null;
      String temp;
      try {
            f = new File("C:\\program1\\java_program\\file handling\\files\\file.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner in = new Scanner(System.in);
             System.out.print("\nEnter a String or enter exit to exit :");
 	     while(in.hasNext()){
        temp=in.next();
        if(temp.equals("exit")){
          break;
        }
        else
         bout.write(in.nextLine());
         bout.newLine();
        }
        bout.close();
}         
    catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();

      }    } }
