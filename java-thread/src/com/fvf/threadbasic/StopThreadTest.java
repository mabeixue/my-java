package com.fvf.threadbasic;

/**
 * 线程的基本操作-终止
 * @author forj
 *
 */
public class StopThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					Thread.yield();
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("interrupted!");
						break;
					}
					Thread.yield();
				}
			}
			
		});
//		t1.stop();
		t1.interrupt();
	}
}
