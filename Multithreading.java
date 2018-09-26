package Assignment;


public class Multithreading {
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.start();
		
		B obj2 = new B();
		obj2.start();
		
		C obj3 = new C();
		obj3.start();
     }
}
	
	class A extends Thread
	{
		public void show()
		{
			for(int i=1;i<=5;i++) 
			{
				System.out.println("I");
				
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
			}
		}
		public void run() {
			show();
		}
	}

	class B extends Thread
	{
		public void show()
		{
			for(int i=1;i<=5;i++) 
			{
				System.out.println("Love");
				
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
			}
		}
		public void run() {
			show();
		}
	}

	class C extends Thread
	{
		public void show()
		{
				for(int i=1;i<=5;i++) {
					System.out.println("You");
					
					try {Thread.sleep(1000); }catch(Exception e) {}
				}
			}
		public void run() {
			show();
		}
	}

