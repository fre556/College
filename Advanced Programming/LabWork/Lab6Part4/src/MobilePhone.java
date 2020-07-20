
public class MobilePhone extends HandHeldDevice{

	public MobilePhone(String m, Double w, String n) {
		super(m, w);
		
		Network(n);
	}
	
	public void Network(String n){
		System.out.println("Network: " + n);
	}
}
