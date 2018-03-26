package com.fvf.threadbasic;

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
	}
}
