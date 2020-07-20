
public class TestMultipleCatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			for(int i=0;i<2;i++){
				int[] ages = new int[2];
				if(i==0){
					for(int j=0;j<4;j++){
						ages[j] = j;
					}//end for to create array error
					
				}//end if for array
				else if(i==1){
					String s ="s";
					@SuppressWarnings("unused")
					int a = Integer.parseInt(s);
				}//end if for string
			}//end for
		}//end try
		
		catch(NumberFormatException e){
			System.out.println("Error, this is not a number");
			e.printStackTrace();
		}//catch for not a number
		//formatting exception
		//catch out of bounds array
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error, Array out of bounds");
			e.printStackTrace();
		}//end catch for array out of bounds
		//exception
		catch(Exception e){
			e.printStackTrace();
		}//end catch for exception
	}//end main

}//end class
