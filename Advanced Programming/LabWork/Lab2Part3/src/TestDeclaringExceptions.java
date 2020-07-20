
/**
 * @author Flash
 *
 */
import java.io.File;
import java.io.IOException;
public class TestDeclaringExceptions {

	/**
	 * @param args
	 */
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method call
		reverseString(null);
		//this is used to catch the exception thrown from the method.
		try{
			openFile("e");
		}//end try for open file
		catch(IOException e){
			System.out.println(e.getMessage());
		}//end catch for open file
	}//end main
	//method to reverse a string
	public static String reverseString(String s) throws NullPointerException{
		try{
			String reverse= new StringBuffer(s).reverse().toString();
			return reverse;
		}//end try for reverse
		catch(NullPointerException e){
			System.out.println("Error, no input");
			return null;
		}//end catch for reverse
		
		
	}//end reverse string
	//method to open a file
	public static void openFile(String fileName) throws IOException{
		File file = new File(fileName);
		if(file.exists()==false){
			throw new IOException("Error file not found");
		}//end if to throw
		
	}//end open file
	
	
}//end class
