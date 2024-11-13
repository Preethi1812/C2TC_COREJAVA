package com.tnsif.daythree.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String args[]) {
		OopsConceptDemo obj = new OopsConceptDemo();
		obj.setSerialNum(101);
		obj.setName("Pooja");
		obj.setAge(20);
		System.out.println(obj); // because of toString() method we get output as OopsConceptDemo [serialNum=101, name=Pooja, age=20]
		obj.getAge();
		obj.getName();
		obj.getSerialNum();
		System.out.println(obj);
		System.out.println(obj.toString());
	}
	

}
