package com.demo.Assinment1;
public class Frequencyarrya {
	public static void main(String args[]) {
		String str="sabitha";
		char[] cr=str.toCharArray();
		for(int i=0;i<cr.length;i++) {
			int count=0;
			for(int j=0;j<cr.length;j++) {
				if(cr[i]==cr[j]) {
					count++;
				}
			}
			System.out.println(cr[i]+"->"+count);
		}
		
	}

}
