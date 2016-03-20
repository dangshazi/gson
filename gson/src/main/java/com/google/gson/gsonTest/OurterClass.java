package com.google.gson.gsonTest;

public class OurterClass {
	
	private String s;
	private InnerClass inner;
	public OurterClass(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
		inner = new InnerClass("innerClass");
	}

	
	public class InnerClass{
		private String s;
		public InnerClass(String s) {
			// TODO Auto-generated constructor stub
			this.s = s;
		}
	}
}
