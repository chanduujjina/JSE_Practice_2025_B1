package com.demo.exception.handler;

public class OrderOfBlocksDemo2 {

	public static void main(String[] args) {

		try {

			int result = 1 / 0;
		}

		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		catch (RuntimeException resx) {

		}

		catch (Exception ex) {

		}
		
		catch (Throwable ex) {

		}
	}

}
