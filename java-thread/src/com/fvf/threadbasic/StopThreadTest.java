package com.fvf.threadbasic;

/**
 * 线程的基本操作-终止
 * Thread.stop 方法不推荐使用，它会释放所有 monitor （锁），会导致多线程问题
 *
 */
public class StopThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					Thread.yield();
					System.out.println("123");
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("interrupted!");
						break;
					}
				}
				try {
					Thread.sleep(10);
					Thread.currentThread().stop();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		t1.start();
		
//		t1.interrupt();
	}
}
