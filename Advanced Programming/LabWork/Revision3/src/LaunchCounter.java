
public class LaunchCounter {
	public static void main(String args[]){
		new LaunchCounter();
	}
	
	public LaunchCounter(){
		CounterThread.start();
	}
}
