package com.fvf.threadbasic;

/**
 * 线程基本操作-新建
 * 三种实现方式
 *多个构造函数
 *当传递 runnable 实例 init 方法会首先执行改 runnable 的 run 方法
 * 
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

	class Thread3 extends Thread{
		@Override
		public void run() {
			System.out.println("thread");
		}
	}
}
