
public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		String name="";
		
		try{
			for(int i=1;i<num;i++){
				num *= i;
			}//end for loop
		}
		catch(ArrayIndexOutOfBoundsException e){
			try{
				System.out.println("Error, Array out of bounds");
				e.printStackTrace();
				@SuppressWarnings("unused")
				int a = Integer.parseInt(name);
			}//end nested try
			catch(NumberFormatException f){
				System.out.println("Error, name not number");
				f.printStackTrace();
			}//end nested catch
		}//end catch
	}//end main method

}//end class
