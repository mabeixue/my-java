package com.fvf.threadbasic;

/**
 * 调用 Thread 对象 run 或者 start 方法的区别：
 * <p>
 * 	1. 调用 run 方法表示在当前线程执行 run 方法
 * 	2. 调用 start 方法会开启新线程来执行 run 方法
 * 
 * </p>
 *
 */
public class RunOrStart {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		}, "haha");
		//run 再当前线程内执行 run 方法
		// result： main
		t.run();
		// start 创建新线程 并执行 run 方法
		t.start();
		t.start();//IllegalThreadStateException
	}
}
