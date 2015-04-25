package com.chou.bo;

public class Test1 {

	public static void main(String[] args) {
		String str = "adsd234Lsdf64345235";
		String str1 = str.replaceAll("[^a-zA-Z]", "");
		String str2 = str.replaceAll("[^0-9]", "");
		System.out.println(str1);
		System.out.println(str2);
	}
	
	
}
