import java.io.File;
import java.io.IOException;

/*File io is divided into two , Byte hierarchy and Character hierarchy*/

public class FileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File f = new File("first.txt");
    // this does not create new file 
		//it acts as pointer
      try {
		f.createNewFile();
		System.out.println("New file is created");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
