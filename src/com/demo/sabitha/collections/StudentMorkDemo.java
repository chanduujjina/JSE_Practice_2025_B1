package com.demo.sabitha.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentMorkDemo {
		private StudentMorkDemo(){
		
		}
		
		private static List<Student> list=new ArrayList<>();
		static {
			list.add(Student(1,"sabitha",'A',230,123456789,"FEMLAE"));
		}
		public static List<Student> getList() {
			return list;
		}
		
	
	

}
