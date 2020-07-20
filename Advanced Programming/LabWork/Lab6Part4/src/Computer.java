
public class Computer extends ElectronicDevice{
	public static double speed;
	public static int memory, size;

	public Computer(String man, double s, int m, int scr) {
		// TODO Auto-generated constructor stub
		super(man);
		Speed(s);
		Memory(m);
		Screen(scr);
	}
	
	public void Speed(double s){
		System.out.println(s + " GHz");
	}
	
	public void Memory(int m){
		System.out.println(m + " Gbs");
	}
	
	public void Screen(int scr){
		System.out.println(scr + " inches");
	}
}
