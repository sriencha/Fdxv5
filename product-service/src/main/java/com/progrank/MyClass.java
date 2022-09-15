package com.progrank;

import java.util.TreeSet;

public class MyClass {
	int max;
	int min;
	public int mymethod(int N,int Arr[]) {
		TreeSet<Integer> tr=new TreeSet<Integer>();
		for(int i=0;i<Arr.length;i++) {
			tr.add(Arr[i]);
		}
		max=tr.last();
		min=tr.first();
		System.out.println("max::::"+max);
		System.out.println("min:::;"+min);
		if(Math.abs(min)>=Math.abs(max)) {
			System.out.println("farest::::"+min);
			return min;
		}else {
			System.out.println("farest::::"+max);
			return max;
			
		}
		
	}
    public static void main(String args[]) {
    	MyClass obj=new MyClass();
    	int Arr[]= {1,2,3,4,5,-5,-6};
    	obj.mymethod(5,Arr);
    }


}
