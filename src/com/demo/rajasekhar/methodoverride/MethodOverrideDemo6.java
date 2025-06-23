package com.demo.rajasekhar.methodoverride;

import java.io.IOException;

public class MethodOverrideDemo6 {

}
class Base6{
	void method ()throws RuntimeException{

	}

}
class Derived6 extends Base6{
	void method () throws IOException
	{

	}
}