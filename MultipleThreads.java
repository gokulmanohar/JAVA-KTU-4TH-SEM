public class MultipleThreads{
	public static void main(String[] args){
		Add t1 = new Add();
		Mul t2 = new Mul();
 
		try {
		t2.start();
		System.out.println("Wait 2000 ms");
		Add.sleep(2000);
		t1.start(); 
		} 
		catch (Exception e) {
		e.printStackTrace();
		}	
	}
}

class Add extends Thread {
	int value;
 
	public void run() {
        value = 1 + 2;
        System.out.println ("Addition : " +value); 
	}
}
 
class Mul extends Thread {
	int value;
 
	public void run() {
        value = 1 * 2;
        System.out.println ("Multiplication : " +value); 
	}
}
