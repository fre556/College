
public class TestThread {
	public static void main(String[] args){
		String[] letter = {"A","B","C"};
		ThreadWithExtends tw1 = new ThreadWithExtends(letter[0]);
		ThreadWithExtends tw2 = new ThreadWithExtends(letter[1]);
		ThreadWithExtends tw3 = new ThreadWithExtends(letter[2]);
		tw1.start();
		tw2.start();
		tw3.start();
		
		for(int i=0;i<10;i++){
			tw1.run();
			tw2.run();
			tw3.run();
		}
		
		
			
		
	}//end main method
	
	
}//end class
