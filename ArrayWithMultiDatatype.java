package com.basicsOfJava;

public class ArrayWithMultiDatatype {

	public static void main(String[] args) {
		
		Object obj[]=new Object[5];
		
		obj[0]="B";
		obj[1]=24;
		obj[2]=31.44;
		obj[3]=true;
		
		System.out.println(obj.length);
		//System.out.println(obj[2]);
		/*for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}*/
		for(Object x:obj){
			System.out.println(x);
		}
		
	}

}
