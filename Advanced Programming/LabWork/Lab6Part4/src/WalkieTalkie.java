
public class WalkieTalkie extends HandHeldDevice{

	public WalkieTalkie(String m, Double w, int r) {
		super(m, w);
		
		Range(r);
	}
	
	public void Range(int r){
		System.out.println("Range (in km's): " + r);
	}

}
