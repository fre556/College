
public class MyMobilePhoneChecker {
	public static Exception NotMyPhoneMakeException;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			checkMyMobilePhoneMake("Nokia");
		}
		catch(NotMyPhoneMakeException e){
			System.out.print("Error, Wrong phone type");
		}
	}
	
	

}
