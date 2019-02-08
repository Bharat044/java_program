import java.util.*;
import java.io.*;
class one{
	void list(){
    File f = null;
      String temp;
      try {
            f = new File("C:\\program1\\java_program\\file handling\\files\\file.txt");
            FileWriter SNo = new FileWriter(f);
            BufferedWriter S= new BufferedWriter(SNo);
	     Scanner s = new Scanner(System.in);
	        FileWriter FName = new FileWriter(f);
            BufferedWriter F= new BufferedWriter(FName);
	     Scanner s = new Scanner(System.in);
	        FileWriter CGPA = new FileWriter(f);
            BufferedWriter C= new BufferedWriter(CGPA);
	     Scanner s = new Scanner(System.in);
	        FileWriter Grade = new FileWriter(f);
            BufferedWriter G= new BufferedWriter(Grade);
	     Scanner s = new Scanner(System.in);
             System.out.print("\nEnter a String or enter exit to exit :");
 	     while(s.hasNext()){
        temp=s.next();
        if(temp.equals("exit")){
          break;
        }
        else
        	S.write(in.nextLine());
            S.newLine();
            F.write(in.nextLine());
            F.newLine();
            C.write(in.nextLine());
            C.newLine();
            G.write(in.nextLine());
            G.newLine();
        }
         S.close();
         F.close();
         C.close();
         G.close();
    } 
    catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}
}