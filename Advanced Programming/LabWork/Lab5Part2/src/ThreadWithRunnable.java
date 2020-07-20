
public class ThreadWithRunnable implements Runnable{
	
	int num;
	public ThreadWithRunnable(int a) {
		// TODO Auto-generated constructor stub
		num=a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(num);
	}
	
}
