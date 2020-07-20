
public class Computer {
	public static double speed;
	public static int memory, size;

	public Computer(double s, int m, int scr) {
		// TODO Auto-generated constructor stub
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
	
}//end class
