package com.fvf.threadbasic;

/**
 * 线程基本操作-新建
 * 两种实现方式
 * 
 * @author forj
 *
 */
public class NewThreadTest {

	class MyRunnableThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}

	class MyThread extends Thread{
		
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(){
			@Override
			public void run() {
				System.out.println(11);
			}
		};
		t1.start();
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(22);
			}
			
		});
		t2.start();
	}

}
