

// Main Class
public class Multithread {
	public static void main(String[] args) throws InterruptedException
	{
		int n = 8; // Number of threads
		//for (int i = 0; i < n; i++) {
          
			MultithreadingDemo object
				= new MultithreadingDemo();
			object.start();
          
            Thread.sleep(1000);

            MultithreadingDemo object1
				= new MultithreadingDemo();
			object1.start();
            Thread.sleep(100);
          
		//}
	}

    
}
