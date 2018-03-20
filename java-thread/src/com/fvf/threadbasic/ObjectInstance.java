package com.fvf.threadbasic;

/**
 * java 实例化对象方法
 * 
 * @author forj
 * 
 */
public class ObjectInstance  implements Cloneable{
	private String name = "11";

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "ObjectInstance [name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// new 关键字
	// 反射
	// 调用工厂方法
	// 调用对象的 clone 方法
	// 反序列化
	public static void main(String[] args) {
		// 反射
		try {
			Class<?> forName = Class.forName("com.fvf.threadbasic.ObjectInstance");
			ObjectInstance newInstance = (ObjectInstance)forName.newInstance();
			System.out.println(newInstance.getName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		//  clone
		ObjectInstance obj1 = new ObjectInstance();
		System.out.println(obj1);
		try {
			Object clone = obj1.clone();
			System.out.println("Copy of  obj:" + clone );
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//反序列化
	}
}
