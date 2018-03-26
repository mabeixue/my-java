package com.fvf.threadbasic;

/**
 * 六种状态
 * new
 * runnable
 * blocked
 * waiting
 * time_waiting
 * terminated
 */
public class ThreadState {
	
	public static void main(String[] args) {
		// new 
		System.out.println("new");
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("runnable");
				//waiting time_waiting
				System.out.println("waiting");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("terminated");
			}
		});
		// runnable
		System.out.println("runnable");
		t.start();
		
		
	}
}
