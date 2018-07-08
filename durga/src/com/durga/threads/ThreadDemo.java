package com.durga.threads;
class MyThread extends Thread
   {
	public void run()
	 {
		for(int i=0;i<10;i++)
		{
		
			System.out.println("child thread");
	
		}
	 }
	}
 class ThreadDemo 
 {

	public static void main(String[] args) 
	{
		MyThread t=new MyThread(); // instantiation of thread
		t.run();                 // starting of a thread
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
	
		}

	}

}
