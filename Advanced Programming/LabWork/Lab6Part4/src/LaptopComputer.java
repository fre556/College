
public class LaptopComputer extends Computer{
	static int battery;
	public LaptopComputer(String man, double s, int m, int scr, int b) {
		super(man, s, m, scr);
		setBattery(b);
	}//end laptop computer

	public static void setBattery(int b){
		System.out.println(b + " hours");
	}//end set battery
}
