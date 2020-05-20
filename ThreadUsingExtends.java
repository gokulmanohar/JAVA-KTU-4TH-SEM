// Java code for thread creation by extending 
// the Thread class 
class ThreadUsingExtends extends Thread 
{ 
	public void run() 
	{ 
		try
		{ 
			// Displaying the thread that is running 
			System.out.println ("Thread " +Thread.currentThread().getId() +" is running"); 

		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("An exception is caught"); 
		} 
		
	} 


public static void main(String[] args) 
	{ 
		int n = 3; // Number of threads 
		for (int i=0; i<n; i++) 
		{ 
			ThreadUsingExtends object = new ThreadUsingExtends(); 
			object.start(); 
		} 
	}	


}
