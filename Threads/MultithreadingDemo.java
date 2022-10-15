// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
   public static boolean config = true;
    
    /**
     * @return
     */
    public boolean setconfig()
    {
       config=!config;
       System.out.println(config);
        return config;
        
    }
   
	public void run()
	{
		try {
			// Displaying the thread that is running
            System.out.println(config);
            config=!config;
            System.out.println(config);
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
            if (config=true)
            {
                System.out.println("Configurations are enabled");
            }
            else
            if (config=false)
            {
                System.out.println("Configurations are disabled");
            }

		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

