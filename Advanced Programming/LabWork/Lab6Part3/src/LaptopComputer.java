
public class LaptopComputer extends Computer{
	static int battery;
	public LaptopComputer(double s, int m, int scr, int b) {
		super(s, m, scr);
		setBattery(b);
	}//end laptop computer
	
	public LaptopComputer(double s, int m, int scr){
		super(s, m, scr);
	}

	public static void setBattery(int b){
		System.out.println(b + " hours");
	}//end set battery

}//end class
