package com.demo.rajasekhar.methodoverride;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverrideDemo7 {

}
class Base7{
	void method ()throws IOException{

	}

}
class Derived7 extends Base7{
	void method () throws FileNotFoundException

	{

	}
}