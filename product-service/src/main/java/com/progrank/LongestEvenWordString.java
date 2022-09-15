package com.progrank;

public class LongestEvenWordString {
	
	public static void main(String args[]) {
		String sentence="Hello Every one MY name is Sriencha and i am willing to change my job.";
		String arr[]=sentence.split(" ");
		String longest="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length() % 2==0) {
				if(arr[i].length()>longest.length()) {
					longest=arr[i];
				}
			}
		}
		System.out.println("longest:"+longest);
		boolean a=true;
		boolean b=false;
		if(a==true && b==true) {
			System.out.println("jjjj");
		}
	}

}
