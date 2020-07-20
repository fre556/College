
public class EchoToWorld {

	public static void main(String[] args) {
		new EchoToWorld();

	}//end main
	
	public EchoToWorld(){
		String echo;
		echo = sayHello();
		System.out.print(echo);
	}//end echo
	
	public String sayHello(){
		String hello = "Hello";
		return hello;
	}//end sayHello

}//end class
