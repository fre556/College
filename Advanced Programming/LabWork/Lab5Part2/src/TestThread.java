
public class TestThread {
	public static void main(String[] args){
		int num[] = {1,2,3};
		
		ThreadWithRunnable tr1 = new ThreadWithRunnable(num[0]);
		ThreadWithRunnable tr2 = new ThreadWithRunnable(num[1]);
		ThreadWithRunnable tr3 = new ThreadWithRunnable(num[2]);
		
		for(int i=0;i<10;i++){
			tr1.run();
			tr2.run();
			tr3.run();
		}//end for
		
	}//end main
}//end class
