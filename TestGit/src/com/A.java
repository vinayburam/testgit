package com;

public class A {
	
	public void m2() {
		
		System.out.println("M2 method of class A");
	}
	
	public void m3() {
		System.out.println("M3 method of class A");
	}
	
	
	public static void main(String[] args) {
		System.out.println("In Main");
		
		A a = new A();
		a.m2();
	}
}
