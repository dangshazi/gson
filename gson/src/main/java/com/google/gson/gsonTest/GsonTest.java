package com.google.gson.gsonTest;

import com.google.gson.Gson;

import junit.framework.TestCase;

public class GsonTest extends TestCase {
	Gson gson = new Gson();
	public void testToJsonObject() {
		//这个测试说明 JsonObject既是使用的是private成员变量，也不要紧
		//还说明 Outerclass内部的INnerClass也可以被Json 化
		OurterClass outerClass = new OurterClass("lmk");
		String json = gson.toJson(outerClass);
		print(json);
		//下面说明 Outerclass内部单独的INnerClass也可以被Json 化
		OurterClass.InnerClass innerClass = outerClass.new InnerClass("innerClass");
		json = gson.toJson(innerClass);
		print(json);
		
		
	}

	public void testFromJson(){
		String str = "{\"s\":\"abc\"}";
		OurterClass outerClass = new OurterClass("lmk");
//		gson.fromJson(str, outerClass.InnerClass);//注意： 无法转换内部类，除非是static Inner Class
	}
	public void testToJsonObjectType() {
		fail("Not yet implemented");
	}

	public void testToJsonJsonElement() {
		fail("Not yet implemented");
	}

	public void testToJsonJsonElementAppendable() {
		fail("Not yet implemented");
	}

	public void print(String s){
		System.out.println(s);
	}
}
