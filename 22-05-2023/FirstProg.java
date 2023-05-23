package com.del;

class Method{
	
	int c = 8;
	int d = 2;
	
	public void mul() {
		int a = 8;
		int b = 9;
		System.out.println(a*b);
	}
	
	public void div() {
		Method m1 = new Method();
		System.out.println(m1.c / m1.d);
	}
}

public class FirstProg {
	
	public static void main(String[] args) {
		Method m = new Method();
		m.mul();
		m.div();
	}
}
