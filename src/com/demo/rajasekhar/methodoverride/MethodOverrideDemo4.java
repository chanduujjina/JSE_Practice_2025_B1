package com.demo.rajasekhar.methodoverride;

public class MethodOverrideDemo4 {

}

class Base4{
	void method ()throws NullPointerException{
	}
}
class Derived4 extends Base4{
	void method () throws RuntimeException
	{

	}
}