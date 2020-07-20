
public class CreditCard {
	
	String nameOnCard;
	String expiryDate, dateOfIssue;
	int cvnNumber;
	
	public CreditCard(String n, String e, String i, int c){
		Name(n);
		exDate(e);
		issDate(i);
		cvnNumber(c);
	}
	
	public CreditCard(String n, String e, String i){
		Name(n);
		exDate(e);
		issDate(i);
	}
	
	public CreditCard(String n, String e){
		Name(n);
		exDate(e);

	}

	private void cvnNumber(int c) {
		// TODO Auto-generated method stub
		cvnNumber = c;
		System.out.println("cvn Number: " + cvnNumber);
	}

	private void issDate(String i) {
		// TODO Auto-generated method stub
		dateOfIssue = i;
		System.out.println("Issue Date: " + dateOfIssue);
	}

	private void exDate(String e) {
		// TODO Auto-generated method stub
		expiryDate = e;
		System.out.println("Expiry Date: " + expiryDate);
	}

	private void Name(String n) {
		// TODO Auto-generated method stub
		nameOnCard = n;
		System.out.println("Name on Card: " + nameOnCard);
	}
	
	
}
