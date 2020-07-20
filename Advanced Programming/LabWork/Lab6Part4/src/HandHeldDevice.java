
public abstract class HandHeldDevice extends ElectronicDevice{

	public HandHeldDevice(String m, Double w) {
		super(m);
		// TODO Auto-generated constructor stub
		Weight(w);
	}
	
	public void Weight(Double w){
		System.out.println("Weight: " + w);
	}

}
