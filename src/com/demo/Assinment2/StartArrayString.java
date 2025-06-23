package com.demo.Assinment2;

public class StartArrayString {
	public static void main(String[] args) {
		String[] arryname=new String[] {"chandu","chari","anand","raju"};
		Startm(arryname);
		
	}
	public static void Startm(String [] arryname) {
		for(int i=0;i<arryname.length;i++) {
			String str=arryname[i];
			if(str.startsWith("ch")) {
				System.out.println(str+" ");
			}
		}
	}

}
