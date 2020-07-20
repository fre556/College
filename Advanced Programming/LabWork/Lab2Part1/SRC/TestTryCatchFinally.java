/**
 * 
 */

/**
 * @author B00018189
 *
 */
public class TestTryCatchFinally {

	/**
	 * @param args
	 */
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			String s = null;
			s.toString();
			
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		finally{
			System.out.print("Finally");
		}

	}

}
