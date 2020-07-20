
public class ThreadWithExtends extends Thread{
	String letter;
	
	public ThreadWithExtends(String a) {
		letter = a;
	}

	public void run(){
		System.out.println(letter);	
	}//end run
	
}//end class
