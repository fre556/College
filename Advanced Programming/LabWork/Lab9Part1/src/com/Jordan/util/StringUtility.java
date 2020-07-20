package com.Jordan.util;

public class StringUtility {
	public static void getSumOfAcsiiValues(String s){
		int j =s.length();
		int encoded[] = new int[j];
		int Total = 0;
		for(int i=0;i<j;i++){
			char key = s.charAt(i);
			encoded[i] = ((int)key);
		}//end for
		for(int i=0;i<j;i++){
			Total += encoded[i];
		}
		System.out.println("The ASCII sum total of " + s + " is: " + Total);
	}
	public static void getProductOfAcsiiValues(String s){
		int j =s.length();
		int encoded[] = new int[j];
		int Total = 0;
		for(int i=0;i<j;i++){
			char key = s.charAt(i);
			encoded[i] = ((int)key);
		}//end for
		for(int i=0;i<j;i++){
			if(i==0){
				Total += encoded[i];
			}
			else{
				Total *= encoded[i];
			}
			
		}
		System.out.println("The ASCII Product total of " + s + " is: " + Total);
	}
}
