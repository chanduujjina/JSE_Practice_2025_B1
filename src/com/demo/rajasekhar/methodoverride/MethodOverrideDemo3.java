package com.demo.rajasekhar.methodoverride;

public class MethodOverrideDemo3 {

}

class Base3{
	void method ()throws NumberFormatException{
	}

}
class Derived3 extends Base3{
	void method () throws IllegalArgumentException
	{

	}
}