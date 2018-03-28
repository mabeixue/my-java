package com.fvf.designpattern;

/**
 * 设计模式之单例模式 构造方法是 private ，避免意外创建多余实例（有疑问，其它实例化方法）
 */
public class Singleton {

	// 私有化构造方法
	private Singleton() {
	}
	// 最简单高效的实现方式

	//私有化 instance1 保证改变量的安全性
	//因工厂方法必须是 static 的，因此对应的 instance 也必须是 static。
	private static Singleton instance1 = new Singleton();
	
	//返回 instance1 实例，没有锁的操作，在并行程序中有较好的表现
	public static Singleton getInstance1() {
		return instance1;
	}

	/*
	 * 上述方式存在的问题：
	 * 对于静态成员 instance1，它会在类第一次初始化的时候被创建。
	 * 这个时候并不一定是 getInstance1() 方法第一次调用 
	 */
	
	private static Singleton instance2 = null;
	
	public static synchronized Singleton getInstance2() {
		
		if (instance2 == null) {
			instance2 = new Singleton();
		}
		return instance2;
	}
	
	//3
	private static class SingletonHandler{
		private static Singleton instance = new Singleton();
	} 
	
	public static Singleton getInstance3() {
		return SingletonHandler.instance;
	}
}
