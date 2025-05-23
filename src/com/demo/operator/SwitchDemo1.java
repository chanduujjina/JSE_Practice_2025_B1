package com.demo.operator;

public class SwitchDemo1 {
	
	public static void main(String[] args) {
		
		String name = "Sudhakar";
		
		switch (name) {
		case "Sabitha": {
			System.out.println("name:"+name);
			break;
		}
		
		case "Sekhar": {
			System.out.println("name:"+name);
			break;
		}
		
		case "Sudhakar": {
			System.out.println("name:"+name);
			break;
		}
		
		case "Raj": {
			System.out.println("name:"+name);
			break;
		}
		
		default:
			System.out.println("name:"+name);
			break;
		}
	}

}
