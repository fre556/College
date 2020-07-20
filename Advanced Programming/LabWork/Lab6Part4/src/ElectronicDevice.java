
public abstract class ElectronicDevice {
	public ElectronicDevice(String m){
		Manufacturer(m);
	}
	
	public void Manufacturer(String m){
		System.out.println("Manufacturer: " + m);
	}
}
